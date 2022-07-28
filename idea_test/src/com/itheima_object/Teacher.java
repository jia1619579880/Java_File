package com.itheima_object;

public class Teacher {
    private String name;
    private int age;
    private int teachage;
    private String course;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public void setTeachage(int teachage){
        this.teachage=teachage;
    }
    public int getTeachage(){
        return teachage;
    }
    public void setCourse(String course){
        this.course=course;
    }
    public String getCourse(){
        return course;
    }
    public void say(){
        System.out.println("Teacher: " + name + "," + age + "," + teachage + "," + course);
    }



}
