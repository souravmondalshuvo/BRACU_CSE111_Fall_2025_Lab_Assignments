/*
Task 3

Given the following classes, write the code for the CarDriver and the BikeDriver class so that the following output is printed.

Driver Code and Parent Class

import java.util.Arrays;
public class PathaoRideManager{
  public static void main(String[] args) {
    System.out.println("1.==============");
    GenericDriver d = new GenericDriver();
    System.out.println("2.==============");
    d.hasSafetyTraining();
    System.out.println("3.==============");
    BikeDriver d1 = new BikeDriver("John", "Not Premium");
    System.out.println("4.==============");
    System.out.println(d1);
    System.out.println("5.==============");
    System.out.println(d1.acceptRide(false));
    System.out.println("6.==============");
    d1.hasSafetyTraining();
    System.out.println("7.==============");
    CarDriver d2 = new CarDriver("Max");
    System.out.println("8.==============");
    System.out.println(d2);
    System.out.println("9.==============");
    d2.hasSafetyTraining();
    System.out.println("10.==============");
    System.out.println(d2.acceptRide(true));
    System.out.println("11.==============");
    System.out.println(d2);
    System.out.println("12.==============");
    BikeDriver.restrictedAreas("Airport Road");
    BikeDriver.restrictedAreas("Defense Area");
    BikeDriver.restrictedAreas("Navy Base");
    System.out.println(Arrays.toString(BikeDriver.restrictedAreas));
    System.out.println("13.==============");
    d1.fightRestriction(new String[]{"Defense Area", "Banani", "Uttara"});
    System.out.println("14.==============");
    CarDriver.restrictedAreas("Cantonment");
    CarDriver.restrictedAreas("Road 27");
    System.out.println(Arrays.toString(CarDriver.restrictedAreas));
    System.out.println("15.==============");
    d2.fightRestriction(new String[]{"Defense Area", "Road 27"});
  }
}

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

Expected Output
1.==============
Welcome to Pathao!
2.==============
All drivers must have safety training.
3.==============
Welcome to Pathao Driver Panel!
John has been registered as a Pathao driver!
4.==============
John's driver profile is Not Premium
5.==============
All Pathao drivers can accept rides. Driver does not have a verified vehicle. 
John's driver profile is Not Premium
6.==============
All drivers must have safety training.
7.==============
Welcome to Pathao Driver Panel!
Max has been registered as a Pathao driver!
8.==============
Max's driver profile is a Premium
9.==============
All drivers must have safety training.
Premium drivers receive extra safety briefings.
10.==============
All Pathao drivers can accept rides. Driver has a verified vehicle. 
Max's driver profile is Premium
11.==============
Max's driver profile is a Premium
12.==============
[Airport Road, Defense Area, Navy Base]
13.==============
John cannot enter Defense Area
John can enter Banani
John can enter Uttara
14.==============
[Cantonment, Road 27]
15.==============
Max can enter Defense Area
Max cannot enter Road 27
*/

import java.util.Arrays;

public class PathaoRideManager {
    public static void main(String[] args) {
        System.out.println("1.==============");
        GenericDriver d = new GenericDriver();
        System.out.println("2.==============");
        d.hasSafetyTraining();
        System.out.println("3.==============");
        BikeDriver d1 = new BikeDriver("John", "Not Premium");
        System.out.println("4.==============");
        System.out.println(d1);
        System.out.println("5.==============");
        System.out.println(d1.acceptRide(false));
        System.out.println("6.==============");
        d1.hasSafetyTraining();
        System.out.println("7.==============");
        CarDriver d2 = new CarDriver("Max");
        System.out.println("8.==============");
        System.out.println(d2);
        System.out.println("9.==============");
        d2.hasSafetyTraining();
        System.out.println("10.==============");
        System.out.println(d2.acceptRide(true));
        System.out.println("11.==============");
        System.out.println(d2);
        System.out.println("12.==============");
        BikeDriver.restrictedAreas("Airport Road");
        BikeDriver.restrictedAreas("Defense Area");
        BikeDriver.restrictedAreas("Navy Base");
        System.out.println(Arrays.toString(BikeDriver.restrictedAreas));
        System.out.println("13.==============");
        d1.fightRestriction(new String[] { "Defense Area", "Banani", "Uttara" });
        System.out.println("14.==============");
        CarDriver.restrictedAreas("Cantonment");
        CarDriver.restrictedAreas("Road 27");
        System.out.println(Arrays.toString(CarDriver.restrictedAreas));
        System.out.println("15.==============");
        d2.fightRestriction(new String[] { "Defense Area", "Road 27" });
    }
}