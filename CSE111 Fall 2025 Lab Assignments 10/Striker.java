//Task02

public class Striker extends Football {
    
    public int goals;
    public int shot_on_target;
    public double performance;

    public Striker(String name, int age, int stamina, int goals, int shots) {
        super(name, age, stamina);
        this.goals = goals;
        this.shot_on_target = shots;
    }

    public void calculatePerformance() {
        performance = (double) goals / shot_on_target;
        System.out.println("Performance: " + performance);
    }

    public void display() {
        super.display();
        System.out.println("Goals: " + goals);
        System.out.println("Shots on target: " + shot_on_target);
    }
}