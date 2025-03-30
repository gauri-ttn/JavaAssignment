
import java.io.PrintStream;

class MyThreadTask extends Thread {
    MyThreadTask() {
    }

    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " (Thread) started.");

            for(int var1 = 1; var1 <= 5; ++var1) {
                PrintStream var10000 = System.out;
                String var10001 = Thread.currentThread().getName();
                var10000.println(var10001 + " - " + var1);
                Thread.sleep(2000L);
            }

            System.out.println(Thread.currentThread().getName() + " finished.");
        } catch (InterruptedException var2) {
        }

    }
}


class MyRunnableTask implements Runnable {
    MyRunnableTask() {
    }

    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " (Runnable) started.");

            for(int var1 = 1; var1 <= 5; ++var1) {
                PrintStream var10000 = System.out;
                String var10001 = Thread.currentThread().getName();
                var10000.println(var10001 + " - " + var1);
                Thread.sleep(2000L);
            }

            System.out.println(Thread.currentThread().getName() + " finished.");
        } catch (InterruptedException var2) {
        }

    }
}

public class Question1 {
    public Question1() {
    }

    public static void main(String[] var0) {
        Thread var1 = new Thread(new MyRunnableTask(), "Runnable-Thread");
        MyThreadTask var2 = new MyThreadTask();
        var2.setName("Thread-Class");
        var1.start();
        var2.start();

        try {
            var1.join();
            var2.join();
        } catch (InterruptedException var4) {
        }

        System.out.println("Main thread finished.");
    }
}
