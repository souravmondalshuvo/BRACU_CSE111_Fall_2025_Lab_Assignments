public class Bike extends Vehicle {
    
    public String model;
    public boolean SideCar;

    public Bike(String brand, String model, int year, int wheels, boolean SideCar) {
        super(brand, year);
        this.model = model;
        this.SideCar = SideCar;
        setWheels(wheels);
    }

    public void doAWheelie() {

        if(SideCar) {
            System.out.println("Wheelie Failed. " + getBrand() + ":" + model + " has SideCar");
        } else {
            System.out.println(getBrand() + ":" + model + " is doing Wheelie!!");
        }
    }

    @Override
    public String toString() {
        return "Bike " + super.toString() + ", Model: " + model + ", SideCar: " + SideCar;
    }
}