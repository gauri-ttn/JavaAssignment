sealed class A permits B, C{
    String str;
    A(String str){
        this.str=str;
    }
}

final class B extends A{
    B(String str){
        super(str);
    }
}

final class C extends A{
    C(String str){
        super(str);
    }
}

public class Question4 {
    public static void main(String[] args){
        A ab = new B("Hello B");
        A ac = new C("Hello C");

        System.out.println("Class B: "+ab.str);
        System.out.println("Class C: "+ac.str);
    }
}