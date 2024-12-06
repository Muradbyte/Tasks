import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class CalculationOfDates {

    public static void main(String[] args) {

        String str = "09/07/2003"; //first date in String type
        String str2 = "07/12/2024"; // second date in String type


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        LocalDate temp = LocalDate.from(formatter.parse(str)); //creating a localdate object from a string format.
        LocalDate temp2 = LocalDate.from(formatter.parse(str2));


        // printing all the days from the first date to the last date,converting it to a list and printing its size to get the exact number.
        System.out.println(temp.datesUntil(temp2).toList().size());



    }



}
