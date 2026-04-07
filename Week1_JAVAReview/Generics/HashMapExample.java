package Generics;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // 이름, 점수
        HashMap<String, Integer> map = new HashMap<>();

        // 추가
        map.put("철수", 100);
        map.put("영희", 90);

        // 가져오기
        System.out.println(map.get("철수"));            // 100

        // 크기
        System.out.println(map.size());                 // 2

        // 키 포함 여부
        System.out.println(map.containsKey("영희"));    // true
        System.out.println(map.containsKey("민준"));    // false

        // 삭제
        map.remove("철수");
        System.out.println(map.size());                 // 1

        // 전체 삭제
        map.clear();
        System.out.println(map.size());                 // 0
    }
}