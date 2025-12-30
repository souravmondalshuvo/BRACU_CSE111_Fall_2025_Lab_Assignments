public class VIPConcert extends Concert {

    public VIPConcert(String venue, String show_time) {
        super(venue, show_time);
    }

    public void buyTicket() {
        ticket_sold += 1;
        Concert.addToTotalTickets(1);
        System.out.println("Total price: 2000");
    }
}