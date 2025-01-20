package dev.study.컬렉션.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Apple");
        set.add("Banana");
        set.add("Apple");

        System.out.println("Set: " + set);
    }
}
