import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class HowManyUntilTheEndOfTheYear {
    static LocalDate localdate = LocalDate.now();
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    static String lastday = "31/12/2024";
    static LocalDate localdate2 = LocalDate.from(formatter.parse(lastday));


    public static void main(String[] args) {

        System.out.println("Current date: " + localdate);


        System.out.println("Days until the end of the year :" + ChronoUnit.DAYS.between(localdate, localdate2));







    }
}
