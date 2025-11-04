public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount("Elon Musk", "123456789", 1500.0);

        double balance = 1500.0;
        double depositAmount = 300.0;
        // deposit and withdrawal
        bankAccount1.balance += depositAmount;
        // Withdraw
        double withdrawAmount = 200.0;
        if (bankAccount1.balance >= withdrawAmount) {
            bankAccount1.balance -= withdrawAmount;
        } else {
            System.out.println("Unable to withdraw €" + withdrawAmount + " for " + bankAccount1.name + " due to insufficient funds.");
        }
        System.out.println("Name: " + bankAccount1.name + ", Account Number: " + bankAccount1.accountNumber + ", Balance: €" + bankAccount1.balance);
    }

}