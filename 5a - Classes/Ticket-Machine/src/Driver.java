public class Driver {

    public static void main(String[] args) {
        TicketMachine ticketDublin4 = new TicketMachine(300);
        TicketMachine ticketDublin1 = new TicketMachine(325);
        TicketMachine ticketDublin29 = new TicketMachine(150);

        System.out.println(ticketDublin4.getPrice());
        System.out.println(ticketDublin1.getPrice());
        System.out.println(ticketDublin29.getPrice());

        // insert to little
        ticketDublin4.insertMoney(20);
        ticketDublin4.insertMoney(50);
        System.out.println(ticketDublin4.getBalance());
        ticketDublin4.insertMoney(50);
        ticketDublin4.printTicket(); // ticket prints despite insufficent funds

        // print an empty line so there is a space between outputs
        System.out.println();

        // insert too much
        ticketDublin4.insertMoney(2000);
        ticketDublin4.insertMoney(50);
        System.out.println(ticketDublin4.getBalance());
        ticketDublin4.insertMoney(50);
        ticketDublin4.printTicket(); // ticket prints and returns no refund

        // exercise 2 - print machine balance
        System.out.println(ticketDublin4.getTotal());
    }
}
