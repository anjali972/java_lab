
class Employee {
    String name;
    int id;
    double salary;
    String department;
    String designation;
    int leaveBalance;


    public void displayInfo() {
        System.out.println("Employee Details");
        System.out.println("Name : " + name);
        System.out.println("ID: " + id);
        System.out.println("Department : " + department);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
        System.out.println("Leave Bal. : " + leaveBalance + " days");
        
    }


    public void increaseSalary(double amount) {
        salary += amount;
        System.out.println(name + "'s salary increased by ₹" + amount + ". New salary: ₹" + salary);
    }

    public void increaseSalary(double percentage, boolean isPercentage) {
        if (isPercentage) {
            salary += salary * (percentage / 100);
            System.out.println(name + "'s salary increased by " + percentage + "%. New salary: ₹" + salary);
        }
    }


    public double getAnnualSalary() {
        return salary * 12;
    }

    public void applyLeave(int days) {
        if (days <= leaveBalance) {
            leaveBalance -= days;
            System.out.println(days + " days leave approved for " + name + ". Remaining leave: " + leaveBalance);
        } else {
            System.out.println("Leave request denied for " + name + ". Not enough leave balance.");
        }
    }


    public void addBonus(double bonusAmount) {
        salary += bonusAmount;
        System.out.println("Bonus of ₹" + bonusAmount + " added for " + name + ". New salary: ₹" + salary);
    }


    public void deductTax(double taxPercentage) {
        double taxAmount = salary * (taxPercentage / 100);
        salary -= taxAmount;
        System.out.println("Tax of " + taxPercentage + "% deducted (" + taxAmount + "). New salary: ₹" + salary);
    }

    public void promote(String newDesignation, double hikePercentage) {
        designation = newDesignation;
        increaseSalary(hikePercentage, true);
        System.out.println(name + " promoted to " + designation);
    }
}
public class Employeedemo {
    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.name = "Alice";
        emp1.id = 101;
        emp1.salary = 50000;
        emp1.department = "IT";
        emp1.designation = "Software Engineer";
        emp1.leaveBalance = 15;


        emp1.displayInfo();


        emp1.increaseSalary(5000);
        emp1.increaseSalary(10, true);


        System.out.println("Annual Salary: ₹" + emp1.getAnnualSalary() + "\n");


        emp1.addBonus(8000);

        emp1.deductTax(10);

        emp1.applyLeave(5);
        emp1.applyLeave(20);

        emp1.promote("Senior Software Engineer", 15);

        emp1.displayInfo();
    }
}
