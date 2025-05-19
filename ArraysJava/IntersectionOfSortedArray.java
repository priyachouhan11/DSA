//package DSA.ArraysJava;

import java.util.Arrays;

// Intersection Of Sorted Arrays
public class IntersectionOfSortedArray {
  /*
   * Find the intersection of two sorted arrays OR in other words, given 2 sorted arrays, find all the elements which occur in both arrays.
   * NOTE: For the purpose of this problem ( as also conveyed by the sample case ), assume that elements that appear more than once in both arrays should be included multiple times in the final output.
   */
  public static int[] intersect(final int[] A, final int[] B) {
    int lengthA = A.length;
    int lengthB = B.length;
    int size = Math.min(lengthA, lengthB);
    int arr[] = new int[size];
    int index =0;

    int i=0,j=0;

    while (i<lengthA && j<lengthB) {
      
        if(A[i]<B[j]) i++;
        else if(A[i]>B[j]) j++;
        else{
          arr[index++] = A[i];
          i++;
          j++;
        }
      }
    return Arrays.copyOf(arr, index);
  }

   public static void main(String[] args) {
    int arr1[] = {1, 2, 3, 3, 4, 5, 6};
    int arr2[] = {3,3,5};

    int ans[] = intersect(arr1, arr2);

    for(int i=0; i<ans.length;i++){
      System.out.print(ans[i]+" ");
    }

   }
}
