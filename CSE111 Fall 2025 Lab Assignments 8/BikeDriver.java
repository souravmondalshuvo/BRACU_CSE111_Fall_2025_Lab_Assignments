//HomeWorkTask03

public class BikeDriver extends GenericDriver {
    
    private String profile;
    public static String[] restrictedAreas = new String[0];

    public BikeDriver(String name, String profile) {
        super(name);
        this.profile = profile;
    }

    @Override
    public String toString() {
        return getName() + "'s driver profile is " + profile;
    }

    @Override
    public String acceptRide(boolean has_vehicle) {
        String result = super.acceptRide(has_vehicle);
        result += "\n" + toString();
        return result;
    }

    public void fightRestriction(String[] area) {
        
        for(int i = 0; i < area.length; i++) {
            boolean is_restricted = false;
            for(int j = 0; j < restrictedAreas.length; j++) {
                if(area[i].equals(restrictedAreas[j])) {
                    is_restricted = true;
                    break;
                }
            }

            if(is_restricted) {
                System.out.println(getName() + " cannot enter " + area[i]);
            } else {
                System.out.println(getName() + " can enter " + area[i]);
            }
        }
    }

    public static void restrictedAreas(String area) {
        String[] areas = new String[restrictedAreas.length + 1];

        for(int i = 0; i < restrictedAreas.length; i++) {
            areas[i] = restrictedAreas[i];
        }

        areas[restrictedAreas.length] = area;
        restrictedAreas = areas;
    }
}