import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.TimeZone;

public class Main {


    public static void main(String[] args)  {
      ZoneId zoneId = ZoneId.of("UTC");

      LocalTime id = LocalTime.now(zoneId);

      Date date = new Date();

        System.out.println(id);
        System.out.println(date);


    }
}
