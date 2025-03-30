
import java.util.concurrent.*;
import java.util.Random;

public class Question4 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();


        Callable<Integer> task = () -> {
            Random rand = new Random();
            int num = rand.nextInt(100);
            System.out.println("Random number: " + num);
            return num;
        };


        Future<Integer> future = executor.submit(task);


        try {
            int result = future.get();
            System.out.println("Number from thread: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }
}
