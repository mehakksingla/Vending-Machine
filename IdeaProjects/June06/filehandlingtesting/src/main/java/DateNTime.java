import org.omg.PortableInterceptor.INACTIVE;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalField;
import java.util.Date;

public class DateNTime {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);  //it will print today's date

//        Date date = new Date(259446565);   //in milliseconds
//        System.out.println(date);

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/YYYY");

        String formattedDate = format.format(date);
        System.out.println(formattedDate);

        Date parsedDate = format.parse("05/02/2020");

        System.out.println(parsedDate);

        System.out.println(formattedDate);

        LocalDate now1 = LocalDate.now();
        System.out.println(now1);

        LocalDate now = LocalDate.of(2020,1,5);
        System.out.println(now);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");

        System.out.println(now.format(formatter));

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime.getMonth());

        System.out.println(dateTime.minusMonths(1));
        System.out.println(dateTime.minusYears(1L));

        LocalTime time = LocalTime.now();
        System.out.println(time);

        ZonedDateTime zonedDateTime= ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(zonedDateTime.getZone());

        ZonedDateTime zonedDateTime1= ZonedDateTime.now();
        System.out.println(zonedDateTime1.getZone());

        System.out.println(zonedDateTime);

        Instant instant = Instant.now();

        System.out.println(instant);


    }
}