import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //creating offset
        OffsetDateTime offsetDateTime1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        //modifying date
        OffsetDateTime modifiedDateTime = offsetDateTime1.plusYears(1);
        modifiedDateTime = modifiedDateTime.minusMonths(1);
        modifiedDateTime = modifiedDateTime.plusDays(7);

        //formatting
        String formattedModifiedDate = modifiedDateTime.format(DateTimeFormatter.ofPattern("dd MMMM yyyy",Locale.ITALY));
        System.out.println("Starting date: " + offsetDateTime1);
        System.out.println("Modified date: " + formattedModifiedDate);
    }
}
