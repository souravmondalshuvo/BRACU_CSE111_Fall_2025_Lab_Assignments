public class Dragon extends MagicalCreature {
    
    public int power_level;

    public Dragon(String name, int age, int power_level) {
        super(name, age);
        this.power_level = power_level;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " roars with a fiery breath!");
    }

    @Override
    public void performMagic() {
        System.out.println(name + " breaths fire with power level: " + power_level);
    }

    public void fly() {
        System.out.println(name + " flies through the sky.");
    }
}