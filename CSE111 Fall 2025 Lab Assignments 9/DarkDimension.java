// Child Class 

public class DarkDimension extends UpsideDown {
    public DarkDimension(String name) {
        super(name);
    }

    public void runExperiment(UpsideDown portal) {
        if (!this.checkBridge(portal)) {
            System.out.println("Cannot run experiment.");
        } else {
            if (portal.getBridge1() != null) {
                portal.activate(portal.getBridge1());
                System.out.println("Experiment executed successfully!");
            } else if (portal.getBridge2() != null) {
                portal.activate(portal.getBridge2());
                System.out.println("Experiment executed successfully!");
            } else {
                System.out.println("No experiment found!");
            }
        }
    }
}