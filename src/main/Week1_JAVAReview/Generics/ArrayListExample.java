package Generics;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // 추가
        list.add("철수");
        list.add("영희");

        // 가져오기
        System.out.println(list.get(0));        // 철수

        // 크기
        System.out.println(list.size());        // 2

        // 수정
        list.set(0, "영희");
        System.out.println(list.get(0));        // 영희

        // 포함 여부
        System.out.println(list.contains("영희")); // true

        // 삭제
        list.remove("영희");
        System.out.println(list.size());        // 1

        // 순회 - 향상된 for문
        list.add("철수");
        list.add("영희");
        for (String s : list) {
            System.out.println(s);
        }

        // 전체 삭제
        list.clear();
        System.out.println(list.size());        // 0
    }
}