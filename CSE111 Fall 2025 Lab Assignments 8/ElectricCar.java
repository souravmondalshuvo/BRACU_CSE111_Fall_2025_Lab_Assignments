//HomeWorkTask04

public class ElectricCar extends Vehicle {
    
    public int battery_capacity;
    public static int EV_counter;

    public ElectricCar(String model, int price, int battery_capacity) {
        super(model, price);
        this.battery_capacity = battery_capacity;
        
        if(EV_counter < 10) {
            this.vehicleId = "EV00" + EV_counter;
        } else if(EV_counter < 100) {
            this.vehicleId = "EV0" + EV_counter;
        } else {
            this.vehicleId = "EV" + EV_counter;
        }

        System.out.println("Vehicle ID: " + this.vehicleId + " created");
    }

    @Override
    public void vehicleDetail() {
        super.vehicleDetail();
        System.out.println("Type: Electric Vehicle");
        System.out.println("Battery Capacity: " + battery_capacity + "kWh");
    }

    public static void markAsSoldEV(ElectricCar E_Car) {
        E_Car.sold = true;
    }
}