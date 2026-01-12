/*

Task 6

Observe the following Tester class and outputs to design both the Patient class and InPatient class with appropriate elements.

Tester Class 
public class PatientTester {
 public static void main(String[] args) {
  Patient p1 = new Patient("Robert", "Dr. Thomas");
  System.out.println(p1);
  System.out.println("1.................");
  Patient.details();
  System.out.println("2.................");
  InPatient p2 = new InPatient("Christina", "Dr. Alex", "Oncology");
  System.out.println(p2);
  System.out.println("3.................");
  InPatient.details();
  System.out.println("4.................");
  Patient p3 = new InPatient("Sofia", "Dr. Brawn", "Pediatrics");
  Patient p4 = new Patient("Patrick", "Dr. Alex");
  Patient.details();
  System.out.println("5.................");
  Patient[] allPatients = { p1, p2, p3, p4 };
  Patient.details(allPatients);
 }
}

Expected Output
Patient ID: P01, Name: Robert
Doctor: Dr. Thomas
1.................
Total patients: 1.
2.................
New patient admitted in Oncology.
Patient ID: P02, Name: Christina
Doctor: Dr. Alex
Department: Oncology
3.................
Total patients: 2.
Admitted In-Patients: 1.
Out-Patients: 1.
4.................
New patient admitted in Pediatrics.
Total patients: 4.
5.................
Details of 4 selected patients:
== == == == ==
Patient ID: P01, Name: Robert
Doctor: Dr. Thomas
== == == == ==
Patient ID: P02, Name: Christina
Doctor: Dr. Alex
Department: Oncology
== == == == ==
Patient ID: P03, Name: Sofia
Doctor: Dr. Brawn
Department: Pediatrics
== == == == ==
Patient ID: P04, Name: Patrick
Doctor: Dr. Alex
*/

public class PatientTester {
    public static void main(String[] args) {
        Patient p1 = new Patient("Robert", "Dr. Thomas");
        System.out.println(p1);
        System.out.println("1.................");
        Patient.details();
        System.out.println("2.................");
        InPatient p2 = new InPatient("Christina", "Dr. Alex", "Oncology");
        System.out.println(p2);
        System.out.println("3.................");
        InPatient.details();
        System.out.println("4.................");
        Patient p3 = new InPatient("Sofia", "Dr. Brawn", "Pediatrics");
        Patient p4 = new Patient("Patrick", "Dr. Alex");
        Patient.details();
        System.out.println("5.................");
        Patient[] allPatients = { p1, p2, p3, p4 };
        Patient.details(allPatients);
    }
}