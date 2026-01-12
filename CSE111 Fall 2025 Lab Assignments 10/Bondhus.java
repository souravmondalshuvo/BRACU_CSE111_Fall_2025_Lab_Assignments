//Task05

public class Bondhus extends SocialMedia {
    
    public String[] sentbox;
    public int sentbox_count;
    public int total_message_sent;
    public boolean sentbox_full_meassage_shown;
    public static int MAX_SENTBOX_SIZE = 4;

    public Bondhus(String name, String mail) {
        super(name, mail);
        this.sentbox = new String[MAX_SENTBOX_SIZE];
    }

    public void sendMessage(String message) {

        if(sentbox_count < MAX_SENTBOX_SIZE) {
            sentbox[sentbox_count] = message;
            sentbox_count++;
            total_message_sent++;

        } else if(!sentbox_full_meassage_shown){
            total_message_sent++;
            System.out.println("Sentbox is full.");
            sentbox_full_meassage_shown = true;
        }
    }

    public void showSentbox() {
        System.out.println(userName + "'s Sentbox: ");

        if(sentbox_count == 0) {
            System.out.println("No sent messages.");
        } else {
            for(int i = 0; i < sentbox_count; i++) {
                System.out.println(sentbox[i]);
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nMessages Sent: " + total_message_sent;
    }
}