//Task06

public class InPatient extends Patient {
    
    public String department;
    public static int admittedInPatients = 0;

    public InPatient(String name, String doctor, String department) {
        super(name, doctor);
        this.department = department;
        admittedInPatients++;
        out_patients--;

        System.out.println("New patient admitted in " + department + ".");
    }

    public static void details() {
        System.out.println("Total patients: " + total_patients + ".");
        System.out.println("Admitted In-Patients: " + admittedInPatients + ".");
        System.out.println("Out-Patients: " + out_patients + ".");
    }

    @Override
    public String toString() {
        return super.toString() + "\nDepartment: " + department;
    }
}