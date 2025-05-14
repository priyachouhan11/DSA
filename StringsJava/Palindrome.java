package DSA.StringsJava;

public class Palindrome {
  public static int isPalindrome(String A) {
    //you have to ignore spaces, case, and all special characters
    String one = A.toUpperCase();
    System.out.println("one "+one);
    String two = one.replaceAll(" ", ""); 
    System.out.println("two "+two);
    String three = two.replaceAll("[^A-Z0-9]", ""); 
    System.out.println("three "+three);

    int j = three.length() - 1;

    for(int i=0; i<three.length()/2;i++){
      if(three.charAt(i) != three.charAt(j)) 
        return 0;
      else
        j--;
    }
    return 1;
  }

  public static boolean isPalindromeOrNot(String A){
    String ans = new StringBuilder(A).reverse().toString();
    if(A.equals(ans)) return true;
    return false;
  }
  public static void main(String[] args) {
    String s= "A man, a plan, a canal: Panama";
    System.out.println("with splaceam casses:"+isPalindrome(s));

    String s1 = "amanaplanacanalpanama";
    System.out.println("without splaceam casses:"+isPalindromeOrNot(s1));

  }
}
