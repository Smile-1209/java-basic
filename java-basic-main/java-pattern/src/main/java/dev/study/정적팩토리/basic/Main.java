package dev.study.정적팩토리.basic;

public class Main {
    public static void main(String[] args) {
        Product laptop = Product.create("Laptop", 1_000_000_000);
        System.out.println(laptop);
    }
}
