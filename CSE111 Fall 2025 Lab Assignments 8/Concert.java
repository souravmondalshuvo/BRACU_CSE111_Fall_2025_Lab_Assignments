//HomeWorkTask02 

public class Concert {
    
    public String venue;
    public String show_time;
    public int artist_count;
    public int ticket_sold;
    public String[] artists;
    private static int total_ticket_sold;

    public Concert(String venue, String show_time) {
        this.venue = venue;
        this.show_time = show_time;
        artists = new String[5];
    }

    public void addArtist(String name) {
        if(artist_count < 5) {
            artists[artist_count] = name;
            artist_count++;
        }
    }

    public void buyTicket(String zone, int quantity) {

        int price = 0;

        if(zone.equals("A")) {
            price = 500;
        } else if(zone.equals("B")) {
            price = 1000;
        }

        int total_price = price * quantity;
        ticket_sold += quantity;
        total_ticket_sold += quantity;

        System.out.println("Total price: " + total_price);
    }

    public void buyTicket(String zone) {
        buyTicket(zone, 1);
    }

    public void showDetails() {
        System.out.println("Venue: " + venue);
        System.out.println("Showtime: " + show_time);
        
        System.out.println("Artist: ");
        for(int i = 0; i < artist_count; i++) {
            System.out.println("-" + artists[i]);
        }

        System.out.println("Tickets sold in this concert: " + ticket_sold);
    }

    public static void showTotalTicketsSold() {
        System.out.println("Total tickets sold (all venues): " + total_ticket_sold);
    }

    public static void addToTotalTickets(int quantity) {
        total_ticket_sold += quantity;
    }
}