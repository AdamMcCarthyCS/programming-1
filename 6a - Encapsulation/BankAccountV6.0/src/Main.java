public class Main {
    public static void main(String[] args) {
        
        BankAccount bankAccount1 = new BankAccount("Elon Musk","123456789", 1500.0 );
        // deposit
        bankAccount1.deposit(300);
        
        // Withdraw
        String withdrawMessage = bankAccount1.withdraw(200);
        System.out.println(withdrawMessage);
//        bankAccount1.withdraw(200); // Without withdraw message
        
        System.out.println(bankAccount1.display());   // this  prints out the details to the console
    }
}

