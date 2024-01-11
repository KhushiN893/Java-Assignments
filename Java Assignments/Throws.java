import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Throws {
    public static void main(String[] args) throws ParseException {
        String dateString = "2022-04-08";
        String dateString2 = "2022-08";
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date1= null;
        Date date2= null;
        try {
            date1 = dateFormat.parse(dateString);
            System.out.println(date1);
            date2 = dateFormat.parse(dateString2);
            System.out.println(date2);
        } catch (ParseException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
