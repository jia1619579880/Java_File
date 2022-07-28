package com.InterfaceDogandCat;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal cat1 = new Cat();
        cat1.setName("小白");
        cat1.setAge(2);
        System.out.println(cat1.getName() + "," + cat1.getAge());
        cat1.eat();
        cat1.jump();
        System.out.println();

        Animal cat2 = new Cat("小黑", 3);
        System.out.println(cat2.getName() + "," + cat2.getAge());
        cat2.eat();
        cat2.jump();
        System.out.println();

        Animal dog1 = new Dog();
        dog1.setName("小黄");
        dog1.setAge(4);
        System.out.println(dog1.getName() + "," + dog1.getAge());
        dog1.eat();
        dog1.jump();
        System.out.println();

        Animal dog2 = new Dog("小红", 6);
        System.out.println(dog2.getName() + "," + dog2.getAge());
        dog2.eat();
        dog2.jump();
        System.out.println();
    }
}
