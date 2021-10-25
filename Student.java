public class Student {
  int e_no;
  String name;
  int age;
  String phone_no;
  int mark_Sub_1;
  int mark_Sub_2;

  // constructor
  Student(int e, String n, int a, String p, int m1, int m2) {
    e_no = e;
    name = n;
    age = a;
    phone_no = p;
    mark_Sub_1 = m1;
    mark_Sub_2 = m2;
  } // method to calculate total marks

  int total_marks() {
    return (mark_Sub_1 + mark_Sub_2);
  }

  void display() {
    System.out.println(e_no + "  " + name + "  " + age + "  " + phone_no + "     " + mark_Sub_1 + "     " + mark_Sub_2
        + "        " + total_marks());
  }

  public static void main(String[] args) {
    Student s1 = new Student(1, "Shaurya", 19, "9887789076", 95, 60);
    Student s2 = new Student(2, "Virat ", 23, "9687903234", 90, 70);
    System.out.println("ID  Name   Age  Phone_no  Mark_sub1  Mark_sub2  Total_mark");
    s1.display();
    s2.display();
  }
}
