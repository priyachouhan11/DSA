package DSA.leetcode;

import java.util.Arrays;

public class merge {

  public static void main(String[] args) {
    int[] A = {4,5,6,0,0,0};
    int[] B = {1,2,3};
    int m = 3;
    int n = 3; 
    merge1(A, m, B, n);
    System.out.println(""+Arrays.toString(A));
  }

  public static void merge1(int[] nums1, int m, int[] nums2, int n) {

    int l = m-1;
    int r = n-1;
    int f = n+m-1;

    while(r>=0){
        if(l>=0 && nums1[l]>nums2[r]){
            nums1[f--] = nums1[l--];
        }
        else{
            nums1[f--] = nums2[r--];
        }
    }


    // System.arraycopy(nums2,0,nums1,m,n);
  //   for (int i = 0; i < n; i++) {
  //     nums1[m + i] = nums2[i];
  //  }
  //  System.out.println(""+Arrays.toString(nums1));

  //   int start = 0;
  //   int end = nums1.length-1;

  //   while (start<end) {
  //     // if(nums1[start] < nums1[end]){
  //       int temp = nums1[start];
  //       nums1[start] = nums1[end];
  //       nums1[end] = temp;
  //     // }
  //     start++;
  //     end--;
  //   }


    // for(int i=0;i<nums1.length-1;i++){
    //   if(nums1[i]>nums1[i+1]){
    //     int temp = nums1[i];
    //     nums1[i] = nums1[i+1];
    //     nums1[i+1] = temp;
    //   }
    // }
  }
}