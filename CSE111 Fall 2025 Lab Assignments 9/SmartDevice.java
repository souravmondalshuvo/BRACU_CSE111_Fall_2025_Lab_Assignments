public class SmartDevice {
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