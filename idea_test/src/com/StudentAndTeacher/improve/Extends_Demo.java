package com.StudentAndTeacher.improve;

public class Extends_Demo {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setName("oliver");
        t1.setAge(24);
        System.out.println(t1.getName() + "," + t1.getAge());
        t1.teach();
        Teacher t2 = new Teacher("mike", 44);
        System.out.println(t2.getName() + "," + t2.getAge());
        t2.teach();
        Student s1 = new Student();
        s1.setName("daming");
        s1.setAge(12);
        System.out.println(s1.getName() + "," + s1.getAge());
        s1.study();
        Student s2 = new Student("john",23);
        System.out.println(s1.getName() + "," + s1.getAge());
        s2.study();
    }

}
