public class Manager extends Employee {
    
    public double bonus;

    public Manager(String name, double baseSalary, int hoursWorked, double bonus) {
        super(name, baseSalary, hoursWorked);
        this.bonus = bonus;
    }

    public void calculateSalary() {

    }

    public void requestIncrement(double amount) {

        if(getHoursWorked() > 100) {
            setBaseSalary(getBaseSalary() + amount);
        } else if(getHoursWorked() > 80) {
            double half_amount = amount / 2;
            setBaseSalary(getBaseSalary() + half_amount);
            System.out.println("$" + (int)half_amount + " Increment approved.");
        } else {
            System.out.println("Increment denied.");
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Bonus: " + bonus + " %");

        double final_salary = getBaseSalary();

        if(getHoursWorked() > 40) {
            final_salary = getBaseSalary() * (1 + bonus / 100);
        }

        System.out.println("Final Salary: $" + final_salary);
    }
}