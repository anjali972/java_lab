public class OOPS {
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.color = "blue";
        p1.tip = 5;

        p1.changeColor("Blue");
        System.out.println("The color of the pen is: " + p1.color);

        Employee e1 = new Employee();
        e1.setName("John Doe");
        e1.setAge(30);
        e1.setDesignation("Software Engineer");
        e1.setSalary(70000);
        System.out.println("Employee Name: " + e1.Name);
        System.out.println("Employee Age: " + e1.age);
        System.out.println("Employee Designation: " + e1.designation);
        System.out.println("Employee Salary: " + e1.salary);
    }
}

class Pen{
    String color;
    int tip;
    void changeColor(String newcolor){
        color = newcolor;
    }
    void changetip(int newtip){
        tip = newtip;
    }

}

class Employee{
    String Name;
    int age;
    String designation;
    int salary;
    String department;
    int leaveBalance;

    void setName(String name){
        Name = name;
    }
    void setAge(int ag){
        age = ag;
    }
    void setDesignation(String desig){
        designation = desig;
    }
    void setSalary(int sal){
        salary = sal;
    }

    void setDepartment(String department){
        department = department;
    }
    public void increaseSalary(int increment){
        salary += increment;
    }

}// this keyword is used to refer to current object

class Employee {
    private double salary;
    String department;
    protected String name;
    public int id;

    public void setSalary(double s) {
        salary = s;
    }

    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }

    private void showSalary() {
        System.out.println("Salary: " + salary);
    }

    public void displayFullDetails() {
        displayInfo();
        showSalary();
    }

    protected void increaseSalary(double amount) {
        salary += amount;
        System.out.println("Salary increased by ₹" + amount);
    }
}

