import java.util.Optional;

public class Question4 {
    public Question4() {
    }

    public static void main(String[] var0) {
        Optional<String> var1 = Optional.ofNullable(getName());
        String var2 = (String)var1.orElse("Default Name");
        System.out.println("Name: " + var2);
        var1.ifPresent((var0x) -> System.out.println("Hello, " + var0x));
    }

    private static String getName() {
        return "Demo";
    }
}