package dev.study.정적팩토리.basic;

/**
 *  1. 기본적인 정적 팩토리 메서드
 *  정적 팩토리 메서드를 통해서 객체를 생성하고 반환을 한다.
 *  생성자는 private 로 제한을 해서 외부에서 접근하지 못하도록 설정
 */
public class Product {
    private final String name;
    private final int price;

    private Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // static 정적
    public static Product create(String name, int price) {
        return new Product(name, price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
