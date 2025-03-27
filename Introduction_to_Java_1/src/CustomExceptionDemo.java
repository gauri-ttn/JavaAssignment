//Question9)
//Create a custom exception that do not have any stack trace.


public class CustomExceptionDemo {
    public static void main(String[] args) {
        try {
            throw new NoStackTraceException("This is a custom exception without stack trace.");
        } catch (NoStackTraceException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}