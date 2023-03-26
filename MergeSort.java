import java.util.Scanner;
class MergeSort1 {
  public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
    int[] result = new int[arr1.length + arr2.length];
    int i = 0, j = 0, k = 0;
    while (i < arr1.length && j < arr2.length) {
      if (arr1[i] < arr2[j]) {
        result[k] = arr1[i];
        i++;
      } else {
        result[k] = arr2[j];
         j++;
      }
      k++;
    }
    while (i < arr1.length) {
      result[k] = arr1[i];
      i++;
      k++;
    }
    while (j < arr2.length) {
      result[k] = arr2[j];
      j++;
      k++;
    }
    return result;
  }
}
class MergeSort{
  public static void main(String[] args){
      int arr1[]={1,2,3,4,5,6};
       int arr2[]={7,8,9,10};
    MergeSort1 mergesort = new MergeSort1();
    int[] result = mergesort.mergeSortedArrays(arr1, arr2);
    
    for (int i = 0; i < result.length; i++) {
        System.out.print(result[i] + " ");
  }
}
}