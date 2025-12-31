//HomeWorkTask02

public class UpsideDown extends Hawkins {
    
    public Hawkins bridge_1;
    public Hawkins bridge_2;
    public static int totalBridges;

    public UpsideDown(String name) {
        super(name);
    }

    public Hawkins getBridge1() {
        return bridge_1;
    }

    public Hawkins getBridge2() {
        return bridge_2;
    }
    
    public void connect(Hawkins h) {

        if(bridge_1 == null) {
            bridge_1 = h;
            totalBridges++;
        } else if(bridge_2 == null) {
            bridge_2 = h;
            totalBridges++;
        } else {
            System.out.println("No furthur bridges with " + this.name);
        }
    }

    public void disconnect(int bridge_number) {

        if(bridge_number == 1 && bridge_1 != null) {
            bridge_1 = null;
            totalBridges--;
        } else if(bridge_number == 2 && bridge_2 != null) {
            bridge_2 = null;
            totalBridges--;
        } else {
            System.out.println("Invalid bridge number!");
        }
    }

    public void activate(Hawkins h) {
        System.out.println("Activating the door of " + h.name);
    }

    public void details() {
        System.out.println(this.name + " Details: ");
        
        if(bridge_1 != null) {
            System.out.println("Bridge 1: " + bridge_1.name);
        }

        if(bridge_2 != null) {
            System.out.println("Bridge 2: " + bridge_2.name);
        }
    }
}