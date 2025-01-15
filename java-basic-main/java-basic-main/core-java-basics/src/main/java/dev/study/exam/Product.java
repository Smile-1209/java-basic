package dev.study.exam;

//public final class Product {
//    private final String name;
//    private final double price;
//
//    public Product(String name, double price) {
//        this.name = name;
//        this.price = price;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    @Override
//    public String toString() {
//        return name + " (가격: " + price + ")";
//    }
//}

public record Product(
        String name,
        double price) {
}

