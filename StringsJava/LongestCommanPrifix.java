//package DSA.StringsJava;

import java.util.Arrays;

// Longest Common Prefix
public class LongestCommanPrifix {
  /*
   * Given the array of strings A, you need to find the longest string S which is the prefix of ALL the strings in the array.
   * Longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1 and S2.
   * For Example: longest common prefix of "abcdefgh" and "abcefgh" is "abc"
   */

  public static String longestCommonPrefix(String[] A) {
    Arrays.sort(A);
    String first = A[0];
    String last = A[A.length-1];
    int minLength = Math.min(first.length(), last.length());

    int i=0;
    while (i<minLength && first.charAt(i)==last.charAt(i)) {
      i++;
    }
    return first.substring(0, i);

  }
  public static void main(String[] args) {
    String[] arr = { "geeksforgeeks", "geeks", 
                        		"geek", "geezer" };
                   
    System.out.println(longestCommonPrefix(arr));
  }
  
}
