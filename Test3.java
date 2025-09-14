import java.util.scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.println("Enter n: ");
            int n = sc.nextInt();
        }
        catch(NumberFormatException e) {
            System.out.println("Number format exception occurred: " + e.getMessage());
        }
        catch(ArithmeticException e) {
            System.out.println("Arithmetic exception occurred: " + e.getMessage());
        }
        catch(InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
        }
        catch(Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        finally {
            sc.close();
        }
    }
}   

