import java.util.*;
class BinarySearch{
      public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
                  int n,key,i;
            System.out.println("Enter Array Size:");
             n=sc.nextInt();
             int arr[]=new int[n]; 
 System.out.println("Enter Elements to Array:");
            for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
          }
 System.out.println("The Elements in an Array is:");
              for(i=0;i<n;i++){
            System.out.print("\t"+arr[i]);
          }
 System.out.println("Enter Element to Search:");
 key=sc.nextInt();
                 int beg=0;
             int end = arr.length-1;
             int mid = (beg+end)/2;
        while(beg<=end){
         if(arr[mid]<key){
               beg = mid + 1;
        }
    else if(arr[mid] == key){
     System.out.println("Element is Found!position of the element is"+mid);
            break;
         }
    else{
 end= mid-1;
   }
  mid = (beg+end)/2;
 }
  if(beg>=end)
          System.out.println("Element is not Found");
      }
 }