package Generics;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("철수");
        list.add("영희");

        // 향상된 for문으로 순회
        for (String s : list) {
            System.out.println(s);
        }

        // Iterator로 순회
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Iterator로 순회하면서 삭제
        // 향상된 for문으로 순회 중 remove()하면 에러 발생 - Iterator를 써야 함
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            String s = it2.next();
            if (s.equals("철수")) {
                it2.remove();
            }
        }
        System.out.println(list.size()); // 1
    }
}