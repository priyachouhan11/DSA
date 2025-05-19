//package DSA.ArraysJava;
public class MajorityElement {
  public static void main(String[] args) {
    int [] arr = {1,1,2,2,7,7,7,7};
    System.out.println(majorElement(arr));
  }
  
  public static int majorElement(final int[] A) {
    int count =0;
    int majorElement = 0;
    int n = A.length;

    for(int i=0; i<n;i++){
      if(count == 0){
        majorElement = A[i];
        count ++;
      }
      if(majorElement == A[i]){
        count ++;
      }
      else count--;
    }
    int countMajor = 0;
    for(int i=0; i<n;i++){
      if(majorElement == A[i])  countMajor++;
      if(countMajor > n/2) return majorElement;

    }
    return -1;
  }

}
