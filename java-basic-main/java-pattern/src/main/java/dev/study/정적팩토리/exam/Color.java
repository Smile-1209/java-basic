package dev.study.정적팩토리.exam;

import java.util.HashMap;
import java.util.Map;

/**
 * 캐싱 기능 구현
 * 문제 : Color 객체를 관리하는 캐싱 기능을 작성하라
 * - Color는 name(색상 이름)을 필드로 가진다
 * - 동일한 색상 이름에 대해 같은 객체를 반환하도록 캐싱을 구현하라
 */
public class Color {
    private static final Map<String, Color> cache = new HashMap<>();
    private final String name;

    private Color(String name){ this.name = name; }

    public static Color getInstance(String name){
        return cache.computeIfAbsent(name, Color::new);
    } //싱글톤 생성

    @Override
    public String toString(){
        return "Color{" +
                "name= '" + name + '\'' +
                '}';
    }

}
