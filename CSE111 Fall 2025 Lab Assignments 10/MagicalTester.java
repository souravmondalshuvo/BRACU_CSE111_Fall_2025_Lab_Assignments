/*
Task 4

Design the Dragon class and Phoenix class derived from the MagicalCreature class so that the following output is produced.

Parent Class 
public class MagicalCreature {
  public String name;
  public int age;
  public MagicalCreature(String name, int age) {
    this.name = name;
    this.age = age;
  }
  public void makeSound() {
    System.out.println(name + " makes a magical sound.");
  }
  public void displayInfo() {
    System.out.println("Name: " + name + "\nAge: " + age);
  }  
  public void performMagic() {
    System.out.println(name + " performs a generic magic.");
  }   
}

Driver Code
public class MagicalTester {
  public static void main(String[] args) {
    Dragon drake = new Dragon("Drake", 500, 75);
    Phoenix fawkes = new Phoenix("Fawkes", 200, 5);
    drake.displayInfo();
    drake.makeSound();
    drake.performMagic();
    drake.fly();
    System.out.println("=====================");
    fawkes.displayInfo();
    fawkes.makeSound();
    fawkes.performMagic();
    fawkes.regenerate();
  }
}

Output
Name: Drake
Age: 500
Drake roars with a fiery breath!
Drake breathes fire with power level: 75
Drake flies through the sky.
=====================
Name: Fawkes
Age: 200
Fawkes sings an enchanting song.
Fawkes is reborn with 5 rebirth cycles.
Fawkes regenerates its body in a burst of flames.
*/

public class MagicalTester {
    public static void main(String[] args) {
        Dragon drake = new Dragon("Drake", 500, 75);
        Phoenix fawkes = new Phoenix("Fawkes", 200, 5);
        drake.displayInfo();
        drake.makeSound();
        drake.performMagic();
        drake.fly();
        System.out.println("=====================");
        fawkes.displayInfo();
        fawkes.makeSound();
        fawkes.performMagic();
        fawkes.regenerate();
    }
}