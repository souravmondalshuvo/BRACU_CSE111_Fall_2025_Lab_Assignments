/*
Task 4
 
Design the Car and ElectricCar classes so that the following output is produced. The ElectricCar class and Car class should inherit from the Vehicle class.

Driver Code and Parent Class 
public class VehicleShowroom {
  public static void main(String[] args) {
    Car c1 = new Car("Toyota Camry", 25000, 4);
    System.out.println("--------1---------");
    c1.vehicleDetail();
    System.out.println("--------2---------");
    Car.showAllAvailableCars();
    System.out.println("--------3---------");
    Car c2 = new Car("Honda Civic", 22000, 4);
    Car c3 = new Car("Ford Mustang", 35000, 2);
    Car.markAsSold(c1);
    Car.markAsSold(c2);
    System.out.println("--------4---------");
    c2.vehicleDetail();
    System.out.println("--------5---------");
    Car.showAllCars();
    System.out.println("--------6---------");
    ElectricCar e1 = new ElectricCar("Tesla Model 3", 45000, 75);
    ElectricCar e2 = new ElectricCar("Nissan Leaf", 32000, 60);
    ElectricCar e3 = new ElectricCar("Nissan Leaf", 32000, 60);
    System.out.println("--------7---------");
    e1.vehicleDetail();
    System.out.println("--------8---------");
    e3.vehicleDetail();
    System.out.println("--------9---------");
    ElectricCar.markAsSoldEV(e1);
    ElectricCar.markAsSoldEV(e2);
    ElectricCar.markAsSoldEV(e3);
  }
} 
 
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
    if(sold){
      System.out.print("Sold\n");
    }
    else{
      System.out.print("Available\n");
    }
  }
}

Output
Vehicle ID: CAR001 created
--------1---------
Model: Toyota Camry, Price: $25000
Status: Available
Type: Regular Car
Seats: 4
--------2---------
Total Car: 1
Available Cars:
CAR001 : Toyota Camry
--------3---------
Vehicle ID: CAR002 created
Vehicle ID: CAR003 created
--------4---------
Model: Honda Civic, Price: $22000
Status: Sold
Type: Regular Car
Seats: 4
--------5---------
Total Car: 3
CAR001 : Toyota Camry - sold
CAR002 : Honda Civic - sold
CAR003 : Ford Mustang - available
--------6---------
Vehicle ID: EV000 created
Vehicle ID: EV000 created
Vehicle ID: EV000 created
--------7---------
Model: Tesla Model 3, Price: $45000
Status: Available
Type: Electric Vehicle
Battery Capacity: 75 kWh
--------8---------
Model: Nissan Leaf, Price: $32000
Status: Available
Type: Electric Vehicle
Battery Capacity: 60 kWh
--------9---------
*/

public class VehicleShowroom {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota Camry", 25000, 4);
        System.out.println("--------1---------");
        c1.vehicleDetail();
        System.out.println("--------2---------");
        Car.showAllAvailableCars();
        System.out.println("--------3---------");
        Car c2 = new Car("Honda Civic", 22000, 4);
        Car c3 = new Car("Ford Mustang", 35000, 2);
        Car.markAsSold(c1);
        Car.markAsSold(c2);
        System.out.println("--------4---------");
        c2.vehicleDetail();
        System.out.println("--------5---------");
        Car.showAllCars();
        System.out.println("--------6---------");
        ElectricCar e1 = new ElectricCar("Tesla Model 3", 45000, 75);
        ElectricCar e2 = new ElectricCar("Nissan Leaf", 32000, 60);
        ElectricCar e3 = new ElectricCar("Nissan Leaf", 32000, 60);
        System.out.println("--------7---------");
        e1.vehicleDetail();
        System.out.println("--------8---------");
        e3.vehicleDetail();
        System.out.println("--------9---------");
        ElectricCar.markAsSoldEV(e1);
        ElectricCar.markAsSoldEV(e2);
        ElectricCar.markAsSoldEV(e3);
    }
}