import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;


public class Question3 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        List<Callable<String>> tasks = Arrays.asList(
                () -> { Thread.sleep(1000); return "Task 1 complete"; },
                () -> { Thread.sleep(500); return "Task 2 complete"; },
                () -> { Thread.sleep(800); return "Task 3 complete"; }
        );


        runTasks(Executors.newSingleThreadExecutor(), tasks, "Single Thread Executor");
        runTasks(Executors.newCachedThreadPool(), tasks, "Cached Thread Pool");
        runTasks(Executors.newFixedThreadPool(3), tasks, "Fixed Thread Pool");
    }


    private static void runTasks(ExecutorService executor, List<Callable<String>> tasks, String poolName)
            throws InterruptedException, ExecutionException {
        System.out.println("Running tasks using: " + poolName);
        List<Future<String>> results = executor.invokeAll(tasks);
        for (Future<String> result : results) {
            System.out.println(result.get());
        }
        executor.shutdown();
    }
}
