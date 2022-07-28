package com.InterfaceDogandCat;

public abstract class Animal implements Jumpping {
    private String name;
    private int age;
    public Animal(){}
    public Animal(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public abstract void eat();
}
