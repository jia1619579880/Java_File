package com.newDogandCat;

public class DogandCatDemo {
    public static void main(String[] args) {
        Animal dog = new Dog("coco", 3);
        System.out.println(dog.getName() + "," + dog.getAge());
        dog.Eat();

        Animal cat1 = new Cat("小白", 1);
        System.out.println(cat1.getName() + "," + cat1.getAge());

        Animal cat2 = new Cat();
        cat2.setName("tata");
        cat2.setAge(3);
        System.out.println(cat2.getName() + "," + cat2.getAge());
        cat1.Eat();
    }
}
