public class Caterpillar {
    public String food;
    public int age;
    public double energy;

    public Caterpillar(String food, int age) {
        this.food = food;
        this.age = age;
        this.energy = 0;
    }

    public void eat() {
        energy += 1;
        System.out.println("Caterpillar ate 1 unit of food");
    }

    public void eat(int amount) {
        energy += amount;
        System.out.println("Caterpillar ate " + amount + " units of food");
    }

    public void transform() {
        System.out.println("Caterpillar transforms");
    }
 
    public void showDetails() {
        System.out.println("Food: " + food);
        System.out.println("Age: " + age);
        System.out.println("Energy: " + energy);
    }
}