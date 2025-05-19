public class CountVowelsAndConsonants {
  public static void main(String[] arf){
    String s = "asdfghjkl $vqwertyuiop  zxcvnbmr";
    int vowel=0;
    int consonant = 0;
    for(int i=0;i<s.length();i++){
      char ch = Character.toLowerCase(s.charAt(i));
      if(ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
        vowel++;
      }
      else if(Character.isLetter(ch)) consonant++;
    }
    System.out.println("Vowels::"+vowel+"  Consonate: "+consonant);
  }
}
