package dev.study.컬렉션.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Apple");

        List<String> uniqueList = fruits.stream()
                .distinct()
                .toList();

        System.out.println("Unique Fruits: " + uniqueList);

        List<String> filteredFruits = fruits.stream()
                .filter(fruit -> fruit.startsWith("B"))
                .toList();

        List<String> filtered = new ArrayList<>();
        for (String fruit : fruits) {
            if (fruit.startsWith("B")) {
                filtered.add(fruit);
            }
        }

        System.out.println("Filtered: " + filtered);
        System.out.println("FilteredFruits: " + filteredFruits);
    }
}
