public class Main {
    
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("itententen", "123456789", 1500.0);
        BankAccount bankAccount2= new BankAccount("itentenwrong", "000000000", 500.0);
        // this  prints out the details to the console
        System.out.println("Correct name: " + bankAccount1.getName());
        System.out.println("Incorrect name: " + bankAccount2.getName());
        
        
    }
}
