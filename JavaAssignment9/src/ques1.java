import java.util.concurrent.*;
public class ques1{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Callable<Integer> callable = () -> {
            return 10;
        };
        Future<Integer> future = executor.submit(callable);
        int sc = future.get();
        System.out.println("Callable"+sc);
        Runnable st = () -> {
            System.out.println("Runnable");
        };
        executor.execute(st);
    }
}
