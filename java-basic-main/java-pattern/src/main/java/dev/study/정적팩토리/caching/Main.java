package dev.study.정적팩토리.caching;

public class Main {
    public static void main(String[] args) {
        ConnectionPool pool1 = ConnectionPool.getInstance("DB1");
        ConnectionPool pool2 = ConnectionPool.getInstance("DB1");

        System.out.println(pool1);
        System.out.println(pool1 == pool2);
    }
}
