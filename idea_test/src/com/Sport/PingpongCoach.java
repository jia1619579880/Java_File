package com.Sport;

public class PingpongCoach extends Coach implements English {
    @Override
    public void teach() {
        System.out.println("教乒乓球");
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
