/*
Task 1

Design the SmartSecurityCamera class derived from SmartDevice class to generate the following output.

Tester Code and Parent Class
public class SmartHomeTester {
 public static void main(String[] args) {
  SmartSecurityCamera cam1 = new SmartSecurityCamera("Garden-Cam", 100, 64);
  cam1.powerOn();
  System.out.println("=====================");
  cam1.record(true);
  System.out.println("=====================");
  cam1.powerOff();
  System.out.println("=====================");
  cam1.powerOn();
  System.out.println("=====================");
  cam1.record();
  System.out.println("=====================");
  cam1.formatCard("0000");
  System.out.println("=====================");
  cam1.formatCard("ADMIN123");
  System.out.println("=====================");
  SmartSecurityCamera cam2 = new SmartSecurityCamera("Indoor-Cam", 80, 1);
  cam2.powerOn();
  System.out.println("=====================");
  cam2.record();
  System.out.println("=====================");
  cam2.powerOff();
  System.out.println("=====================");
  cam2.powerOn();
  System.out.println("=====================");
  cam2.formatCard("ADMIN123");
  System.out.println("=====================");
  cam2 = new SmartSecurityCamera("Indoor-Cam", 2, 10);
  cam2.powerOn();
 }
}


class SmartDevice {
 public String deviceName;
 private double batteryLevel;
 protected boolean isActive;

 SmartDevice(String name, double battery) {
  this.deviceName = name;
  this.batteryLevel = battery;
  this.isActive = false;
 }

 public void powerOn() {
  if (batteryLevel > 5) {
   isActive = true;
   batteryLevel -= 2;
   System.out.println(deviceName + " is now ONLINE.");
  } else {
   System.out.println("Power Low: " + deviceName + " cannot start.");
  }
 }

 public void powerOff() {
  this.isActive = false;
  System.out.println(deviceName + " has shut down.");
 }

 public double getBattery() {
  return batteryLevel;
 }
}

Output
Garden-Cam is now ONLINE.
=====================
[IR SENSORS ACTIVE]
Recording standard footage.       
=====================
Turning off Night Vision.
Garden-Cam has shut down.
=====================
Garden-Cam is now ONLINE.
=====================
Recording standard footage.       
=====================
REQUEST: Format SD Card initiated.
ACCESS DENIED: Incorrect PIN.     
=====================
REQUEST: Format SD Card initiated.
Auth Success. Wiping data.
SUCCESS: Storage restored to 64GB.
=====================
Indoor-Cam is now ONLINE.
=====================
Recording standard footage.
=====================
Indoor-Cam has shut down.
=====================
Error: Indoor-Cam storage full. Recording disabled.
=====================
REQUEST: Format SD Card initiated.
ERROR: Device must be ON to format.
=====================
Power Low: Indoor-Cam cannot start.
*/

public class SmartHomeTester {
    public static void main(String[] args) {
        SmartSecurityCamera cam1 = new SmartSecurityCamera("Garden-Cam", 100, 64);
        cam1.powerOn();
        System.out.println("=====================");
        cam1.record(true);
        System.out.println("=====================");
        cam1.powerOff();
        System.out.println("=====================");
        cam1.powerOn();
        System.out.println("=====================");
        cam1.record();
        System.out.println("=====================");
        cam1.formatCard("0000");
        System.out.println("=====================");
        cam1.formatCard("ADMIN123");
        System.out.println("=====================");
        SmartSecurityCamera cam2 = new SmartSecurityCamera("Indoor-Cam", 80, 1);
        cam2.powerOn();
        System.out.println("=====================");
        cam2.record();
        System.out.println("=====================");
        cam2.powerOff();
        System.out.println("=====================");
        cam2.powerOn();
        System.out.println("=====================");
        cam2.formatCard("ADMIN123");
        System.out.println("=====================");
        cam2 = new SmartSecurityCamera("Indoor-Cam", 2, 10);
        cam2.powerOn();
    }
}