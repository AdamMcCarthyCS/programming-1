public class BankAccount {
    String name;
    String accountNumber;
    double balance;

    public BankAccount() {
    }
    public BankAccount(String nm, String actNumber, double bal){
        name = nm;
        accountNumber = actNumber;
        if (bal >= 0) {
            balance = bal;
        } else {
            balance = 0;
        }
    }

}


