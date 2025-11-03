public class Driver {

    public static void main(String[] args) {
        TicketMachine ticketDublin4 = new TicketMachine(300);
        TicketMachine ticketDublin1 = new TicketMachine(325);
        TicketMachine ticketDublin29 = new TicketMachine(150);
        // create a new ticket machine
        TicketMachine ticketMaynooth = new TicketMachine(220);

        // print the price of a Maynooth ticket
        System.out.println(ticketMaynooth.getPrice());

        // insert to little
        ticketMaynooth.insertMoney(100);
        ticketMaynooth.insertMoney(80);
        System.out.println(ticketMaynooth.getBalance());
        ticketMaynooth.insertMoney(40);
        ticketMaynooth.printTicket();
        // print user balance
        System.out.println(ticketMaynooth.getBalance());
        // from exercise 2 - print machine balance
        System.out.println(ticketMaynooth.getTotal());

        // print machine status
        System.out.println(ticketMaynooth.getStatus());
    }
}
