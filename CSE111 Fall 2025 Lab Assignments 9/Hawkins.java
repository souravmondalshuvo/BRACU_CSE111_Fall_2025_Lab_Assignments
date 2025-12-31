// Grand Parent Class 

public class Hawkins {
    public String name;
    public boolean status = false;

    public Hawkins(String name) {
        this.name = name;
    }

    public boolean checkBridge(Hawkins h) {
        if (h.status == true) {
            System.out.println("Bridge present at " + h.name);
            return true;
        } else {
            System.out.println("No Bridge present at " + h.name);
            return false;
        }
    }

    public void open() {
        if (status == false) {
            status = true;
            System.out.println("Bridge from " + name + " is Open");
        }
    }
}