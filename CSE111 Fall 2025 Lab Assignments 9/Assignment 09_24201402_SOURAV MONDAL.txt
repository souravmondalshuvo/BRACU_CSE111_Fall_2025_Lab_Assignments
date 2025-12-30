//HomeWorkTask01

public class SmartSecurityCamera extends SmartDevice {
 
    public int storage_capacity;
    public int used_storage;
    public boolean night_vision_on;
    public static String admin_pin = "ADMIN123";

    public SmartSecurityCamera(String name, double battery, int storage_capacity) {
        super(name, battery);
        this.storage_capacity = storage_capacity;
        this.used_storage = 0;
        this.night_vision_on = false;
    }

    public void record() {

        if(!isActive) {
            return;
        }

        if(used_storage >= storage_capacity) {
            System.out.println("Error: " + deviceName + " storage full. Recording disabled.");
            return;
        }

        System.out.println("Recording standard footage.");
        used_storage++;
    }

    public void record(boolean night_vision) {
        
        if(!isActive) {
            return;
        }

        if(night_vision) {
            night_vision_on = true;
            System.out.println("[IR SENSORS ACTIVE]");
        }
        record();
    }

    @Override
    public void powerOff() {

        if(night_vision_on) {
            System.out.println("Turning off Night Vision.");
            night_vision_on = false;
        }

        super.powerOff();
    }

    @Override
    public void powerOn() {

        if(used_storage >= storage_capacity) {
            System.out.println("Error: " + deviceName + " storage full. Recording disabled.");
        } else {
            super.powerOn();
        }
    }

    public void formatCard(String pin) {
        System.out.println("REQUEST: Format SD Card initiated.");

        if(!isActive) {
            System.out.println("ERROR: Device must be ON to format.");
            return;
        }

        if(!pin.equals(admin_pin)) {
            System.out.println("ACCESS DENIED: Incorrect PIN.");
            return;
        }

        System.out.println("Auth Success. Wiping data.");

        used_storage = 0;
        System.out.println("SUCCESS: Storage restored to " + storage_capacity + "GB.");
    }
}