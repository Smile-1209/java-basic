package dev.study.exam;


import java.util.List;

/**
 * 요구사항
 * 상품(Product):
 *
 * 상품은 이름과 가격을 가집니다.
 * 상품 클래스는 불변 객체로 설계합니다.
 * 주문(Order):
 *
 * 주문은 주문 번호, 고객 이름, 상품 목록, 총 가격을 가집니다.
 * 레코드를 사용하여 주문 객체를 설계합니다.
 * 주문 객체에 상품을 추가하는 메서드를 작성합니다.
 * 주문 관리 시스템(OrderManager):
 *
 * OrderManager 클래스는 여러 개의 주문을 관리합니다.
 * 주문 추가, 주문 검색(주문 번호 기준), 주문 목록 출력 메서드를 작성합니다.
 * 메서드 오버로딩 및 오버라이딩:
 *
 * 상품 이름을 기준으로 상품을 검색하는 메서드를 추가합니다.
 * 메서드 오버로딩을 활용하여 searchProduct(String name)과 searchProduct(String name, double price)를 구현합니다.
 *
 * 상품 추가: Laptop, 가격: 1200.0
 * 상품 추가: Phone, 가격: 800.0
 * 상품 추가: Tablet, 가격: 500.0
 *
 * 주문 생성: 주문 번호 1, 고객: Alice, 총 가격: 2500.0
 * 주문 생성: 주문 번호 2, 고객: Bob, 총 가격: 1300.0
 *
 * 모든 주문 목록:
 * - 주문 번호: 1, 고객: Alice, 총 가격: 2500.0
 * - 주문 번호: 2, 고객: Bob, 총 가격: 1300.0
 *
 * 주문 검색 (주문 번호 1):
 * - 고객: Alice, 상품: [Laptop, Phone]
 *
 * 상품 검색 (이름: Laptop):
 * - Laptop, 가격: 1200.0
 *
 * 1. 새로운 상품을 추가하는 기능을 구현하세요
 * - 새로운 상품을 추가한 뒤, 주문에 포함시키고 전체 주문 목록을 출력하세요
 *
 * 2. 메서드 오버로딩 활용하기
 * - 상품 이름으로 검색하는 메서드를 작성하세요 :  searchProduct(String name)
 * - 상품 이름과 가격으로 검색하는 메서드를 작성하세요: searchProduct(String name, double price)
 *
 * 3. 출력 개선
 * - 주문 출력 시 , 주문 상품 리스트를 함께 출력하도록 개선하세요
 */
public class Main {
    public static void main(String[] args) {
        // 상품 생성
        Product laptop = new Product("Laptop", 1200.0);
        Product phone = new Product("Phone", 800.0);
        Product tablet = new Product("Tablet", 500.0);

        // 주문 생성
        Order order1 = new Order(1, "Alice", List.of(laptop, phone), laptop.price() + phone.price());
        Order order2 = new Order(2, "Bob", List.of(tablet), tablet.price());

        // 주문 관리 시스템
        OrderManager orderManager = new OrderManager();
        orderManager.addOrder(order1);
        orderManager.addOrder(order2);

        // 출력
        System.out.println("모든 주문 목록:");
        orderManager.printAllOrders();

        // 주문 검색
        System.out.println("\n주문 검색 (주문 번호 1):");
        Order foundOrder = orderManager.searchOrder(1);
        if (foundOrder != null) {
            System.out.println("고객: " + foundOrder.customerName() +
                    ", 상품: " + foundOrder.products());
        }
    }
}