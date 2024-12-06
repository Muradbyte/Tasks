import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class CalculatingAge {
    static Scanner sc = new Scanner(System.in); //will be used for user input.
    static LocalDate today = LocalDate.now(); //will be used to calculate.


    public static void main(String[] args) {
        System.out.println("LETS CALCULATE YOUR AGE !");


        while (true) {
            System.out.println("Please enter your date of birth (dd/MM/yyyy) :");

//using try-catch to handle a potential exception.
            try {
                String date = sc.nextLine();
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate localDate = LocalDate.from(dtf.parse(date));



                long age = ChronoUnit.YEARS.between(localDate, today);

                System.out.println("Your age is: " + age);
                break; //used to break free from the loop once everything goes well and close the program.


            }

            catch (RuntimeException e) {
                System.out.println("Invalid date format.Try again.");
            }

        }
    }
}