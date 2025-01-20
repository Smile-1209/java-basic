package dev.study.클래스;

public class Person {
    // 필드는 명사
    String name;
    int age;
    String address;
    String phoneNumber;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //  접근제어자 반환형 메소드명 (파라미터) { 본문 } 소개하다.  동사
    public void introduce() {
        System.out.println("Hi My name is" + name + " and I`m " + age + " years old.");
    }

    public int introduce(String name) {
        return 1;
    }
}
