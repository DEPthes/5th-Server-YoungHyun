package Generics;

// 제네릭 클래스
class Box<T> {
    T data;

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}

public class GenericClassExample {
    public static void main(String[] args) {
        // 제네릭 없이 쓸 때
        // BoxInteger, BoxString 처럼 타입마다 클래스를 따로 만들어야 했음

        // 제네릭 쓰면 하나의 클래스로 해결
        Box<Integer> iBox = new Box<>();
        iBox.setData(3);
        System.out.println(iBox.getData()); // 3

        Box<String> sBox = new Box<>();
        sBox.setData("안녕");
        System.out.println(sBox.getData()); // 안녕
    }
}