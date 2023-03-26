import java.util.*;

class Insertion {
    int n, i, j;
    Scanner sc = new Scanner(System.in);

    void readArray(int a[], int n) {
        System.out.println("Enter Elements to Array:");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
    }

    void writeArray(int a[], int n) {
        System.out.println("The Elements Before Insertion Sorting is:");
        for (i = 0; i < n; i++) {
            System.out.print("\t" + a[i]);
        }
        System.out.println();
    }

    void insertionSort(int a[], int n) {
         for(i=1;i<=n-1;i++) {
            for(j=i;j>0 && a[j-1]>a[j];j--){
                    t=a[j];
                   a[j]=a[j-1];
               a[j-1]=t;
            }
    }

    void dispArray(int a[], int n) {
        System.out.println("The Elements After Sorting is:");
        for (i = 0; i < n; i++) {
            System.out.println("\t" + a[i]);
        }
    }
}

class InsertionTechnique2 {
    public static void main(String args[]) {
        int i, n, t, j;
        Scanner sc = new Scanner(System.in);
        Insertion b1 = new Insertion();
        System.out.println("Enter array size:");
        n = sc.nextInt();
        int a[] = new int[n];

        b1.readArray(a, n);
        b1.writeArray(a, n);

        b1.insertionSort(a, n);
        b1.dispArray(a, n);
    }
}
