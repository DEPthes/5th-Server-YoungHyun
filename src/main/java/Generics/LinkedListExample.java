package Generics;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // 추가
        list.add("철수");
        list.add("영희");

        // 가져오기
        System.out.println(list.get(0));         // 철수
        System.out.println(list.getFirst());     // 철수
        System.out.println(list.getLast());      // 영희

        // 맨 앞에 추가
        list.addFirst("영철");
        System.out.println(list.getFirst());     // 영철

        // 맨 뒤에 추가
        list.addLast("민준");
        System.out.println(list.getLast());      // 민준

        // 순회 - 향상된 for문
        for (String s : list) {
            System.out.println(s);
        }

        // 전체 삭제
        list.clear();
        System.out.println(list.size());         // 0
    }
}