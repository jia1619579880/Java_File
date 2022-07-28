package com.Sport;

public class BasketballCoach extends Coach {
    @Override
    public void teach() {
        System.out.println("教篮球");
    }

    @Override
    public void eat() {
        System.out.println("吃饭");
    }
}
