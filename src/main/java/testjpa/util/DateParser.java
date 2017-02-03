package testjpa.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateParser{
   public static Date parseDate(String fecha) {
      try {
        SimpleDateFormat format = new SimpleDateFormat("yyy-MM-dd");
        java.util.Date date = format.parse(fecha);

        return new Date(date.getTime());
      } catch(Exception e) {
        return null;
      }
    }
}
