package com.Sport;

public class PingPongAth extends Athlete implements English{
    @Override
    public void study() {
        System.out.println("学习乒乓球");
    }

    @Override
    public void eat() {
        System.out.println("吃饭");
    }

    @Override
    public void English() {
        System.out.println("学英语");
    }
}
