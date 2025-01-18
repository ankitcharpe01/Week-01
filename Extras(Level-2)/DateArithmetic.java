import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {

    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner sc = new Scanner(System.in);

        // Define a date formatter for input and output
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.print("Enter a date in yyyy-MM-dd format: ");
        String inputDate = sc.nextLine();

        // String into a LocalDate object
        LocalDate date = LocalDate.parse(inputDate, formatter);

        // Add 7 days, 1 month, and 2 years
        LocalDate updatedDate = date.plusDays(7).plusMonths(1).plusYears(2);
        // Subtract 3 weeks

        LocalDate finalDate = updatedDate.minusWeeks(3);

        //Print the output
        System.out.println("Original Date: " + date.format(formatter));
        System.out.println("After adding 7 days, 1 month, and 2 years: " + updatedDate.format(formatter));
        System.out.println("After subtracting 3 weeks: " + finalDate.format(formatter));

        sc.close();
    }
}
