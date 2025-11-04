public class BankAccount {
    String name;
    String accountNumber;
    double balance;

    public BankAccount() {
    }
    public BankAccount(String nm, String actNumber, double bal){
        accountNumber = actNumber;

        // validate name
        if (nm.length() <= 20) {
            name = nm;
        } else {
            name = nm.substring(0, 20);
        }

        // validate initial balance
        if (bal >= 0) {
            balance = bal;
        } else {
            balance = 0;
        }
    }

}
