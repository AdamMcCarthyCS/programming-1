public class BankAccount {
    String name;
    String accountNumber;
    double balance;
    
    public BankAccount() {
    }
    public BankAccount(String nm, String actNumber, double bal){
        name = nm;
        accountNumber = actNumber;
        balance = bal;
    }
    
    public void deposit(double lodgement) {
        balance += lodgement;
    }
    
    public String withdraw(double withdrawl) {
        if (withdrawl <= balance) {
            balance -= withdrawl;
            return "Withdrawl successful";
        } else {
            return "Unable to withdraw €" + withdrawl + " for " + name + " due to insufficient "
                + "funds.";
        }
    }
    
    public String display(){
        return "Name: " + name + ", Account Number: " + accountNumber + ", Balance: €" + balance;
    }
}

