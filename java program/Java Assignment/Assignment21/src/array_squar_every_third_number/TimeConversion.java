//Given a time in -hour AM/PM format, convert it to military (24-hour) time.
package array_squar_every_third_number;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;


    public class TimeConversion {



        public static String convertToMilitaryTime(String time) {
            String[] timeParts = time.split(":");
            int hour = Integer.parseInt(timeParts[0]);
            String minutes = timeParts[1];
            String seconds = timeParts[2].substring(0, 2); // Extract only seconds
            String period = timeParts[2].substring(2); // Extract AM/PM
            System.out.println(period);
            if (period.equals("PM") && hour != 12) {
                hour += 12; // Add 12 for hours in PM except 12PM which is already 12:00
            } else if (period.equals("AM") && hour == 12) {
                hour = 0; // Convert 12AM to 00:00
            }

            return String.format("%02d:%s:%s", hour, minutes, seconds);
        }
        public static void main(String[] args) {
            String time = "05:01:00PM"; // Example time
            String militaryTime = convertToMilitaryTime(time);
            System.out.println(militaryTime);
        }
    }


