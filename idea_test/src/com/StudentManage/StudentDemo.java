package com.StudentManage;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {
        int choose;
        ArrayList<Student> array = new ArrayList<Student>();
        Scanner sc = new Scanner(System.in);

        do {
            menu();
            System.out.println("请输入你的选择:");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    addStudent(array);
                    break;
                case 2:
                    deleteStudent(array);
                    break;
                case 3:
                    updateStudent(array);
                    break;
                case 4:
                    findAllStudent(array);
                    break;
                case 5:
                    System.out.println("谢谢使用！");
                    System.exit(0);
                    break;
                default:
                    System.out.println("输入错误，请重新输入！");
            }
        } while (true);

    }

    public static void menu() {
        System.out.println("-----欢迎来到学生管理系统-----");
        System.out.println("1.添加学生");
        System.out.println("2.删除学生");
        System.out.println("3.修改学生信息");
        System.out.println("4.查看学生全部信息");
        System.out.println("5.退出");
    }

    public static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        String id;
        while (true) {
            System.out.println("输入学生的学号：");
            id = sc.nextLine();
            boolean flag = isUsed(array, id);
            if (flag == true) {
                System.out.println("你输入的学号已经被占用，请重新输入");
            } else {
                break;
            }
        }
        System.out.println("输入学生的名字：");
        String name = sc.nextLine();
        System.out.println("输入学生的年龄：");
        String age = sc.nextLine();
        System.out.println("输入学生的地址：");
        String address = sc.nextLine();
        Student s = new Student();
        s.setId(id);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);
        array.add(s);
    }

    public static boolean isUsed(ArrayList<Student> array, String id) {
        boolean flag = false;

        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getId().equals(id)) {
                flag = true;
                break;
            }
        }

        return flag;
    }

    public static void deleteStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除学生的学号:");
        String id = sc.nextLine();
        int index = -1;
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getId().equals(id)) {
                index = i;
                break;
            }

        }
        if (index == -1) {
            System.out.println("改信息不存在，请重新输入！");
        } else {
            array.remove(index);
            System.out.println("删除成功！");
        }
    }

    public static void updateStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改学生的学号:");
        String id = sc.nextLine();
        System.out.println("输入学生的新名字：");
        String name = sc.nextLine();
        System.out.println("输入学生的新年龄：");
        String age = sc.nextLine();
        System.out.println("输入学生的新地址：");
        String address = sc.nextLine();

        Student s = new Student();
        s.setId(id);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);
            if (student.getId().equals(id)) {
                array.set(i, s);
                break;
            }
        }

        System.out.println("修改成功！");
    }

    public static void findAllStudent(ArrayList<Student> array) {
        int i;
        if (array.size() == 0) {
            System.out.println("无信息，请添加信息后再查询");
        } else {
            System.out.println("学号\t\t\t名字\t\t年龄\t\t地址");
            for (i = 0; i < array.size(); i++) {
                Student s = array.get(i);
                System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getAge() + "岁\t\t" + s.getAddress());
            }
        }
    }
}
