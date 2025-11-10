public class Main {
    public static void main(String[] args) {
        
        BankAccount bankAccount1 = new BankAccount("Elon Musk","123456789", 1500.0 );
        // deposit
        bankAccount1.deposit(300);
        
        // Withdraw
        String withdrawMessage = bankAccount1.withdraw(200);
        System.out.println(withdrawMessage);
//        bankAccount1.withdraw(200); // Without withdraw message
        
        // Use the getters to print the bank account owner
        System.out.println("The owner of this bank account is: " + bankAccount1.getName());
        
        // Use the setter to change the bank account owner
        bankAccount1.setName("Adam McCarthy");
        
        // Print new value
        System.out.println("The updated owner of this band account is: " + bankAccount1.getName());
        
        // My own changes:
        // ---------------
        
        // Print account number:
        System.out.println("The account number for this bank account is: "
            + bankAccount1.getAccountNumber());
        
        // Change account number:
        bankAccount1.setAccountNumber("9876543210");
        
        // Print updated account number
        System.out.println("The updated account number for this bank account is: "
            + bankAccount1.getAccountNumber());
        
        // Print account balance
        System.out.println("The balance of this bank account is: €" + bankAccount1.getBalance());
        
        // Change the account balance
        bankAccount1.setBalance(0);
        
        // print updated account balance
        System.out.println("The updated balance of this bank account is: €"
            + bankAccount1.getBalance());
        
        // print all account details
        System.out.println(bankAccount1.display());   // this  prints out the details to the console
    }
}

