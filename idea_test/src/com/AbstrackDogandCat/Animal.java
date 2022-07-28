package com.AbstrackDogandCat;

public abstract class Animal {
    private String name;
    private int age;
    //无参构造器
    public Animal(){}
    //有参构造器
    public Animal(String name,int age){
        this.name=name;
        this.age=age;
    }
    //封装
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    //抽象方法，调用的时候要重写
    public abstract void eat();
}
