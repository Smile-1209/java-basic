package dev.study.컬렉션.list;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Apple");
        list.add("Banana");
        list.add("Apple");

        System.out.println("List: " + list);
        System.out.println("첫번째 값: " + list.getFirst());
    }
}
