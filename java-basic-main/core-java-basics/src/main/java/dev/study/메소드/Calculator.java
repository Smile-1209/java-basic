package dev.study.메소드;

public class Calculator {
    private final String name;

    public Calculator(String name) {
        this.name = name;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.sound();
    }
}

class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("cat is mew mew");
    }
}

