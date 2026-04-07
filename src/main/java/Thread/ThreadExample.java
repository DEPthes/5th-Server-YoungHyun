package Thread;

public class ThreadExample extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + i);
        }
    }

    public static void main(String[] args) {
        new ThreadExample().start(); // 새로운 쓰레드에서 run() 동작 수행
    }
}