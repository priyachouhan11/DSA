package DSA.ArraysJava;

public class min_max {
  public static void main(String[] args) {
    int [] arr = {50,30,100,1};
    System.out.println("minimum value : "+min(arr));
    System.out.println("maximun value : "+max(arr));

  }

  public static int min(int arr[]){
    int min = arr[0];
    for(int i=0;i<arr.length;i++){
      if(arr[i] < min){
        min = arr[i];
      }
    }
    return min;
  }

  public static int max(int arr[]){
    int max = arr[0];

    for (int i=0; i<arr.length;i++){
      if(arr[i] > max){
        max = arr[i];
      }
    }
    return max;
  }
}

