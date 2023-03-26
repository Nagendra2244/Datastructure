//Linear search  return boolean values
import java.util.Scanner;

class Linear1 {
    int n, i, ser;
    Scanner sc = new Scanner(System.in);

    void getArray(int a[], int n) {
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
    }

    void dispArray(int a[], int n) {
        for (i = 0; i < n; i++) {
            System.out.print("\t" + a[i]);
        }
    }

    boolean LinearSeach(int a[], int n, int ser) {
        for (i = 0; i < n; i++) {
            if (a[i] == ser) {
                System.out.println("Element is Found at index position " + i);// index position
                System.out.println("Element is Found at position " + (i + 1));// Element position
                return true;
            }
        }
        System.out.println("Element is Not Found");
        return false;
    }
}

class LinearSearch1 {
    public static void main(String args[]) {
        int n, i, ser;
        Linear1 lns = new Linear1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size:");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter Elements to Array:");
        lns.getArray(a, n);
        System.out.println("The Elements in an Array is:");
        lns.dispArray(a, n);
        System.out.println("\nEnter Element for Search:");
        ser = sc.nextInt();
        boolean found = lns.LinearSeach(a, n, ser);
        System.out.println("Element found: " + found);
    }
}
