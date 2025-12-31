/*
Task 3

Write the Garage, Bike and Car class. Car, Bike are child classes of Vehicle class. But Garage is neither a parent nor a child class. The Garage class has two arrays as instance variables called cars and bikes that can store Car and Bike objects.

Hint: In this task you’ll need to use the instanceof keyword and downcasting.

Parent Class

public class Vehicle {
    
    private String brand;
    private int year, wheels;

    public Vehicle(String b, int y){
        this.brand = b;
        this.year = y;
    }

    public String getBrand(){
        return this.brand;
    }

    public int getYear(){
        return this.year;
    }

    public void setWheels( int w ){
        this.wheels = w;
    }

    public int getWheels(){
        return this.wheels;
    }

    public String toString(){
        return "Brand: "+this.brand+", Year: "+this.year+", Wheels: "+this.wheels;
    }

}

DRIVER CODE
Garage g = new Garage(2, 3);
System.out.println("==========0===========");
Vehicle vC1 = new Car("Ford", "Mustang", 2022, 2, 4, false);
Vehicle vC2 = new Car("Tesla", "Model S", 2025, 4, 4, true);
Vehicle vC3 = new Car("Reliant", "Robin", 1981, 2, 3, false);
System.out.println("==========1===========");
System.out.println(vC1);
System.out.println("==========2===========");
g.addVehicle(vC1);
g.addVehicle(vC2);
g.addVehicle(vC3);
System.out.println(g.cars[1]);
System.out.println("==========3===========");
g.cars[0].startAutoPilot();
g.cars[1].startAutoPilot();
System.out.println("==========4===========");
Vehicle vB1 = new Bike("Honda", "Gold Wing", 2022, 3, true);
System.out.println(vB1);
g.addVehicle( vB1 );
System.out.println("==========5===========");
Vehicle vB2 = new Bike("Royal Enfield", "Classic 350", 2021, 2, false);
g.addVehicle( vB2 );
System.out.println(g.bikes[1]);
System.out.println("==========6===========");
Vehicle vB3 = new Bike("Harley-Davidson", "Street 750", 2022, 2, false);
g.addVehicle( vB3 );
Vehicle vB4 = new Bike("Yamaha", "MT-15", 2023, 2, false);
g.addVehicle( vB4 );
System.out.println("=========7============");
g.bikes[0].doAWheelie();
g.bikes[1].doAWheelie();

OUTPUT
Welcome to the Garage!
Car Capacity: 2
Bike Capacity: 3
==========0===========
==========1===========
Car Brand: Ford, Year: 2022, Wheels: 4, Model: Mustang, Doors: 2, AI: false
==========2===========
A Ford CAR has been added to the Garage
A Tesla CAR has been added to the Garage
Can't add more Cars! Capacity: 2
Car Brand: Tesla, Year: 2025, Wheels: 4, Model: Model S, Doors: 4, AI: true
==========3===========
Ford:Mustang has NO AutoPilot
Tesla:Model S AutoPilot Started
==========4===========
Bike Brand: Honda, Year: 2022, Wheels: 3, Model: Gold Wing, SideCar: true
A Honda BIKE has been added to the Garage
==========5===========
A Royal Enfield BIKE has been added to the Garage
Bike Brand: Royal Enfield, Year: 2021, Wheels: 2, Model: Classic 350, SideCar: false
==========6===========
A Harley-Davidson BIKE has been added to the Garage
Can't add more bikes! Capacity: 3
=========7============
Wheelie Failed. Honda:Gold Wing has SideCar
Royal Enfield:Classic 350 is doing Wheelie!!
*/

public class GarageTester {
    public static void main(String[] args) {
        Garage g = new Garage(2, 3);
        System.out.println("==========0===========");
        Vehicle vC1 = new Car("Ford", "Mustang", 2022, 2, 4, false);
        Vehicle vC2 = new Car("Tesla", "Model S", 2025, 4, 4, true);
        Vehicle vC3 = new Car("Reliant", "Robin", 1981, 2, 3, false);
        System.out.println("==========1===========");
        System.out.println(vC1);
        System.out.println("==========2===========");
        g.addVehicle(vC1);
        g.addVehicle(vC2);
        g.addVehicle(vC3);
        System.out.println(g.cars[1]);
        System.out.println("==========3===========");
        g.cars[0].startAutoPilot();
        g.cars[1].startAutoPilot();
        System.out.println("==========4===========");
        Vehicle vB1 = new Bike("Honda", "Gold Wing", 2022, 3, true);
        System.out.println(vB1);
        g.addVehicle(vB1);
        System.out.println("==========5===========");
        Vehicle vB2 = new Bike("Royal Enfield", "Classic 350", 2021, 2, false);
        g.addVehicle(vB2);
        System.out.println(g.bikes[1]);
        System.out.println("==========6===========");
        Vehicle vB3 = new Bike("Harley-Davidson", "Street 750", 2022, 2, false);
        g.addVehicle(vB3);
        Vehicle vB4 = new Bike("Yamaha", "MT-15", 2023, 2, false);
        g.addVehicle(vB4);
        System.out.println("=========7============");
        g.bikes[0].doAWheelie();
        g.bikes[1].doAWheelie();
    }
}