package Question8;

public class ClassNotFoundExceptionDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.example.NonExistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException occurred: " + e.getMessage());
        }
    }
}
