/*
Class Calendar:
public abstract class Calendar The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week. Like other locale-sensitive classes, Calendar provides a class method, getInstance, for getting a generally useful object of this type. Calendar's getInstance method returns a Calendar object whose calendar fields have been initialized with the current date and time:     

Calendar rightNow = Calendar.getInstance();
*/
import java.util.*;
public class Calender{
 public static void main(String args[]){
           Calendar cal=Calendar.getInstance();

    System.out.println("Date is.."+cal.get(Calendar.DATE));
      System.out.println("Month is.."+cal.get(Calendar.MONTH));
       System.out.println("YEAR is.."+cal.get(Calendar.YEAR));
        System.out.println("Day of Month is.."+cal.get(Calendar.DAY_OF_MONTH));
            System.out.println("Day of week is..."+cal.get(Calendar.DAY_OF_WEEK));
        System.out.println("Day of year is.."+cal.get(Calendar.DAY_OF_YEAR));
        System.out.println("week of Month is.."+cal.get(Calendar.WEEK_OF_MONTH));
     System.out.println("WEEK OF YEAR IS.."+cal.get(Calendar.WEEK_OF_YEAR));
     }
}