//package DSA.StringsJava;

import java.util.Stack;

public class Parantheses {
  public static void main(String[] args) {
    String s = "(())))";
    System.out.println("ans: "+MinimumParantheses(s));
  }

  public static int MinimumParantheses(String A){
    Stack<Character> stack = new Stack<>();
    
    for(int i=0;i<A.length();i++){
      char item = A.charAt(i);
      if(!stack.empty() && stack.peek()=='(' && item==')'){
        stack.pop();
        continue;
      }
      stack.push(item);
    }
    if(stack.empty()) return 0;
    return stack.size();
  }


}
