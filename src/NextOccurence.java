import java.time.LocalDate;

public class NextOccurence {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        System.out.println("Today is :");
        System.out.println(today.getDayOfWeek());

        System.out.println("Next FRIDAY is going to be on :");
        System.out.println(today.plusDays(7));
    }
}
