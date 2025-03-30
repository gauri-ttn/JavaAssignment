record Student(int id, String name, String standard) {}

public class Question3 {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Amit Sharma", "10th");
        Student s2 = new Student(101, "Amit Sharma", "10th");
        Student s3 = new Student(102, "Priya Verma", "9th");

        System.out.println(s1.equals(s2)); // true (same values)
        System.out.println(s1.equals(s3)); // false (different id/name)
        System.out.println(s1.hashCode()); // Hash code based on fields
        System.out.println(s2.hashCode()); // Same as s1
        System.out.println(s3.hashCode()); // Different
    }
}