sealed class A permits B, C, D{
    String str;
    public void display(){
        System.out.println("Class A");
    }
}

sealed class B extends A permits E{
    public void display(){
        System.out.println("Class B");
    }
}

final class C extends A permits G{
    public void display(){
        System.out.println("Class C");
    }
}


non-sealed class D extends A {
    public void display() {
        System.out.println("Class D");
    }
}

final class E extends B {
    public void display() {
        System.out.println("Class E");
    }
}

final class F extends D {
    public void display() {
        System.out.println("Class F");
    }
}

final class G extends C{
    public void display(){
        System.out.println("Class G");
    }
}
public class Question5 {
    public static void main(String[] args){
        A ab = new B();
        A ac = new C();
        A ad = new D();

        B be = new E();
        C cg = new G();
        D df = new F();

        ab.display();
        ac.display();
        ad.display();
        be.display();
        df.display();
        //cg.display();

    }
}