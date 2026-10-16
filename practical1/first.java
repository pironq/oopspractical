class Student{
  int rollNumber;
  String name;
  double marks1, marks2, marks3;

  Student(int rollnumber, String name, Double marks1, double marks2, double marks3){
    this.rollNumber = rollnumber;
    this.name = name;
    this.marks1 = marks1;
    this.marks2 = marks2;
    this.marks3 = marks3;
  }
  double calculateTotal(){
    return marks1 + marks2 + marks3;
  }
  double calculatePercentage(){
    return calculateTotal() / 3;
  }
  void display(){
    System.out.println("Roll Number :" + rollNumber);
    System.out.println("Name :" + name);
    System.out.println("Total Markss :" + calculateTotal());
    System.out.println("Percentage : " + calculatepercentage());
    
  }
  void student(String[] args) {
    Student student1 = new Student(101, "Naman", 70.3, 67.9, 80);
    Student student2 = new Student(102, "Rishav", 50, 38.5, 66);
    Student student3 = new Student(103, "Rahul", 88, 73, 34.1);

    student1.display();
    student2.display();
    student3.display();
  }
}
