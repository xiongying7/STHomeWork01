package nenu.edu.cn;



/**
 * 这个类中实现查找、插入、删除、添加、更新学生
 * @author xy
 * @version 1.2
 */

public class StudentManager {
    static String msg="\t\t编号\t\t姓名\t\t年龄\t\t学号";
    //功能菜单：
    public void menu(){
        System.out.println("-----请选择你要执行的功能-----");
        System.out.println("1:添加一个学生");
        System.out.println("2:查找一个学生");
        System.out.println("3:根据学生编号更新学生基本信息");
        System.out.println("4:根据学生编号删除学生");
        System.out.println("5:退出系统");
        System.out.println("----------------------------");
    }

    //返回数组中元素为空的下标
    public int index(Student[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==null){
                return i+1;//新学生的编号
            }
        }
        return 999; //学生已满员
    }

    //打印所有学生的信息
    public void print(Student[] arr){
        System.out.println(msg);
        for (Student student : arr) {
            if (student != null) {
                System.out.println(student);
            }
        }
    }

    //添加学生
    public void create(String name,int age,Student[] arr){
        int index=index(arr);  //获取新学生的位置
        if(index!=999) { //如果还有空位置，可以添加学生
            Student stu = new Student();
            stu.setName(name);
            stu.setAge(age);
            stu.setNumber(index);
            arr[index] = stu;
            System.out.println("添加学生成功");
            this.print(arr);
        }else{
            System.out.println("班级学生已满，无法再添加学生了");
        }
    }
    //查找学生
    public void select(int number,Student[] arr){
        for (Student student : arr) {
            if (student != null) {
                if (student.getNumber() == number) {
                    System.out.println(msg);
                    System.out.println(student);
                    return;
                }
            }
        }
        System.out.println("没有这个编号的学生");
    }
    //12：根据编号更新学生
    public void update(int number,String name,int age,Student[] arr){
        for (Student student : arr) {
            if (student != null) {
                if (student.getNumber() == number) {
                    student.setName(name);
                    student.setAge(age);
                    System.out.println("更新学生信息成功");
                    this.print(arr);
                    return;
                }
            }
        }
        System.out.println("没有这个学生");
    }

    //根据编号删除学生
    public void delete(int number,Student[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=null){
                if(arr[i].getNumber()==number){
                    arr[i]=null;
                    System.out.println("删除成功");
                    this.print(arr);
                    return;
                }
            }
        }
        System.out.println("没有这个编号的学生");
    }

    //根据编号录入学生
    public void input(int number, int schoolnumber,Student[] arr){
        for (Student student : arr) {
            if (student != null) {
                if (student.getNumber() == number) {
                    arr[number].setSchoolnumber(schoolnumber);
                    System.out.println("录入学号成功");
                    this.print(arr);
                    return;
                }
            }
        }
        System.out.println("不存在这个学生");
    }


}  //StudentManager


