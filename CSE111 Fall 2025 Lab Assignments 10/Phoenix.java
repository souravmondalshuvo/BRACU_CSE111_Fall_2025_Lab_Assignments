//Task04

public class Phoenix extends MagicalCreature {
    
    public int rebirth_cycles;

    public Phoenix(String name, int age, int rebirth_cycles) {
        super(name, age);
        this.rebirth_cycles = rebirth_cycles;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " sings an enchanting song.");
    }

    @Override
    public void performMagic() {
        System.out.println(name + " is reborn with " + rebirth_cycles + " rebirth cycles.");
    }

    public void regenerate() {
        System.out.println(name + " regenerates its body in a burst of flames.");
    }
}