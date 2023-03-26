/*Binary Search by Methods*/
import java.util.*;

class BinarySearch {
    Scanner sc=new Scanner(System.in);
    void getArray(int[] arr, int n) {
        System.out.println("Enter Elements to Array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    void dispArray(int[] arr, int n) {
        System.out.println("The Elements in the Array are:");
        for (int i = 0; i < n; i++) {
            System.out.print("\t" + arr[i]);
        }
    }

    int searchElement(int[] arr, int key) {
        int beg = 0;
        int end = arr.length - 1;
        int mid = (beg + end) / 2;
        while (beg <= end) {
            if (arr[mid] < key) {
                beg = mid + 1;
            } 
    else if (arr[mid] == key) {
                return mid;
            } 
            else {
                end = mid - 1;
            }
            mid = (beg + end) / 2;
        }
        return -1;
    }
}

class BinarySearch2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, key;
        BinarySearch b1 = new BinarySearch();

        System.out.println("Enter Array Size:");
        n = sc.nextInt();
        int[] arr = new int[n];
        b1.getArray(arr, n);
        b1.dispArray(arr, n);

        System.out.println("\nEnter Element to Search:");
        key = sc.nextInt();
        int position = b1.searchElement(arr, key);
        if (position != -1) {
            System.out.println("Element is Found! position of the element is " +position);
        } else {
            System.out.println("Element is not Found");
        }
    }
}
