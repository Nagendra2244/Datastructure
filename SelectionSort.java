/*Selection Sort*/
import java.util.*;
class Selection
{
 public static void main(String args[])
{
 int i, n, t, j;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter Array Size:");
 n=sc.nextInt();
 int a[]=new int[n];
 System.out.println("Enter Elements to Array:");
 for(i=0;i<n;i++)
 {
 a[i]=sc.nextInt();
 }
 System.out.println("The Elements Before Sorting is:");
 for(i=0;i<n;i++)
 {
 System.out.print("\t"+a[i]);
 }
 // Selections Sort
 for(i=0;i<n-1;i++)
 {
 for(j=i+1;j<n;j++)
 {
 if(a[i]>a[j])
 {
 t=a[i];
 a[i]=a[j];
 a[j]=t;
 }
 }
 }
System.out.println("The Elements After Sorting is:");
 for(i=0;i<n;i++)
 {
 System.out.print("\t"+a[i]);
 }
 }
}