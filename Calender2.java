/*Calenderclass by using set method*/

import java.util.*;
public class Calender2{
 public static void main(String args[]){
           Calendar cal=Calendar.getInstance();
               cal.set(1996,8,22); //setting new date
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