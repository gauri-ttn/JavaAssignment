
@FunctionalInterface
interface Operation {
    int opr(int var1, int var2);
}

public class Question2 {
    public Question2() {
    }

    public int add(int var1, int var2) {
        return var1 + var2;
    }

    public int subtract(int var1, int var2) {
        return var1 - var2;
    }

    public static int multiply(int var0, int var1) {
        return var0 * var1;
    }

    public static void main(String[] var0) {
        Question2 var1 = new Question2();
        Operation var2 = var1::add;
        Operation var3 = var1::subtract;
        Operation var4 = Question2::multiply;
        System.out.println("Addition: " + var2.opr(20, 50));
        System.out.println("Subtraction: " + var3.opr(22, 11));
        System.out.println("Multiply: " + var4.opr(4, 13));
    }
}
