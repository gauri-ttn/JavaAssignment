//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

interface Operation1 {
    boolean operation(int var1, int var2);
}

interface Operation2 {
    int operation(int var1);
}

interface Operation3 {
    String operation(String var1, String var2);
}

interface Operation4 {
    String operation(String var1);
}

public class Question1 {

    public static void main(String[] var0) {
        Operation1 var1 = (x, y) -> x > y;
        System.out.println(var1.operation(7, 8));
        Operation2 var2 = (x) -> x + 1;
        System.out.println(var2.operation(10));
        Operation3 var3 = (x, y) -> x + y;
        System.out.println(var3.operation("Hello ", "World"));
        Operation4 var4 = (x) -> x.toUpperCase();
        System.out.println(var4.operation("java"));
    }
}
