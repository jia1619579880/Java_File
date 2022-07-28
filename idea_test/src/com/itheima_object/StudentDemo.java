package com.itheima_object;
import java.util.Scanner;
import java.util.ArrayList;

public class StudentDemo {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();
        addStudent(array);
        addStudent(array);
        addStudent(array);

        for(int i = 0;i<array.size();i++){
            Student s = array.get(i);
            System.out.println(s.getName()+","+s.getAge());
        }


    }
    public static void addStudent(ArrayList<Student> array){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入学生的名字：");
        String name = sc.nextLine();
        System.out.println("输入学生的年龄：");
        String age = sc.nextLine();
        Student s = new Student();
        s.setName(name);
        s.setAge(age);
        array.add(s);

    }

}
