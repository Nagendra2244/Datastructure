/*Selection Sort by using Methods*/
import java.util.*;

class Selection {
    Scanner sc = new Scanner(System.in);

    void getArray(int a[], int n) {
        System.out.println("Enter elements for array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
    }

    void writeArray(int a[], int n) {
        System.out.println("The elements before sorting are:");
        for (int i = 0; i < n; i++) {
            System.out.print("\t" + a[i]);
        }
        System.out.println();
    }

    void selectionSort(int a[], int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
    }

    void displayArray(int a[], int n) {
        System.out.println("The elements after sorting are:");
        for (int i = 0; i < n; i++) {
            System.out.print("\t" + a[i]);
        }
        System.out.println();
    }
}

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int a[] = new int[n];
        Selection s1 = new Selection();
        s1.getArray(a, n);
        s1.writeArray(a, n);
        s1.selectionSort(a, n);
        s1.displayArray(a, n);
    }
}
