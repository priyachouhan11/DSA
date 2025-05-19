class Searching_Sorting_Algo{
  public static void main(String[] arg){
    int arr[] = {4,9,274,2,86,26};
    bubbleSort(arr);
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+ " ");
    }
  }

  // LINEAR SEARCH
  /*
   * Used in small datasets
   * -----Bestcase-------------Averagecase----------wostcase---------space---------
   *       O(1)                    O(n)               O(n)           O(1)
   */
  public static int linearSearch(int[] arr, int target){
    for(int i=0;i<arr.length;i++){
      if(arr[i] == target) return i;
    }
    return -1;
  }

  // BINARY SEARCH
  /*
   *-----Bestcase-------------Averagecase----------wostcase---------space---------
   *       O(1)                  O(log n)              O(log n)           O(1) 
   * 
   * 
   * used in sorted array
   */
  public static int binarySearch(int arr[], int target){
    int low = 0, high = arr.length-1;

    while(low <= high){
      int mid = (low + high)/2;

      if(arr[mid] == target) return mid;
      else if (arr[mid] < target) low = mid+1;
      else high = mid-1;
    }
    return -1;
  }


  // BUBBLE SORT
  /*
   * Every pass adjacent elements compare and swap
   * badi value bubble ho kar last mein chali jati hai
   * -----Bestcase-------------Averagecase----------wostcase---------space---------
   *       O(n)                    O(n^2)               O(n^2)           O(1)
   */

   public static void bubbleSort(int[] arr){
    int n = arr.length;
    for(int i=0;i<n-1;i++){
      for(int j=0; j<n-1-i;j++){
        if(arr[j] > arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
   }


   // SELECTION SORT
   /*
    * har pass main min element dhoondo & usse correct position pe swap karo
    * -----Bestcase-------------Averagecase----------wostcase---------space---------
   *       O(n^2)                    O(n^2)               O(n^2)           O(1)
    */

    public static void selectionSort(int arr[]){
      int n = arr.length;

      for(int i=0; i< n-1;i++){
        int minIndx = i;
        for(int j=i+1;j<n;j++){
          if(arr[j]<arr[minIndx]){
            minIndx = j;
          }
        }
        int temp = arr[minIndx];
        arr[minIndx] = arr[i];
        arr[i] = temp;
      }
    }
}