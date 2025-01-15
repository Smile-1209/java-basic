package dev.study.exam;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {
    private  final  List<Order> orders;

    public OrderManager(){
        this.orders = new ArrayList<>();
    }

    //주문 추가 메서드
    public void addOrder(Order order){
        orders.add(order);
    }

    // 모든 주문 출력 메서드
    public void printAllOrders(){
        if (orders.isEmpty()) {
            System.out.println("등록된 주문이 없습니다.");
        }
        else{
            for (Order order : orders){
                System.out.println(order);
            }
        }
    }

    //주문 검색 메서드 (주문 번호 기준)
    public Order searchOrder(int orderId){
        for(Order order : orders){
                if( order.orderId() == orderId){
                    return order;
                }
            }
            System.out.println("주문 번호 " + orderId + "에 해당하는 주문이 없습니다.");
            return  null;
    }

    //상품 이름으로 검색
    public Product searchProduct(String name){
        for (Order order : orders){
            for (Product product : order.products()){
                if (product.name().equals(name)){
                    return product;
                }
            }
        }
        System.out.println("상품 이름 " + name + " 에 해당하는 상품이 없습니다.");
        return null;
    }

    //상품 이름과 가격으로 검색
    public Product searchProduct(String name, double price){
        for (Order order : orders) {
            for (Product product : order.products()) {
                if (product.name().equals(name) && product.price() == price) {
                    return product;
                }
            }
        }
        System.out.println("상품 이름 " + name + "와 가격 " + price + "에 해당하는 상품이 없습니다.");
        return null;
    }
}

