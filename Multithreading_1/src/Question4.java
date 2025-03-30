import java.io.PrintStream;

class Pen {
    Pen() {
    }

    public synchronized void writeWithPenAndPaper(Paper var1) {
        PrintStream var10000 = System.out;
        String var10001 = Thread.currentThread().getName();
        var10000.println(var10001 + " is using pen " + String.valueOf(this) + " and trying to use paper " + String.valueOf(var1));
        var1.finishWriting();
    }

    public synchronized void finishWriting() {
        PrintStream var10000 = System.out;
        String var10001 = Thread.currentThread().getName();
        var10000.println(var10001 + " finished using pen " + String.valueOf(this));
    }
}

class Paper {
    Paper() {
    }

    public synchronized void writeWithPaperAndPen(Pen var1) {
        PrintStream var10000 = System.out;
        String var10001 = Thread.currentThread().getName();
        var10000.println(var10001 + " is using paper " + String.valueOf(this) + " and trying to use pen " + String.valueOf(var1));
        var1.finishWriting();
    }

    public synchronized void finishWriting() {
        PrintStream var10000 = System.out;
        String var10001 = Thread.currentThread().getName();
        var10000.println(var10001 + " finished using paper " + String.valueOf(this));
    }
}


class Task1 extends Thread {
    private Pen pen;
    private Paper paper;

    public Task1(Pen var1, Paper var2) {
        this.pen = var1;
        this.paper = var2;
    }

    public void run() {
        this.pen.writeWithPenAndPaper(this.paper);
    }
}

class Task2 extends Thread {
    private Pen pen;
    private Paper paper;

    public Task2(Pen var1, Paper var2) {
        this.pen = var1;
        this.paper = var2;
    }

    public void run() {
        synchronized(this.pen) {
            this.paper.writeWithPaperAndPen(this.pen);
        }
    }
}

public class Question4 {

    public static void main(String[] var0) {
        Pen var1 = new Pen();
        Paper var2 = new Paper();
        Task1 var3 = new Task1(var1, var2);
        Task2 var4 = new Task2(var1, var2);
        ((Thread)var3).start();
        ((Thread)var4).start();
    }
}
