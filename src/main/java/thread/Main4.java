package thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class Main4 {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(2);

        IntStream.range(1,10)
                .mapToObj(i->new ThreadPlaygroundRunnable("name " +i))
                .forEach(t ->executor.submit(t));

        executor.shutdown();
    }
}
