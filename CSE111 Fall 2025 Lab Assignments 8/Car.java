public class Car extends Vehicle {
    
    public int seat;
    public static int car_counter;
    public static Car[] cars = new Car[0];

    public Car(String model, int price, int seat) {
        super(model, price);
        this.seat = seat;
        car_counter++;

        if(car_counter < 10) {
            this.vehicleId = "CAR00" + car_counter;
        } else if(car_counter < 100) {
            this.vehicleId = "CAR0" + car_counter;
        } else {
            this.vehicleId = "CAR" + car_counter;
        }

        System.out.println("Vehicle ID: " + this.vehicleId + " created");

        Car[] new_cars = new Car[cars.length + 1];

        for(int i = 0; i < cars.length; i++) {
            new_cars[i] = cars[i];
        }

        new_cars[cars.length] = this;
        cars = new_cars;
    }

    @Override
    public void vehicleDetail() {
        super.vehicleDetail();
        System.out.println("Type: Regular Car");
        System.out.println("Seats: " + seat);
    }

    public static void markAsSold(Car car) {
        car.sold = true;
    }

    public static void showAllCars() {
        System.out.println("Total Car: " + cars.length);

        for(int i = 0; i < cars.length; i++) {
            System.out.print(cars[i].vehicleId + " : " + cars[i].model + " - ");

            if(cars[i].sold) {
                System.out.println("sold");
            } else {
                System.out.println("available");
            }
        }
    }

    public static void showAllAvailableCars() {
        System.out.println("Total Car: " + cars.length);

        System.out.println("Available Cars: ");
        for(int i = 0; i < cars.length; i++) {

            if(!cars[i].sold) {
                System.out.println(cars[i].vehicleId + " : " + cars[i].model);
            }
        }
    }
}