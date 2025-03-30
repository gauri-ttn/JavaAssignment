interface DemoInterface {
    default void display1() {
        System.out.println("Default Method");
    }

    static void display2() {
        System.out.println("Static Method");
    }
}


public class Question2 implements DemoInterface {
    public static void main(String[] var0) {
        Question2 var1 = new Question2();
        var1.display1();
        DemoInterface.display2();
    }
}
