import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Tester {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter italianFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(currentDate.format(italianFormat));

        System.out.println("Day left to the end of this month : " +
                (currentDate.lengthOfMonth() - currentDate.getDayOfMonth()));


        System.out.println("Day left to the end of this year : " +
                (currentDate.lengthOfYear() - currentDate.getDayOfYear()));
    }
}
