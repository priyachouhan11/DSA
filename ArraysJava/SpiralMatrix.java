package DSA.ArraysJava;

public class SpiralMatrix {
  public static void spiral_matrix(int n){
    int [][] arr = new int[n][n];
    //ArrayList<Integer> arr = new ArrayList<>();
    int left = 0;
    int right = n-1;
    int top = 0;
    int bottom = n-1;
    int num =1;

    while (top<=bottom && left<=right) {

      // print top row from left to right
      for(int i=left;i<=right;i++){
        arr[top][i] = num++;
      }
      top++;

      // print right colum from top to bottom
      for(int i=top;i<=bottom;i++){
        arr[i][right] = num++;
      }
      right--;

      // print bottom row from right to left(if exists)
      if(top <= bottom){
        for(int i=right;i>=left;i--){
          arr[bottom][i] = num++;
        }
        bottom--;
      }

      // print left column from bottom to top (if exists)
      if(left <= right){
        for(int i=bottom;i>=top;i--){
          arr[i][left] = num++;
        }
        left ++;
      }
    }

    for(int i=0; i<n;i++){
      for(int j=0;j<n;j++){
        //System.out.print("a["+i+"]"+"["+j+"] = "+arr[i][j]);
        System.out.print(arr[i][j]+"   ");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    int n = 5;
    spiral_matrix(n);
    
    // for(int i=0; i<n;i++){
    //   for(int j=0; j<n;i++){
    //     System.out.println("a["+i+"]"+"["+j+"] = "+spiral_matrix(n));
    //   }
    // }
  }
}
