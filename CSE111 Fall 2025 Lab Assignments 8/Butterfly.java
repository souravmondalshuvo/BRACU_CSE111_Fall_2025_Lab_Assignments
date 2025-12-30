//HomeWorkTask01

public class Butterfly extends Caterpillar {
    
    public Butterfly(String food, int age) {
        super(food, age);
    }

    @Override
    public void transform() {
        energy -= 5;
        System.out.println("Caterpillar transforms into Butterfly");
    }

    @Override
    public void eat(int amount) {
        energy += amount * 5;
        System.out.println("Butterfly lost energy while flying and absorbed necter");
    }
 
    @Override
    public void showDetails() {
        System.out.println("Food: " + food);
        System.out.println("Age: " + age);
        System.out.println("Energy: " + energy + " joules");
    }
}