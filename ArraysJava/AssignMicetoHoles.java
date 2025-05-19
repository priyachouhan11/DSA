//package DSA.ArraysJava;

import java.util.Arrays;

public class AssignMicetoHoles {

  /*
   * There are N Mice and N holes that are placed in a straight line. Each hole can accomodate only 1 mouse.
   * The positions of Mice are denoted by array A and the position of holes are denoted by array B.
   * A mouse can stay at his position, move one step right from x to x + 1, or move one step left from x to x − 1. Any of these moves consumes 1 minute.
   * Assign mice to holes so that the time when the last mouse gets inside a hole is minimized.
   */
  public static int mice(int[] A, int[] B) {
    Arrays.sort(A);
    Arrays.sort(B);
    int max=0;
    
    for(int i=0;i<A.length;i++){
      int diff = Math.abs(A[i]-B[i]);
      max = Math.max(diff,max);
    }
    return max;

  }
  public static void main(String[] args) {
    int miceN[] = {-4, 2, 3};
    int holeN[] = {0, -2, 4};

    System.out.println("the minimum time when the last nouse gets inside the holes:- "+mice(miceN, holeN));
  }
  
}
