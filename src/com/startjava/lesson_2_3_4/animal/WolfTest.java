package com.startjava.lesson_2_3_4.animal;

public class WolfTest {
    
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setGender("male");
        wolf.setAlias("bloody beast");
        wolf.setAge(3);
        wolf.setWeight(25);
        wolf.setColor("gray");
        System.out.println("Кличка: " + wolf.getAlias());
        System.out.println("Пол: " + wolf.getGender());
        System.out.printf("Возраст: %d лет\n", wolf.getAge());
        System.out.printf("Вес: %d кг\n", wolf.getWeight());
        System.out.println("Окрас: " + wolf.getColor());
        wolf.sit();
        wolf.howl();
        wolf.walk();
        wolf.run();
        wolf.hunt();
    }
}
