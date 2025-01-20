package dev.study.exam;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {
    private final List<Order> orders = new ArrayList<>();
    private final List<Product> products = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Order searchOrder(int orderNumber) {
        for (Order order : orders) {
            if (order.orderNumber() == orderNumber) {
                return order;
            }
        }
        return null;
    }

    public void printAllOrders() {
        for (Order order : orders) {
            System.out.println(
                    "주문 번호: " + order.orderNumber() +
                            ", 고객: " + order.customerName() +
                            ", 총 가격: " + order.totalPrice()
            );
            System.out.println(" 상품 목록: " + order.products());
        }
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public Product searchProduct(String name) {
        for (Product product : products) {
            if (product.name().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public Product searchProduct(String name, double price) {
        for (Product product : products) {
            if (product.name().equals(name) && product.price() == price) {
                return product;
            }
        }
        return null;
    }

}
