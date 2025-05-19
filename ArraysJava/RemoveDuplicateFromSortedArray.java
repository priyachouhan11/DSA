//package DSA.ArraysJava;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicateFromSortedArray {

  public static int removeDuplicates(ArrayList<Integer> a) {
    HashSet<Integer> ans = new HashSet<>(a);
    a.clear();
    a.addAll(ans);
    return a.size();
	}

  public static void main(String[] args) {
    //int arr1[] = {1,1,1,1,1,1,1,5,7,5,25,4};
    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(1);
    arr.add(1);
    arr.add(2);
    arr.add(1);
    arr.add(2);
    arr.add(17);
    arr.add(14);
    arr.add(2);
    arr.add(1);

    System.out.println("Size of ArrayList: "+arr.size());
    System.out.println("After remove Duplicate element in array: "+removeDuplicates(arr));
    
  }
}