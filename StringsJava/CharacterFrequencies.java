package DSA.StringsJava;

import java.util.LinkedHashMap;

public class CharacterFrequencies {
  public int[] solve(String A){
    LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<>();
    for(char c:A.toCharArray()){
      lhm.put(c,lhm.getOrDefault(c, 0)+1);
    }
    int [] ans = new int[lhm.size()];
    int index=0;
    for(int i:lhm.values()){
      ans[index++] = i;
    }
    return ans;
  }
 public static void main(String[] args) {
  CharacterFrequencies characterFrequencies = new CharacterFrequencies();
  String test = "interviewbit";
  int[] result = characterFrequencies.solve(test);
  
  for (int val : result) {
      System.out.print(val + " ");
  }
 } 
}
