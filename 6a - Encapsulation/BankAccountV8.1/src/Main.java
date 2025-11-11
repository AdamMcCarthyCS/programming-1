public class Main {
    
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("Elon Musk", "123456789", -500.0);
        
        System.out.println("The balance of the bank account is : "+ bankAccount1.getBalance());
        // this  prints out the details to the console
    }
}
