final class HRDepartment {
    private final String policy = "No employee can take more than 30 leaves per year.";

    public void showPolicy() {
        System.out.println("HR Policy: " + policy);
    }
}



public class finalclass {
    public static void main(String[] args) {
        HRDepartment hr = new HRDepartment();
        hr.showPolicy();
    }
}

