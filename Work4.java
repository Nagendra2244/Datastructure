/*Linear Search by String wraper class in ArrayList*/

import java.util.*;

public class Work4 {
    public static void main(String[] args) {
        int i, sear, size;
        String name;
       String searchStr;
        Scanner sc=new Scanner(System.in);
        ArrayList<String> list=new ArrayList<String>();

        System.out.print("Enter the size of the list: ");
        size=sc.nextInt();

        System.out.println("Enter the strings of the list:");
        for (i=0;i<size;i++) {
            name=sc.next();
            list.add(name);
        }

        System.out.println("The strings of the list:");
        System.out.println(list);

        System.out.print("Enter the string to search: ");
        sc.nextLine(); 
        searchStr=sc.nextLine();

        for(i=0;i<list.size();i++) {
            if (list.get(i).equals(searchStr)) {
          System.out.println("String is found at index position:"+i);
      System.out.println("String is found at position:"+(i + 1));
                break;
            }
        }

        if(i==list.size()) {
            System.out.println("String is not found in the list");
        }
    }
}
