import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class Question6 {
    public Question6() {
    }

    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.print("Enter first date (yyyy-MM-dd): ");
        LocalDate var2 = LocalDate.parse(var1.next());
        System.out.print("Enter second date (yyyy-MM-dd): ");
        LocalDate var3 = LocalDate.parse(var1.next());
        System.out.println(var2.isBefore(var3) ? "First date is before second date." : (var2.isAfter(var3) ? "First date is after second date." : "Both dates are the same."));
        System.out.println("India Time: " + String.valueOf(ZonedDateTime.now(ZoneId.of("Asia/Kolkata"))));
        System.out.println("US Time: " + String.valueOf(ZonedDateTime.now(ZoneId.of("America/New_York"))));
        System.out.println("UK Time: " + String.valueOf(ZonedDateTime.now(ZoneId.of("Europe/London"))));
    }
}
