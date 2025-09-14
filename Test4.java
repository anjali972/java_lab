public class Test4{
    public static void main(String[] args) {
        int bookcount = 5;
        int totalprice = 100;
        if(bookcount == 0){
            throw new ArithmeticException("Book count cannot be zero");

        }
        int pricepertbook = totalprice / bookcount;
        System.out.println("Price per book: " + pricepertbook);

    }
    public static void main(String[] args) {
        
}

