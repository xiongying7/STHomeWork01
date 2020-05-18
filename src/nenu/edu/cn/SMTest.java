package nenu.edu.cn;

import java.util.Scanner;

/**
 * 这个类在其main中执行StudentManager中的方法及退出功能
 * @author xy
 * @version 1.2
 */


public class SMTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请定义学生人数");
        int stuNum=sc.nextInt(); //定义学生人数
        Student[] stuArr=new Student[stuNum]; //定义一个学生数组
        StudentManager admin=new StudentManager(); //定义一个管理对象，用来调用管理学生的方法
        while(true){
            admin.menu();//功能菜单
            int number=sc.nextInt();  //选择的菜单选项
            if(number==1){ //添加一个学生
                System.out.println("请输入学生姓名");
                String name=sc.next();
                System.out.println("请输入学生年龄");
                int age=sc.nextInt();
                admin.create(name,age,stuArr);
            }else if(number==2){//查找一个学生
                System.out.println("请输入你要查找的学生的编号");
                int num=sc.nextInt();
                admin.select(num,stuArr);
            }else if(number==3){//根据学生编号更新学生基本信息
                System.out.println("请输入你要更新的学生的编号");
                int num=sc.nextInt();
                System.out.println("请输入学生姓名");
                String name=sc.next();
                System.out.println("请输入学生年龄");
                int age=sc.nextInt();
                admin.update(num,name,age,stuArr);
            }else if(number==4){//根据学生编号删除学生
                System.out.println("请输入你要删除的学生编号");
                int num=sc.nextInt();
                admin.delete(num,stuArr);
            }else if(number==5){//退出系统
                System.exit(0);
            }else{
                System.out.println("请重新输入");
            }
        }//while
    }//main

}//SMTest


