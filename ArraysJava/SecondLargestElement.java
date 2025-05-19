// package DSA.ArraysJava;

public class SecondLargestElement{
  public static void main (String[] args){
    int arr[] = {1,8,2,75,48,17};
    int first_max = Integer.MIN_VALUE;
    int second_max = Integer.MIN_VALUE;

    for(int i=0;i<arr.length;i++){
      if(arr[i] > first_max){
        second_max = first_max;
        first_max = arr[i];
      }
      else if (arr[i] > second_max && arr[i]!= first_max){
        second_max = arr[i];
      }
    }
    System.out.println(second_max);
  }
}