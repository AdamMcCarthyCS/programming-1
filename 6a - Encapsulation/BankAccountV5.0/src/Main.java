public class Main {
    public static void main(String[] args) {
        
        BankAccount bankAccount1 = new BankAccount("Elon Musk","123456789", 1500.0 );
        // deposit
        bankAccount1.balance = bankAccount1.balance+300;
        // Withdraw
        double withdrawAmount = 200.0;
        if (bankAccount1.balance >= withdrawAmount) {
            bankAccount1.balance -= withdrawAmount;
            System.out.println("Withdrawal sucessful");
        } else {
            System.out.println("Unable to withdraw €" + withdrawAmount + " for " + bankAccount1.name + " due to insufficient funds.");
        }
        System.out.println(bankAccount1.display());   // this  prints out the details to the console
    }
}

