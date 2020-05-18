package nenu.edu.cn;


/**
 * 这个类中定义字段
 * @author xy
 * @version 1.2
 */

public class Student {
    private int number;
    private String name;
    private int age;
    private int schoolnumber;


    public int getNumber() {

        return number;
    }

    public void setNumber(int number) {

        this.number = number;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public int getSchoolnumber() {

        return schoolnumber;
    }

    public void setSchoolnumber(int python) {

        this.schoolnumber = schoolnumber;
    }



    public String toString(){ //学生信息
        String str="\t\t"+this.number+"\t\t"+this.name+"\t\t"+this.age+"\t\t"+this.schoolnumber;

        return str;
    }
}//Student

