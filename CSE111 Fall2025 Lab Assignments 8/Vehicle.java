public class Vehicle {
    public String model;
    public int price;
    public boolean sold;
    public String vehicleId;

    public Vehicle(String model, int price) {
        this.model = model;
        this.price = price;
        this.sold = false;
        this.vehicleId = "";
    }

    public void vehicleDetail() {
        System.out.println("Model: " + model + ", Price: $" + price);
        System.out.print("Status: ");
        if (sold) {
            System.out.print("Sold\n");
        } else {
            System.out.print("Available\n");
        }
    }
}