package DSA.ArraysJava;
import java.util.Arrays;

/*
 * Given an array A, of N integers A.
 * Return the highest product possible by multiplying 3 numbers from the array.
 * NOTE: The solution will fit in a 32-bit signed integer.
 */
public class HighestProduct {
  public static int maxp3(int[] A) {
    Arrays.sort(A);
    int n = A.length;
    int max = A[n-1]*A[n-2]*A[n-3];
    int min = A[0]*A[1]*A[n-1];
    return Math.max(max, min);
  }

  public static void main(String[] args) {
    int [] arr = {3,-4,1,1,4}; 
    System.out.println(" the highest possible product:- "+maxp3(arr));
   

  }
}
