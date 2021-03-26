package CalendarTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalTest {
    /**
     * Simple method to chgeck if a date is in the future.
     * @param expiryDate

     * @return
     * @throws ParseException
     */
    public boolean DateExpiryChecker(String expiryDate) throws ParseException {
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("MMyy");
            Date exp = sdf.parse(expiryDate);
            Date now = new Date();
            int r = exp.compareTo(now);

            //System.out.println(r + "result");
            //System.out.println(now + "now");
            //System.out.println(exp + "exp");
            return r > 0;
        }catch(ParseException p){
            throw new ParseException("Date not in correct format", 0);
        }
    }
}
