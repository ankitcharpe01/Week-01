import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparison{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First date (yyyy-MM-dd): ");
        String string1 = sc.nextLine();
        System.out.print("Enter second date (yyyy-MM-dd): ");
        String string2 = sc.nextLine();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date1 = LocalDate.parse(string1, format);
        LocalDate date2 = LocalDate.parse(string2, format);


        if (date1.isBefore(date2)) {
            System.out.println("Date1 is before Date2");
        } else if (date1.isAfter(date2)) {
            System.out.println("Date1 is after Date2");
        } else {
            System.out.println("Date1 is the same as Date2");
        }
    }
}