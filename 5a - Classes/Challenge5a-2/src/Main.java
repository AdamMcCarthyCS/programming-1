public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount("Elon Musk","123456789", 1500.0 );
        BankAccount bankAccount2 = new BankAccount("Adam McCarthy","404040404", -40);

        System.out.println("Name: " + bankAccount1.name + ", Account Number: "
                + bankAccount1.accountNumber + ", Balance: €" + bankAccount1.balance);
        System.out.println("Name: " + bankAccount2.name + ", Account Number: "
                + bankAccount2.accountNumber + ", Balance: €" + bankAccount2.balance);

    }
}

