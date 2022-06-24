package com.startjava.lesson_2_3.animal;

public class Wolf {
    
    private String gender;
    private String alias;
    private int age;
    private int weight;
    private String color;

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
    
    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getAlias() {
        return alias;
    }

    public void setAge(int age) {
        if(age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void howl() {
        System.out.println("Воет");
    }

    public void sit() {
        System.out.println("Сидит");
    }

    public void walk() {
        System.out.println("Идет");
    }

    public void run() {
        System.out.println("Бежит");
    }

    public void hunt() {
        System.out.println("Охотится");
    }
}
