public class Polymorphism {
    public static void main(String args[]){
        Calculator calc = new Calculator();
        System.out.println(calc.add(5,6));
        System.out.println(calc.add(5,6,7));
        System.out.println(calc.add(5.5,6.3));

        Deer d = new Deer();
        d.eats();

        Manager m = new Manager();
        // m.Employee("Alice", 30, 50000);
        m.Manager("Alice", 30, 50000, "HR");
        m.display();

    }
}

class Calculator{
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    double add(double a, double b){
        return a+b;
    }
}



class Animal{
    void eats(){
        System.out.println("eats anything");
    }

}

class Deer extends Animal{
    void eats(){
        System.out.println("eats grass");
    }
}

class Employee {
    String name;
    int age;
    double salary;
    void Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Salary: " + salary);
    }
}

class Manager extends Employee {
    String department;
    void Manager(String name, int age, double salary, String department) {
        super.Employee(name, age, salary);
        this.department = department;
    }
    void display() {
        super.display();
        System.out.println("Department: " + department);
    }
}




class S