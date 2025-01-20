package dev.study.정적팩토리.exam;

/**
 * 하위 클래스 반환
 * 문제: 다양한 타입의 동물을 생성하는 AnimalFactory를 설계하라
 * - 동물 인터페이스 :  Animal(메서드: speak())
 * - 구현 클래스: Dog, Cat, Bird
 * - AnimalFactory 에서 각 동물 객체를 반환하는 정적 팩토리 메서드를 작성하라.
 */

interface Animal {
    void speak();
}

class Dog implements Animal{

    @Override
    public void speak() {
        System.out.println("Speaking a Dog sound");
        System.out.println("wall wall");
    }
}

class Cat implements Animal{

    @Override
    public void speak() {
        System.out.println("Speaking a Cat sound");
        System.out.println("meow meow");
    }
}

class Bird implements Animal{

    @Override
    public void speak() {
        System.out.println("Speaking a Bird sound");
        System.out.println("kki look kki look");
    }
}

class AnimalFactory{
    public static Animal createDog(){ return new Dog(); }
    public static Animal createCat(){ return new Cat(); }
    public static Animal createBird(){ return new Bird(); }
}

public class Main {

    public static void main(String[] args){
        Animal dog = AnimalFactory.createDog();
        Animal cat = AnimalFactory.createCat();
        Animal bird = AnimalFactory.createBird();

        dog.speak();
        cat.speak();
        bird.speak();
    }
}