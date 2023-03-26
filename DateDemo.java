import java.util.*;
class DateDemo{
     public static void main(String[] args){
            Date d=new Date();
              System.out.println("The Date is:"+d);
              System.out.println("The Date is:"+d.getDate());
                System.out.println("The Month is:"+d.getMonth());
                    System.out.println("The Month is:"+(d.getMonth()+1));
                           System.out.println("The Year is:"+d.getYear());
                            System.out.println("The year is:"+(d.getYear()+1900));
                      System.out.println("The Day is:"+d.getDay());
               System.out.println("The Hours is:"+d.getHours());
            System.out.println("The Minutes is:"+d.getMinutes());
        System.out.println("The Seconds is:"+d.getSeconds());
     }
}