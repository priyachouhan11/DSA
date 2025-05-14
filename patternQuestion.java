package DSA;
import java.util.Scanner;

public class patternQuestion {

  static void starPlus(int n){
    System.out.println("-------- starPlus --------");
    int mid = (n/2)+1;
    for(int i=1;i<=n;i++){
      for (int j = 1; j <= n; j++) {
        if(i == mid || j==mid){
          System.out.print("* ");
        }
        else{
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }

  static void hollowRectangle(int n, int m){
    System.out.println("-------- hollowRectangle --------");
    for(int i=1;i<=n;i++){
      for (int j=1; j <= m; j++) {
        if(i==1 || i==n || j==1 || j==m){
          System.out.print("* ");
        }
        else{
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }

  static void starCross(int n){
    System.out.println("-------- starCross --------");
    for(int i=1;i<=n;i++){
      for (int j = 1; j <= n; j++) {
        if(i == j || i+j == n+1){
          System.out.print("* ");
        }
        // else if (i+j == n){
        //   System.out.print("* ");
        // }
        else{
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter row: ");
    int n = sc.nextInt();
    System.out.println("Enter coloum: ");
    int m = sc.nextInt();

    starCross(n);

    hollowRectangle(n, m);

    starPlus(n);
    
    sc.close();
  }
}