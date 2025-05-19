//package DSA.ArraysJava;
// Kth Row of Pascal's Triangle
/*
 * Given an index k, return the kth row of the Pascal's triangle.
 * Pascal's triangle: To generate A[C] in row R, sum up A'[C] and A'[C-1] from previous row R - 1.
 */
public class PascalsTraingle {

  public static int[] getRow(int K) {
    int [] arr = new int[K];
    int prev = 1;
    arr[0] = 1;

    for(int i=1;i<K;i++){
      // nCr = (nCr-1 * (n - r + 1))/r 
      int curr = (prev * (K - i + 1))/i;
      arr[i] = curr;
      prev = curr;
    }
    return arr;
  }
    public static void main(String[] args) {
      int n = 5;
      int [] arr = getRow(n);

      for(int i=0; i<arr.length;i++){
        System.out.print(arr[i]+" ");
      }
      
  }
  
}
