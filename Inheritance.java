public class Inheritance{

    public static void main(String args[]) {
        // Fish f1 = new Fish();
        // f1.color = "golden";
        // System.out.println("Fish color: " + f1.color);
        // f1.breathe();

        // Dog d1 = new Dog();
        // d1.eats();

        // d1.walk();
        // System.out.println("Dog has " + d1.legs + " legs.");

        Employee e1 = new Employee();
        e1.setEmployeeDetails("Amit", 31, 5000);
        e1.displayInfo();

        Developer d1 = new Developer();

        d1.setDeveloperDetails("Amit", 31, 5000, "Java");


        d1.displayDeveloperInfo();

        Manager m1 = new Manager();
        m1.setMangerDetails("Rahul", 32, 6000, "IT");
        m1.displayManagerInfo();
        
        SeniorManager sm1 = new SeniorManager();
        sm1.setSeniorManagerDetails("Sita", 33, 7000, "HR", "Team A");
        sm1.displaySeniorManagerInfo();
}
}
// class Animal{
//     String color;
//     void eats(){
//         System.out.println("eating...");
//     }
//     protected void breathe(){
//         System.out.println("breathing...");
//     }

// }

// class Fish extends Animal{
//     void swim(){
//         System.out.println("swimming...");
//     }

// }


// class Mammal extends Animal{
//     void walk(){
//         System.out.println("walking...");
//     }

// }

// class Dog extends Mammal{
//     int legs = 4;
//     void bark(){
//         System.out.println("barking...");
//     }
// }

class Employee {
    String name;
    int id;
    int salary;
    void setEmployeeDetails(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }
}

class Manager extends Employee {
    String department;
    void setMangerDetails(String name, int id, int salary, String department){
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.department = department;
    }
    void displayManagerInfo() {
        displayInfo();
        System.out.println("Department: " + department);
    }
}

class SeniorManager extends Manager {
    String team;
    void setSeniorManagerDetails(String name, int id, int salary,String department,String team) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.department = department;
        this.team = team;
    }
    void displaySeniorManagerInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
        System.out.println("Team: " + team);
    }
}

class Developer extends Employee {
    String programmingLanguage;
    void setDeveloperDetails(String name, int id, int salary,String programmingLanguage) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.programmingLanguage = programmingLanguage;
    }
    void displayDeveloperInfo() {
        super.displayInfo();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}
