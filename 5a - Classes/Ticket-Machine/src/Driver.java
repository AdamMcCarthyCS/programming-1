public class Driver {

    public static void main(String[] args) {
        TicketMachine ticketDublin4 = new TicketMachine(300);
        TicketMachine ticketDublin1 = new TicketMachine(325);
        TicketMachine ticketDublin29 = new TicketMachine(150);

        System.out.println(ticketDublin4.getPrice());
        System.out.println(ticketDublin1.getPrice());
        System.out.println(ticketDublin29.getPrice());

        // insert to little
        ticketDublin1.insertMoney(100);
        ticketDublin1.insertMoney(80);
        System.out.println(ticketDublin1.getBalance());
        ticketDublin1.insertMoney(145);
        ticketDublin1.printTicket(); // ticket prints despite insufficent funds

        // exercise 2 - print machine balance
        System.out.println(ticketDublin1.getTotal());
    }
}
