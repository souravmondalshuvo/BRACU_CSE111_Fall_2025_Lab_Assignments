public class GenericDriver {
    private String name;

    public GenericDriver() {
        System.out.println("Welcome to Pathao!");
    }

    public GenericDriver(String name) {
        this.name = name;
        System.out.println("Welcome to Pathao Driver Panel!");
        System.out.println(this.name + " has been registered as a Pathao driver!");
    }

    public String getName() {
        return name;
    }

    public void hasSafetyTraining() {
        System.out.println("All drivers must have safety training.");
    }

    public String acceptRide(boolean hasVehicle) {
        String s = "All Pathao drivers can accept rides. ";
        if (!hasVehicle)
            s += "Driver does not have a verified vehicle. ";
        else
            s += "Driver has a verified vehicle. ";
        return s;
    }
}