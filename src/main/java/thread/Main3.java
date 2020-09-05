package thread;

public class Main3 {
    public static void main(String[] args) {

        thread1 = new Thread(new ThreadPlaygroundRunnable("Wątek 1"));
        thread2 = new Thread(new ThreadPlaygroundRunnable("Wątek 2"));

        thread1.start();
        thread2.start();
    }

    private static Thread thread1;
    private static Thread thread2;


}
