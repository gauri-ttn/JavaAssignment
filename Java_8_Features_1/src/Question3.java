interface A {
    default void display() {
        System.out.println("Class A");
    }
}

interface B {
    default void display() {
        System.out.println("Class B");
    }
}

public class Question3 implements A, B {
    public void display() {
        System.out.println("Multiple inheritance implemented");
    }

    public static void main(String[] var0) {
        Question3 var1 = new Question3();
        var1.display();
    }
}