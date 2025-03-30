public class Question1 {
    public Question1() {
    }

    public static void main(String[] var0) {
        Student var1 = new Student(101, "Sita", "6th");
        System.out.println("ID: " + var1.id());
        System.out.println("Name: " + var1.name());
        System.out.println("Standard: " + var1.standard());
        System.out.println(var1);
    }
}
