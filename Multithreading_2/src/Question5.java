import java.util.concurrent.*;


public class Question5 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor1 = Executors.newFixedThreadPool(2);
        ExecutorService executor2 = Executors.newFixedThreadPool(2);


        Runnable task = () -> {
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println(Thread.currentThread().getName() + " - Task running");
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " - Task interrupted");
            }
        };


        System.out.println("Using shutdown():");
        executor1.submit(task);
        executor1.submit(task);
        executor1.shutdown();
        System.out.println("executor1 shutdown called");


        Thread.sleep(3000);


        System.out.println("Using shutdownNow():");
        executor2.submit(task);
        executor2.submit(task);
        executor2.shutdownNow();
        System.out.println("executor2 shutdownNow called");
    }
}
