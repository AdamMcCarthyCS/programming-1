public class Main {
    
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("Elon Musk", "123456789", 1500.0);
        BankAccount bankAccount2= new BankAccount("Elon Dusk", "000000000", 500.0);
        // this  prints out the details to the console
        System.out.println("The balance of the bank account is : "+ bankAccount1.getBalance());
        System.out.println("The balance of the bank account 2 is : "+ bankAccount2.getBalance());
        
    }
}
