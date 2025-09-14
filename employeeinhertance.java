
class Employee {
    String name;
    int id;
    double salary;


    public Employee() {
        System.out.println("Employee constructor called!");
    }

    public void setEmployeeDetails(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}


class Manager extends Employee {
    String department;

    public void setManagerDetails(String name, int id, double salary, String department) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.department = department;
    }

    public void showManagerInfo() {
        displayDetails(); 
        System.out.println("Department: " + department);
    }
}

class SeniorManager extends Manager {
    int teamSize;

    public void setSeniorManagerDetails(String name, int id, double salary, String department, int teamSize) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.department = department;
        this.teamSize = teamSize;
    }

    public void showSeniorManagerInfo() {
        showManagerInfo(); 
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    public void setDeveloperDetails(String name, int id, double salary, String programmingLanguage) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.programmingLanguage = programmingLanguage;
    }

    public void showDeveloperInfo() {
        displayDetails(); 
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

public class employeeinhertance {
    public static void main(String[] args) {
        
        System.out.println("=== Single Inheritance Example ===");
        Manager m1 = new Manager();
        m1.setManagerDetails("Alice", 101, 75000, "HR");
        m1.showManagerInfo();

        System.out.println();

        System.out.println("=== Multilevel Inheritance Example ===");
        SeniorManager sm1 = new SeniorManager();
        sm1.setSeniorManagerDetails("Bob", 102, 120000, "IT", 15);
        sm1.showSeniorManagerInfo();

        System.out.println();

        System.out.println("=== Hierarchical Inheritance Example ===");
        Developer d1 = new Developer();
        d1.setDeveloperDetails("Charlie", 103, 90000, "Java");
        d1.showDeveloperInfo();
    }
}

