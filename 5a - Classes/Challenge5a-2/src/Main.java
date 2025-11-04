public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount("Elon Musk","123456789", 1500.0 );
        BankAccount bankAccount2 = new BankAccount("Adam McCarthy","404040404", -40);
        BankAccount bankAccount3 = new BankAccount("DrImTwentyCharacters","20202020", 2020);
        BankAccount bankAccount4 = new BankAccount("SirTwentyTwoCharacters","22222222", 22);


        // test validation for initial balance and name
        System.out.println("Name: " + bankAccount1.name + ", Account Number: "
                + bankAccount1.accountNumber + ", Balance: €" + bankAccount1.balance);
        System.out.println("Name: " + bankAccount2.name + ", Account Number: "
                + bankAccount2.accountNumber + ", Balance: €" + bankAccount2.balance);
        System.out.println("Name: " + bankAccount3.name + ", Account Number: "
                + bankAccount3.accountNumber + ", Balance: €" + bankAccount3.balance);
        System.out.println("Name: " + bankAccount4.name + ", Account Number: "
                + bankAccount4.accountNumber + ", Balance: €" + bankAccount4.balance);
    }
}

