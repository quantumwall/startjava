package com.startjava.lesson_2_3.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger gipsy = new Jaeger();
        gipsy.setMark("Mark-3");
        gipsy.setOrigin("USA");
        gipsy.setHeight(79.25);
        gipsy.setWeight(1.98);
        gipsy.setStrength(8);
        gipsy.setSpeed(7);
        gipsy.setArmor(6);
        System.out.println(gipsy);
        gipsy.drift();
        gipsy.move();
        gipsy.attack();
        Jaeger striker = new Jaeger("Mark-5", "Australia", 76.2,
            1.85, 10, 10, 9);
        System.out.println(striker);
        striker.drift();
        striker.move();
        striker.attack();
        striker.setSpeed(8);
        striker.setWeight(1.9);
        System.out.println(striker);
    }
}
