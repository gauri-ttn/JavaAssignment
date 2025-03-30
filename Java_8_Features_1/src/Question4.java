class Perimeter {
    int p = 0;

    Perimeter(int var1) {
        System.out.print("Square Perimeter ");
        this.p = 4 * var1;
    }

    Perimeter(int var1, int var2) {
        System.out.print("Rectangle Perimeter ");
        this.p = 2 * (var1 + var2);
    }
}

interface Rectangle {
    Perimeter calc(int var1, int var2);
}

public class Question4 {

    public static void main(String[] var0) {
        Rectangle var1 = Perimeter::new;
        Perimeter var2 = var1.calc(4, 5);
        System.out.println(var2.p);
    }
}
