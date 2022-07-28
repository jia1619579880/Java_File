package com.newDogandCat;

public class Cat extends Animal{
    public Cat(){}
    public Cat(String name,int age){
        super(name, age);
    }

    @Override
    public void Eat() {
        System.out.println("猫吃鱼");
    }
}
