/*Array List By using Bobble Sort*/
import java.util.*;

class Bubble {
    private int[] arr;

    Bubble(int[] arr) {
        this.arr = arr;
    }

    void bubbleSort() {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    void display() {
        System.out.println("The elements after sorting are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t" + arr[i]);
        }
        System.out.println();
    }
}

class WorkArrayListBobbleSort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Bubble b1 = new Bubble(arr);
        b1.bubbleSort();
        b1.display();
    }
}
