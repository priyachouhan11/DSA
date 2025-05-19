//package DSA.ArraysJava;

public class AddOneToNumber {
  public static void main(String[] args) {
    int arr[] = {1,2,3};
    plusOne(arr);
    //System.out.println(plusOne(arr));
    
  }

  public static int[] plusOne(int[] A) {
    int sum = 0;
    int n = A.length;
    for(int i=0;i<A.length;i++){
      sum += A[i];
      sum *= 10;
    }
    sum = sum/10;
    sum = sum+1;
    String s = Integer.toString(sum); 
    for(int i=0; i<s.length(); i++){
        A[i] = Character.getNumericValue(s.charAt(i));
    }

    System.out.println("Result is");
    for(int i=0;i<n;i++){
      System.out.print(A[i]+" ");
    }
    return A;
  }

  public static int[] addOneByCopilot(int[] digits) {
    int n = digits.length;

    // Step 1: Reverse the digits array
    for (int i = 0; i < n / 2; i++) {
        int temp = digits[i];
        digits[i] = digits[n - i - 1];
        digits[n - i - 1] = temp;
    }

    // Step 2: Initialize carry to 1
    int carry = 1;

    // Step 3: Loop through the reversed array and add carry
    for (int i = 0; i < n; i++) {
        int sum = digits[i] + carry;
        digits[i] = sum % 10; // Store the last digit in the current position
        carry = sum / 10;     // Keep the carry

        if (carry == 0) {
            // No carry means we can safely break out of the loop
            break;
        }
    }

    // Step 5: If carry is not zero, add an additional digit
    if (carry != 0) {
        int[] result = new int[n + 1];
        System.arraycopy(digits, 0, result, 0, n);
        result[n] = carry;
        
        // Step 4: Reverse the digits array back to original order
        for (int i = 0; i < result.length / 2; i++) {
            int temp = result[i];
            result[i] = result[result.length - i - 1];
            result[result.length - i - 1] = temp;
        }
        
        return result;
    }

    // Step 4: Reverse the digits array back to original order
    for (int i = 0; i < n / 2; i++) {
        int temp = digits[i];
        digits[i] = digits[n - i - 1];
        digits[n - i - 1] = temp;
    }

    return digits;
  }

  public int[] plusOneByInterviewBit(int[] A) {
    if(A.length==0){
        return A;
    }
    boolean isFirstOne = true;
    for(int i=A.length -1; i>=0; i--){
        A[i] = A[i]+1;
        if(A[i]<10){
            isFirstOne=false;
           break;
        }
        A[i] = 0;
    }
    return resizeArray(A,isFirstOne);
}

  private int[] resizeArray(int[] a, boolean isFirstOne) {
      if(isFirstOne){
          int[] result = new int[a.length + 1];
          result[0]=1;
          result[1]=0;
          if (a.length - 2 >= 0) System.arraycopy(a, 1, result, 2, a.length - 2);
          return result;
      }
      int zeroIndex = 0;
      while (a[zeroIndex]==0){
          zeroIndex++;
      }
      if(zeroIndex>0){
          int[] result = new int[a.length -zeroIndex];
          System.arraycopy(a, zeroIndex, result, 0, a.length - zeroIndex);
          return result;
      }
          return a;

  }
}
