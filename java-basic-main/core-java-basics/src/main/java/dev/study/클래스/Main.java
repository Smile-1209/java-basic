package dev.study.클래스;

import dev.study.레코드.User;

public class Main {
    public static void main(String[] args) {
        // 객체가 생성이 되었다.
        Person person = new Person("Zephyr", 10);
        person.introduce();

        User test = new User("test", 1);
    }
}
