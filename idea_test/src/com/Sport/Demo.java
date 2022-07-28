package com.Sport;

import java.util.concurrent.Callable;

public class Demo {
    public static void main(String[] args) {
        Athlete basketAth = new BasketballAth();
        basketAth.setName("James");
        basketAth.setAge(32);
        System.out.println(basketAth.getName() + "," + basketAth.getAge());
        basketAth.study();
        basketAth.eat();
        System.out.println();

        Athlete pingPongAth = new PingPongAth();
        pingPongAth.setName("Malong");
        pingPongAth.setAge(23);
        System.out.println(pingPongAth.getName() + "," + pingPongAth.getAge());
        pingPongAth.study();
        pingPongAth.eat();
        ((PingPongAth)pingPongAth).English();
        System.out.println();

        Coach basketcoach = new BasketballCoach();
        basketcoach.setName("John");
        basketcoach.setAge(29);
        System.out.println(basketcoach.getName()+","+basketcoach.getAge());
        basketcoach.teach();
        basketcoach.eat();
        System.out.println();

        Coach pingPongCoa = new PingpongCoach();
        pingPongCoa.setName("Jackson");
        pingPongCoa.setAge(28);
        System.out.println(pingPongCoa.getName()+","+pingPongCoa.getAge());
        pingPongCoa.teach();
        pingPongCoa.eat();
        ((PingpongCoach)pingPongCoa).English();
        System.out.println();


    }
}
