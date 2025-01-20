package dev.study.정적팩토리.exam;

/**
 * 문제: Car 클래스를 설계하라
 * 필드는 String brand, String model, int price
 * Car 객체를 생성하는 정적 팩토리 메서드를 작성하라
 * 메서드이름 of 예 -> Car.of("Hyundai", "Sonata", 2500);
 *
 * 싱글톤 객체 생성
 */
public class Car {
    private final String brand;
    private final String model;
    private int price;

    private Car(String brand, String model, int price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public static Car of (String brand, String model, int price){
        return new Car(brand, model, price);
    }

    @Override
    public String toString(){
        return "Car{" +
                "brand=" + brand +
                ", model=" + model +
                ", price=" + price +
                "}";
    }
}
