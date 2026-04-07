package Generics;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // 추가
        set.add("철수");    // {"철수"}
        set.add("영희");    // {"철수", "영희"}
        set.add("철수");    // {"철수", "영희"} - 중복이라 추가 안 됨

        System.out.println(set.size());             // 2

        // 포함 여부
        System.out.println(set.contains("철수"));   // true
        System.out.println(set.contains("민준"));   // false

        // 삭제
        set.remove("철수");
        System.out.println(set.size());             // 1

        // 전체 삭제
        set.clear();
        System.out.println(set.size());             // 0
    }
}