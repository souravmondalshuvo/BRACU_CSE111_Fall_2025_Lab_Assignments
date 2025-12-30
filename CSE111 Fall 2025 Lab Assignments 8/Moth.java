public class Moth extends Caterpillar {
    
    public Moth(String food, int age) {
        super(food, age);
    }

    @Override
    public void transform() {
        energy -= 2.5;
        System.out.println("Caterpillar transforms into Moth");
    }

    @Override
    public void eat(int amount) {
        energy += amount * 2.5;
        System.out.println("Moth lost energy due to noctural activity");
    }

    @Override
    public void showDetails() {
        System.out.println("Food: " + food);
        System.out.println("Age: " + age);
        System.out.println("Energy: " + energy + " joules");
    }
}