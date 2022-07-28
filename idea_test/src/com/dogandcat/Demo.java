package com.dogandcat;

public class Demo {
    public static void main(String[] args) {
        cat c1 = new cat();
        c1.setName("豆浆");
        c1.setAge(2);
        System.out.println(c1.getName()+","+c1.getAge());
        c1.catchMice();

        cat c2 = new cat("coco",3);
        System.out.println(c2.getName()+","+c2.getAge());
        c2.catchMice();

        dog d1 = new dog();
        d1.setName("阿黄");
        d1.setAge(5);
        System.out.println(d1.getName()+","+d1.getAge());
        d1.watchingDog();

        dog d2 = new dog("mike",10);
        System.out.println(d2.getName()+","+d2.getAge());
        d2.watchingDog();
    }
}
