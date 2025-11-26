package java_files;

public class Student {
  String name;
  int age;
  double marks;
  static String collegeName = "Garden City University";

  Student() {
    name = "Unknown";
    age = 18;
    marks = 0.0;
  }

  Student(String n, int a, double m) {
    this.name = n;
    this.age = a;
    this.marks = m;
  }

  void displayDetails() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Marks: " + marks);
    System.out.println("College: " + collegeName);
    checkResult(); // Nested Method Call
  }

  void checkResult() {
    if (marks >= 50) {
      System.out.println("Status: Passed");
    } else {
      System.out.println("Status: Failed");
    }
  }

  static void updateCollege(String newCollege) {
    collegeName = newCollege;
  }

  public static void main(String[] args) {
    Student st1 = new Student();

    // Creating object using parameterized constructor
    Student st2 = new Student("Kush", 22, 88.5);

    // Accessing static method to update a shared variable
    Student.updateCollege("School of Engineering and Technology");

    // Calling methods using objects
    System.out.println("Student 1 Information:");
    st1.displayDetails();

    System.out.println();

    System.out.println("Student 2 Information:");
    st2.displayDetails();
  }
}
