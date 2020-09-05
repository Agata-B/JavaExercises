package thread;

public class Main2 {
    public static void main(String[] args) {
        MyRunnable thread2 = new MyRunnable();

        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }
}
