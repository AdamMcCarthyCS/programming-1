public class WeeklySalaryCalculator {
    public static void main(String[] args) {
        // hours worked and hourly pay needed for calculation
        double hourlyPay = 12.50d;
        int hoursWorked = 45;

        // Multiply hours worked by hourly pay to get total salary
        // Casting not needed as hourly pay is a double
        double salary = hoursWorked * hourlyPay;

        // Output the total salary
        System.out.println("Total weekly pay: €" + salary);
    }
}
