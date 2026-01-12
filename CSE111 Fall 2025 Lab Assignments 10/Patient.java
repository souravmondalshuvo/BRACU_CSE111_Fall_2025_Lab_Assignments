public class Patient {

    public String patient_ID;
    public String name;
    public String doctor;
    public static int total_patients;
    public static int out_patients;
    public static int patient_counter;

    public Patient(String name, String doctor) {
        this.name = name;
        this.doctor = doctor;
        patient_counter++;
        total_patients++;
        out_patients++;

        if (patient_counter < 10) {
            this.patient_ID = "P0" + patient_counter;
        } else {
            this.patient_ID = "P" + patient_counter;
        }
    }

    public static void details() {
        System.out.println("Total patients: " + total_patients + ".");
    }

    public static void details(Patient[] patients) {
        
        System.out.println("Details of " + patients.length + " selected patients:");
        for (int i = 0; i < patients.length; i++) {
            System.out.println("== == == == ==");
            System.out.println(patients[i]);
        }
    }

    @Override
    public String toString() {
        return "Patient ID: " + patient_ID + ", Name: " + name + "\nDoctor: " + doctor;
    }
}