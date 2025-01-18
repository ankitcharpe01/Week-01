import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateFormatting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.print("Enter a date in dd/MM/yyyy format: ");
        String inputDate = sc.nextLine();
        LocalDate date = LocalDate.parse(inputDate, formatter);

        //print the date
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter2= DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatter3= DateTimeFormatter.ofPattern("EEE ,MMM dd ,yyyy");

        System.out.println("Original format(dd/MM/yyyy) : "+date.format(formatter));
        System.out.println("Format 1 dd/MM/yyyy : "+date.format(formatter1));
        System.out.println("Format 2 yyyy-MM-dd : "+date.format(formatter2));
        System.out.println("Format 3 EEE, MMM dd, yyyy : "+date.format(formatter3));
    }
}
