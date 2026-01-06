public class Defender extends Football {
    public int tackles;
    public int interceptions;
    public double performance;

    public Defender(String name, int age, int stamina, int tackles, int interceptions) {
        super(name, age, stamina);
        this.tackles = tackles;
        this.interceptions = interceptions;
    }

    public void calculatePerformance() {
        performance = (double) interceptions / tackles;
        System.out.println("Performance: " + performance);
    }

    public void display() {
        super.display();
        System.out.println("Tackles: " + tackles);
        System.out.println("Interceptions: " + interceptions);
    }
}