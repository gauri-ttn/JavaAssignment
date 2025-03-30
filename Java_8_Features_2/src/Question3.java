import java.util.ArrayList;

public class Question3 {

    public static void main(String[] var0) {
        ArrayList<Integer> var1 = new ArrayList();
        var1.add(11);
        var1.add(9);
        var1.add(3);
        var1.add(18);
        var1.add(2);
        System.out.println(var1.stream().filter((var0x) -> var0x > 5).mapToInt((var0x) -> var0x).sum());
    }
}
