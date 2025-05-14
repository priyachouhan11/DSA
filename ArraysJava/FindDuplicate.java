package DSA.ArraysJava;

import java.util.Arrays;
import java.util.HashSet;

public class FindDuplicate {
  public static int repeatedNumber(final int[] A) {
    Arrays.sort(A);
    HashSet<Integer> s = new HashSet<>();

    for(int i:A){
      if(s.contains(i)){
        return i;
      }
      else{
        s.add(i);
      }
    }
    return -1;
  }

  public static int repeatedNumber1(final int[] a){
    int n=a.length;
    for(int i=0;i<n;i++)
    {
        int temp=Math.abs(a[i]);
        int temp2=a[temp];
        if(temp2<0)//if this happens it will mean that a[temp] is already visited
        return temp;//which means that temp is already present in the array
        else
        a[temp]=-a[temp];
    }
    return -1;
  }

  public static void main(String[] args) {
    int [] arr = {3, 4, 1, 4, 1};
    System.out.println(repeatedNumber(arr));
    System.out.println(repeatedNumber1(arr));
  }
  
}
