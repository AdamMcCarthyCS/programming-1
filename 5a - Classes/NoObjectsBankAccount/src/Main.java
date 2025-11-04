public class Main {
    public static void main(String[] args) {
        String name = "Elon Musk";
        String accountNumber = "123456789";
        double balance = 1500.0;

        // Deposit
        double depositAmount = 300.0;
        balance += depositAmount;

        // Withdraw
        double withdrawAmount = 200.0;
        if (balance >= withdrawAmount) {
            balance -= withdrawAmount;
        } else {
            System.out.println("Unable to withdraw €" + withdrawAmount + " for " + name + " due to insufficient funds.");
        }

        System.out.println("Name: " + name + ", Account Number: " + accountNumber + ", Balance: €" + balance);
    }
}

