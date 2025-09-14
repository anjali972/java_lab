class EmployeeManagement{
    String name;
    int id;

    static class Company{
        String companyName;
        String location;
        Company(String companyName,String location){
            this.companyName = companyName;
            this.location = location;
        }

        void displayCompany(){
            System.out.println("Company: "+companyName);
            System.out.println("location: "+location);
        }

    }
}

public class Employee{
    
}

