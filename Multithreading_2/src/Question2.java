import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


class Pen {
    private final Lock lock = new ReentrantLock();


    public void writeWithPenAndPaper(Paper paper) {
        boolean penLocked = false;
        boolean paperLocked = false;


        try {
            penLocked = lock.tryLock();
            if (!penLocked) return;


            System.out.println(Thread.currentThread().getName() + " locked Pen " + this);


            paperLocked = paper.tryLock();
            if (!paperLocked) return;


            System.out.println(Thread.currentThread().getName() + " is using pen " + this + " and paper " + paper);
            paper.finishWriting();
        } finally {
            if (paperLocked) paper.unlock();
            if (penLocked) lock.unlock();
        }
    }


    public void finishWriting() {
        System.out.println(Thread.currentThread().getName() + " finished using pen " + this);
    }


    public boolean tryLock() {
        return lock.tryLock();
    }


    public void unlock() {
        lock.unlock();
    }
}


class Paper {
    private final Lock lock = new ReentrantLock();


    public void writeWithPaperAndPen(Pen pen) {
        boolean paperLocked = false;
        boolean penLocked = false;


        try {
            paperLocked = lock.tryLock();
            if (!paperLocked) return;


            System.out.println(Thread.currentThread().getName() + " locked Paper " + this);


            penLocked = pen.tryLock();
            if (!penLocked) return;


            System.out.println(Thread.currentThread().getName() + " is using paper " + this + " and pen " + pen);
            pen.finishWriting();
        } finally {
            if (penLocked) pen.unlock();
            if (paperLocked) lock.unlock();
        }
    }


    public void finishWriting() {
        System.out.println(Thread.currentThread().getName() + " finished using paper " + this);
    }


    public boolean tryLock() {
        return lock.tryLock();
    }


    public void unlock() {
        lock.unlock();
    }
}


class Task1 extends Thread {
    private Pen pen;
    private Paper paper;


    public Task1(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }


    @Override
    public void run() {
        pen.writeWithPenAndPaper(paper);
    }
}


class Task2 extends Thread {
    private Pen pen;
    private Paper paper;


    public Task2(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }


    @Override
    public void run() {
        paper.writeWithPaperAndPen(pen);
    }
}


public class Question2 {
    public static void main(String[] args) {
        Pen pen = new Pen();
        Paper paper = new Paper();


        Thread thread1 = new Task1(pen, paper);
        Thread thread2 = new Task2(pen, paper);


        thread1.start();
        thread2.start();
    }
}
