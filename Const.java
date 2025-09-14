public class Const{
    public static void main(String args[]){
        // pen p1 = new pen(5,"blue");
        // System.out.println("Pen color: " + p1.color);
        // Student s1 = new Student();
        // Student s2 = new Student("John");
        // Student s3 = new Student(101);
        // System.out.println("Student 2 Name: " + s2.name);
        // System.out.println("Student 3 Roll: " + s3.roll);
        // System.out.println("Student 1 Name: " + s1.name);

        Employee e1 = new Employee();
        Employee e2 = new Employee("Amit",31);
        e2.salary = 3000;
        e1.displayInfo();
        e2.displayInfo();
        Employee e3 = new Employee("Rahul",32,5000);
        e3.displayInfo();
        



    }
}

// public class Pen{
//     int tip;
//     String color;
    

// }
class Student{
    String name;
    int roll;
    Student(){
        System.out.println("constructor is called");
    }
    Student(String name){
        this.name = name;
    }
    Student(int roll){
        this.roll = roll;
    }

}

class Employee{
    String name;
    int id ; 
    int salary;
    Employee(){
        System.out.println("Employee constructor is called");
    }
    Employee(String name , int id){
        this.name = name;
        this.id = id;
    }
    Employee(String name, int id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}