
class Counter {
    private int count = 0;
    private int count2 = 0;

    Counter() {
    }

    public synchronized void increment() {
        ++this.count;
    }

    public int getCount() {
        return this.count;
    }

    public void increment2() {
        synchronized(this) {
            ++this.count2;
        }
    }

    public int getCount2() {
        return this.count2;
    }
}

class myThread extends Thread {
    private Counter counter;

    public myThread(Counter var1) {
        this.counter = var1;
    }

    public void run() {
        for(int var1 = 0; var1 < 1000; ++var1) {
            this.counter.increment();
        }

    }
}

class myThread2 extends Thread {
    private Counter counter2;

    public myThread2(Counter var1) {
        this.counter2 = var1;
    }

    public void run() {
        for(int var1 = 0; var1 < 1000; ++var1) {
            this.counter2.increment2();
        }

    }
}

public class Question2 {
    public static void main(String[] var0) {
        Counter var1 = new Counter();
        myThread var2 = new myThread(var1);
        myThread var3 = new myThread(var1);
        Counter var4 = new Counter();
        myThread2 var5 = new myThread2(var4);
        myThread2 var6 = new myThread2(var4);
        var2.start();
        var3.start();
        var5.start();
        var6.start();

        try {
            var2.join();
            var3.join();
            var5.join();
            var6.join();
        } catch (InterruptedException var8) {
        }

        System.out.println("Synchronized Method " + var1.getCount());
        System.out.println("Synchronized Block " + var4.getCount2());
    }
}

