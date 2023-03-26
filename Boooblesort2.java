import java.util.*;

class Bubble {
                              int i, n, t, j;
                              Scanner sc = new Scanner(System.in);

  void readArray(int a[], int n) {
        System.out.println("Enter elements of the array:");
                      for (i = 0; i < n; i++) {
                           a[i] = sc.nextInt();
                }
}

    void writeArray(int a[], int n) {
            System.out.println("The elements before sorting are:");
                         for (i = 0; i < n; i++) {
                          System.out.print("\t" + a[i]);
              }
}

   void bubbleSort(int a[], int n) {
       for (i = 0; i < n - 1; i++) {
       for (j = 0; j < n - 1 - i; j++) {
             if (a[j] > a[j + 1]) {
                     t = a[j];
                   a[j] = a[j + 1];
                   a[j + 1] = t;
              }
        }
   }
}
    void dispArray(int a[], int n) {
        System.out.println("\nThe elements after sorting are:");
               for (i = 0; i < n; i++) {
                System.out.print("\t" + a[i]);
     }
   }
}

class Main {
        public static void main(String args[]) { 
              int i, n, t, j;
        Scanner sc = new Scanner(System.in);
           Bubble b1 = new Bubble();
     System.out.println("Enter array size:");
        n = sc.nextInt();
        int a[] = new int[n];
   
               b1.readArray(a, n);
               b1.writeArray(a, n);
   
               b1.bubbleSort(a, n);
               b1.dispArray(a, n);
     }
}