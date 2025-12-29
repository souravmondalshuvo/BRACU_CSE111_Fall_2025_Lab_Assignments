/*
Task 2

You are given the Audience class. You need to design the Concert (Parent) and VIPConcert (Child) classes so that the following tester code generates the desired output.
Hint: Assume a maximum of 5 artists can be added to a concert. Ticket Pricing:
Zone A: 500 per ticket
Zone B: 1,000 per ticket
Zone VIP: 2,000 per ticket

Driver Code and Given Class 
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

//Tester Class
public class ConcertTester{
  public static void main(String[] args) {    
    Concert concert = new Concert("ABC Conference Center","7:00 PM");   
    concert.showDetails();
    System.out.println("--------1--------");   
    concert.addArtist("Tahsan Khan");
    concert.addArtist("Habib Wahid");   
    concert.showDetails();
    System.out.println("--------2--------");   
    Audience a1 = new Audience("Sarah");
    Audience a2 = new Audience("Alex");
    System.out.println("--------3--------");
    a1.buyConcertTicket(concert, "A", 3);    
    a2.buyConcertTicket(concert, "B");  
    System.out.println("--------4--------");
    concert.showDetails();
    System.out.println("--------5--------");
    VIPConcert vipConcert = new VIPConcert("Army Stadium","10:00 PM");
    vipConcert.addArtist("Atif Aslam");    
    Audience a3 = new Audience("Emily");
    a3.buyConcertTicket(vipConcert); 
    System.out.println("--------6--------");
    vipConcert.showDetails();
    System.out.println("--------7--------");;
    Concert.showTotalTicketsSold();
  }
}

Output
Venue: ABC Conference Center
Showtime: 7:00 PM
Artist: 
Tickets sold in this concert: 0
--------1--------
Venue: ABC Conference Center
Showtime: 7:00 PM
Artist: 
-Tahsan Khan
-Habib Wahid
Tickets sold in this concert: 0
--------2--------
--------3--------
Sarah bought 3 ticket(s) in Zone A
Total price: 1500
Alex bought 1 ticket(s) in Zone B
Total price: 1000
--------4--------
Venue: ABC Conference Center
Showtime: 7:00 PM
Artist: 
-Tahsan Khan
-Habib Wahid
Tickets sold in this concert: 4
--------5--------
Emily bought 1 ticket(s) in Zone VIP
Total price: 2000
--------6--------
Venue: Army Stadium
Showtime: 10:00 PM
Artist: 
-Atif Aslam
Tickets sold in this concert: 1
--------7--------
Total tickets sold (all venues): 5 
*/

//Tester Class
public class ConcertTester {
    public static void main(String[] args) {
        Concert concert = new Concert("ABC Conference Center", "7:00 PM");
        concert.showDetails();
        System.out.println("--------1--------");
        concert.addArtist("Tahsan Khan");
        concert.addArtist("Habib Wahid");
        concert.showDetails();
        System.out.println("--------2--------");
        Audience a1 = new Audience("Sarah");
        Audience a2 = new Audience("Alex");
        System.out.println("--------3--------");
        a1.buyConcertTicket(concert, "A", 3);
        a2.buyConcertTicket(concert, "B");
        System.out.println("--------4--------");
        concert.showDetails();
        System.out.println("--------5--------");
        VIPConcert vipConcert = new VIPConcert("Army Stadium", "10:00 PM");
        vipConcert.addArtist("Atif Aslam");
        Audience a3 = new Audience("Emily");
        a3.buyConcertTicket(vipConcert);
        System.out.println("--------6--------");
        vipConcert.showDetails();
        System.out.println("--------7--------");
        Concert.showTotalTicketsSold();
    }
}