public class Audience {
    private String name;

    public Audience(String name) {
        this.name = name;
    }
 
    public void buyConcertTicket(Concert concert, String zone, int quantity) {
        System.out.println(name + " bought " + quantity + " ticket(s) in Zone " + zone);
        concert.buyTicket(zone, quantity);
    }

    public void buyConcertTicket(Concert concert, String zone) {
        System.out.println(name + " bought 1 ticket(s) in Zone " + zone);
        concert.buyTicket(zone);
    }
 
    public void buyConcertTicket(VIPConcert concert) {
        System.out.println(name + " bought 1 ticket(s) in Zone VIP");
        concert.buyTicket();
    }
}