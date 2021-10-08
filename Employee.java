
public class Employee {
  int employee_number;
  String name;
  String address;
  String dob;
  String date_of_joining;

  // constructor
  Employee() {}

  Employee(int eid_, String name_, String address_, String dob_, String date_of_joining_) {
    employee_number = eid_;
    name = name_;
    address = address_;
    dob = dob_;
    date_of_joining = date_of_joining_;

  }

  void display() {
    System.out.println(employee_number + "  " + name + "  " + address + " " + dob + " " + date_of_joining);
  }
}

class Salary extends Employee {
  int basic_salary;
  int da;
  int hra;
  int pf;

  Salary(int basic_salary_, int da_, int hra_, int pf_) {
    super(1, "Chamanlal", "Delhi", "12/02/1997", "01/01/2021");
    basic_salary = basic_salary_;
    da = da_;
    hra = hra_;
    pf = pf_;
  }

  void display() {
    long total_salary = basic_salary + da + hra + pf;
    System.out.println(

        employee_number + "  " + name + "  " + address + " " + dob + " " + date_of_joining + " " + total_salary);

  }
}

class Wagers extends Employee {
  int hours_worked;
  int perhour_payment;

  Wagers(int hours_worked_, int perhour_payment_) {
    super(1, "Chamanlal", "Delhi", "12/02/1997", "01/01/2021");
    hours_worked = hours_worked_;
    perhour_payment = perhour_payment_;
  }

  void display() {
    long wage = hours_worked * perhour_payment;
    System.out.println(employee_number + "  " + name + "  " + address + " " + dob + " " + date_of_joining + " " + wage);

  }
}

class Main {
  public static void main(String[] args) {
    // Employee e0= new Employee();
    Employee e1 = new Employee(1, "Chamanlal", "Delhi", "12/02/1997", "01/01/2021");
    Employee e2 = new Employee(2, "Barfilal", "Katra", "22/05/1998", "01/01/2021");
    Salary s1 = new Salary(100, 10, 10, 20);
    Wagers w1=new Wagers(10, 300);
    e1.display();
    e2.display();
    s1.display();
    w1.display();
    
  }
}
