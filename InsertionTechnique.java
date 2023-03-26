import java.util.*;
class InsertionTechnique{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int i,size,t,j;
    System.out.println("Enter the Array size:");
    size=sc.nextInt();
    int a[]=new int[size];
    System.out.println("Enter Elements to Array:");
            for (i = 0; i <size; i++) {
                 a[i] = sc.nextInt();
        }
 System.out.println("The Elements Before Insertion Sorting is:");
              for (i = 0; i < a.length; i++) {
                  System.out.print("\t" + a[i]);
            }
   //Insertion Sort
 for(i=1;i<=size-1;i++)
 {
 for(j=i;j>0 && a[j-1]>a[j];j--)
 {
 t=a[j];
 a[j]=a[j-1];
 a[j-1]=t;
 }
 }
 System.out.println("The Elements After Sorting is:");
 for(i=0;i<a.length;i++)
 {
 System.out.println("\t"+a[i]);
 }
 }
 }