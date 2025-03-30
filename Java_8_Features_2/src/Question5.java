import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

class Employee {
    String fullName;
    Long salary;
    String city;

    public Employee(String var1, Long var2, String var3) {
        this.fullName = var1;
        this.salary = var2;
        this.city = var3;
    }

    public String getFirstName() {
        return this.fullName.substring(0, this.fullName.indexOf(" "));
    }
}

public class Question5 {

    public static void main(String[] var0) {
        ArrayList<Employee> var1 = new ArrayList();
        var1.add(new Employee("Amit Kumar Sharma", 4000L, "Delhi"));
        var1.add(new Employee("Rajesh Singh", 6000L, "Delhi"));
        var1.add(new Employee("Amit Verma", 4500L, "Delhi"));
        var1.add(new Employee("Suresh Raina", 3000L, "Delhi"));
        var1.add(new Employee("Anil Kapoor", 3500L, "Mumbai"));
        var1.add(new Employee("Amit Sharma", 4800L, "Delhi"));
        Set<String> var2 = var1.stream().filter((var0x) -> var0x.salary < 5000L && "Delhi".equals(var0x.city)).map(Employee::getFirstName).collect(Collectors.toSet());
        System.out.println("Unique First Names: " + String.valueOf(var2));
    }
}