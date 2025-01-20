package dev.study.컬렉션.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(4, "Can");
        map.put(3, "Apple");

        System.out.println("Map: " + map);
        System.out.println("키 3의 값: " + map.get(3));
    }
}
