public class BankAccount {
    //-----------//
    //  fields   //
    //-----------//
    private String name;
    private String accountNumber;
    private double balance;
    
    //---------------//
    //  constructors //
    //---------------//
    
    public BankAccount() {
    }
    public BankAccount(String name, String accountNumber, double balance){
        this.name = name;
        this.accountNumber = accountNumber;
        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }
    
    //---------------//
    //     methods   //
    //---------------//
    
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
    
    //---------------//
    //    getters    //
    //---------------//
    
    public String getName() {
        return name;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public double getBalance() {
        return balance;
    }
    
    //---------------//
    //    setters    //
    //---------------//
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
}

