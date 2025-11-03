public class Driver {

    public static void main(String[] args) {
        TicketMachine ticketDublin4 = new TicketMachine(300);
        TicketMachine ticketDublin1 = new TicketMachine(325);
        TicketMachine ticketDublin29 = new TicketMachine(150);

        System.out.println(ticketDublin4.getPrice());
        System.out.println(ticketDublin1.getPrice());
        System.out.println(ticketDublin29.getPrice());

        ticketDublin4.insertMoney(200);
        ticketDublin4.insertMoney(50);
        System.out.println(ticketDublin4.getBalance());
        ticketDublin4.insertMoney(50);
        ticketDublin4.printTicket();
//
//        System.out.println(ticketDublin4.getBalance());
    }
}
