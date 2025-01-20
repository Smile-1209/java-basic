package dev.study.컬렉션.stream;

import java.util.Arrays;
import java.util.List;

public class StreamWithLambdaExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Apple");

        // 중복 제거, 정렬, 출력
        fruits.stream()
                .distinct().sorted().forEach(System.out::println);
        for (String fruit : fruits) {

            System.out.println(fruit);
        }
    }
}
