package DSA.ArraysJava;

public class BestTimeToBayACell {
  /*
   * Say you have an array, A, for which the ith element is the price of a given stock on day i.
   * If you were only permitted to complete at most one transaction (i.e, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
   * Return the maximum possible profit.
   */
  public static int maxProfit(final int[] A) {
    int minStock= A[0];
    int res = 0;

    for(int i=0; i<A.length;i++){
      minStock = Math.min(minStock, A[i]);
      res = Math.max(res, A[i]-minStock);
    }
    return res;
  }

  public static void main(String[] args) {
    int arr[] = {7,5,8,0,1,4};
    System.out.println(maxProfit(arr));
  }
  
}
