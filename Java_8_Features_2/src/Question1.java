import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Question1 {
    public static void main(String[] var0) {
        Consumer<String> var1 = (var0x) -> System.out.println("Message: " + var0x);
        var1.accept("Hello, Java!");

        Supplier<Integer> var2 = () -> (int)(Math.random() * (double)100.0F);
        System.out.println("Generated number: " + String.valueOf(var2.get()));

        Predicate<Integer> var3 = (var0x) -> var0x > 10;
        System.out.println("Is 15 greater than 10? " + var3.test(15));

        Function<Integer,Integer> var4 = (var0x) -> var0x * var0x;
        System.out.println("Square of 5: " + String.valueOf(var4.apply(5)));
    }
}