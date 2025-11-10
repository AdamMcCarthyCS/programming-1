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
    
    public String display(){
        return "Name: " + name + ", Account Number: " + accountNumber + ", Balance: €" + balance;
    }
}

