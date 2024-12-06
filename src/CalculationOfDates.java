import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class CalculationOfDates {

    public static void main(String[] args) {

        String str = "09/07/2003";
        String str2 = "07/12/2024";


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        LocalDate temp = LocalDate.from(formatter.parse(str));
        LocalDate temp2 = LocalDate.from(formatter.parse(str2));

        System.out.println(temp.datesUntil(temp2).toList().size());


    }



}
