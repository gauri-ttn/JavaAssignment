import java.util.concurrent.*;


class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable task executed");
    }
}


class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "Callable task executed";
    }
}


public class Question1 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(new MyRunnable());
        Future<String> future = executor.submit(new MyCallable());
        try {
            System.out.println(future.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        executor.shutdown();
    }
}
