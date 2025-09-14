import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: ₹" + salary);
    }
}

public class catchdemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Employee ID: ");
            int id = Integer.parseInt(sc.nextLine()); 

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Employee Salary: ");
            double salary = Double.parseDouble(sc.nextLine()); 

            Employee emp = new Employee(id, name, salary);

            Employee[] employees = {
                new Employee(101, "Alice", 50000),
                new Employee(102, "Bob", 60000),
                emp
            };

            System.out.print("Enter index of employee to view (0–2): ");
            int index = sc.nextInt(); 
            employees[index].displayDetails();
            System.out.print("Enter number of working days: ");
            int days = sc.nextInt();
            double perDay = salary / days; 
            System.out.println("Per Day Salary = ₹" + perDay);

        }
        catch (NumberFormatException e) {
            System.out.println("Invalid input: Please enter numeric values where required.");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Employee index is out of range.");
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero (working days cannot be zero).");
        }
        catch (Exception e) {
            System.out.println("Unexpected Error: " + e);
        }

        System.out.println("Employee Management System continues smoothly...");
        sc.close();
    }
}
