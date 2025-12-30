public class Developer extends Employee {
    
    public String language;

    public Developer(String name, double baseSalary, int hoursWorked, String language) {
        super(name, baseSalary, hoursWorked);
        this.language = language;
    }

    public void calculateSalary() {

    }
 
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Language: " + language);

        double final_salary = getBaseSalary();

        if(language.equals("Java")) {
            final_salary = getBaseSalary() + 700;
        }

        System.out.println("Final Salary: $" + final_salary);
    }
}