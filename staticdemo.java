public class staticdemo {
    public static void main(String args[]) {
        Employee e1 = new Employee();
        e1.name = "Amit";
        e1.id = 101;
        e1.displayEmployee();

        Employee e2 = new Employee();
        e2.name = "Rahul";
        e2.id = 102;
        e2.displayEmployee();
        Employee.displayCompany();
    }
    

}


class Employee{
    String name;
    int id;

    static String companyName = "TechCorp";

    void displayEmployee(){
        System.out.println("Name: " );
        System.out.println("ID: " + id);
        System.out.println("Company: " + companyName);
        System.out.println("-------------------");

    }

    static void displayCompany(){
        System.out.println("Company: " + companyName);
    }
}