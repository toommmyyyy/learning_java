public class String_compare {
  static String s1="Welcome";
  static String s2="Welcome";
  static String s3= "Zebra";

  //static String s4=new ("Sachin");
  public static void main(String[] args) {
    System.out.println(s1.compareTo(s2));
    System.out.println(s1.compareTo(s3));
    System.out.println(s3.compareTo(s1));
    System.out.println(s1==s2);
    System.out.println(s1+s3);
    
  }

}
