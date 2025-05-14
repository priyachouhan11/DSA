package DSA.OOPsJava;
// chatgpt
// https://chatgpt.com/share/68208176-fb10-8005-ad9d-154f183d1111
public class StudentClasss {
  public static class Student { // creating a new data type
    String name;
    int rolNo;
    double percentage;
    
  }
  public static void main(String[] args) {
    Student s1 = new Student();
    s1.name = "Priya";
    s1.rolNo = 11;
    s1.percentage = 70.6;
    System.out.println(s1.name+" "+s1.rolNo+" "+s1.percentage);

    Student s2 = new Student();
    s2.name = "Chouhan";
    s2.rolNo = 16;
    s2.percentage = 84;
    System.out.println(s2.name+" "+s2.rolNo+" "+s2.percentage);
  }
}
