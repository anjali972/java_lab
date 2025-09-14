class Employee {
    private double salary; 
    String name;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    class BonusCalculator {
        double calculateBonus() {
            return salary * 0.10;  
        }

        void displayBonus() {
            System.out.println("Bonus for " + name + " is: " + calculateBonus());
        }
    }
}

public class nested {
    public static void main(String[] args) {
        Employee emp = new Employee("Neha", 50000);

        Employee.BonusCalculator calc = emp.new BonusCalculator();
        calc.displayBonus();
    }
}

