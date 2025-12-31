public class Garage {
 
    public Car[] cars;
    public Bike[] bikes;
    public int car_count;
    public int bike_count;

    public Garage(int car_capacity, int bike_capacity) {
        cars = new Car[car_capacity];
        bikes = new Bike[bike_capacity];

        System.out.println("Welcome to the Garage!");
        System.out.println("Car Capacity: " + car_capacity);
        System.out.println("Bike Capacity: " + bike_capacity);
    }

    public void addVehicle(Vehicle vehicle) {

        if(vehicle instanceof Car) {
            if(car_count < cars.length) {
                cars[car_count] = (Car) vehicle;
                System.out.println("A " + vehicle.getBrand() + " CAR has been added to the Garage");
                car_count++;
            } else {
                System.out.println("Can't add more Cars! Capacity: " + cars.length);
            }
        } else if(vehicle instanceof Bike) {
            if(bike_count < bikes.length) {
                bikes[bike_count] = (Bike) vehicle;
                System.out.println("A " + vehicle.getBrand() + " BIKE has been added to the Garage");
                bike_count++;
            } else {
                System.out.println("Can't add more Bikes! Capacity: " + bikes.length);
            }
        }
    }
}