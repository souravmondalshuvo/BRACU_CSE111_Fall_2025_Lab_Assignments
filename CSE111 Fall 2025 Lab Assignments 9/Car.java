public class Car extends Vehicle {
    
    public String model;
    public int door;
    public boolean auto_pilot;

    public Car(String brand, String model, int year, int door, int wheels, boolean auto_pilot) {
        super(brand, year);
        this.model = model;
        this.door = door;
        this.auto_pilot = auto_pilot;
        setWheels(wheels);
    }

    public void startAutoPilot() {

        if(auto_pilot) {
            System.out.println(getBrand() + ":" + model + " AutoPilot Started");
        } else {
            System.out.println(getBrand() + ":" + model + " has NO AutoPilot");
        }
    }

    @Override
    public String toString() {
        return "Car " + super.toString() + ", Model: " + model + ", Doors: " + door + ", AI: " + auto_pilot;
    }
}