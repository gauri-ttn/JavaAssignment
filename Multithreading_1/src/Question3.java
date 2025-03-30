class Question3 extends Thread {
    private volatile boolean isRunning = true;
    private static volatile int counter = 0;

    public void run() {
        while(this.isRunning) {
            ++counter;
            System.out.println("Counter: " + counter);

            try {
                Thread.sleep(1000L);
            } catch (InterruptedException var2) {
            }
        }

    }

    public void stopThread() {
        this.isRunning = false;
    }

    public static void main(String[] var0) {
        Question3 var1 = new Question3();
        var1.start();

        try {
            Thread.sleep(5000L);
        } catch (InterruptedException var3) {
        }

        System.out.println("Stopping thread...");
        var1.stopThread();
    }
}