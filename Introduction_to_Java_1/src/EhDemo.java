//Question7)
//WAP showing try, multi-catch and finally blocks.


public class EHDemo {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};
        String text = null;

        try {
            System.out.println("Accessing an array element: " + numbers[5]);
            System.out.println("String length: " + text.length());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Trying to access an invalid index in the array.");
        } catch (NullPointerException e) {
            System.out.println("Error: Attempted to perform an operation on a null object.");
        } finally {
            System.out.println("Execution completed, whether an exception occurred or not.");
        }

        System.out.println("Program continues after exception handling.");
    }
}


