/*
Task 1

Implement the design of the  Butterfly class and the Moth class so that these classes extend from the Caterpillar class and generate the output as follows.
Butterfly loses 5 units of energy due to flying and gains 5 energy units per food amount
Moth loses 2.5 units of energy due to nocturnal activity and gains 2.5 energy units per food amount

Given Code
public class Caterpillar_Tester {
  public static void main(String[] args) {
    Caterpillar c = new Caterpillar("Leaf", 5);
    c.showDetails();
    System.out.println("--------------1-------------");
    c.eat();
    c.eat(3);
    c.showDetails();
    System.out.println("--------------2-------------");
    Butterfly b = new Butterfly("Flower", 2);
    Moth m = new Moth("Cotton", 4);    
    System.out.println("--------------3-------------");
    b.transform();
    m.transform();
    System.out.println("--------------4-------------");
    b.eat(2);        
    m.eat(5);        
    System.out.println("--------------5-------------");
    b.showDetails(); 
    m.showDetails();    
  }
}

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

Expected Output
Food: Leaf
Age: 5
Energy: 0.0
--------------1-------------
Caterpillar ate 1 unit of food
Caterpillar ate 3 units of food
Food: Leaf
Age: 5
Energy: 4.0
--------------2-------------
--------------3-------------
Caterpillar transforms into Butterfly
Caterpillar transforms into Moth
--------------4-------------
Butterfly lost energy while flying and absorbed nectar
Moth lost energy due to nocturnal activity
--------------5-------------
Food: Flower
Age: 2
Energy: 5.0 joules
Food: Cotton
Age: 4
Energy: 10.0 joules 
*/

public class Caterpillar_Tester {
    public static void main(String[] args) {
        Caterpillar c = new Caterpillar("Leaf", 5);
        c.showDetails();
        System.out.println("--------------1-------------");
        c.eat();
        c.eat(3);
        c.showDetails();
        System.out.println("--------------2-------------");
        Butterfly b = new Butterfly("Flower", 2);
        Moth m = new Moth("Cotton", 4);
        System.out.println("--------------3-------------");
        b.transform();
        m.transform();
        System.out.println("--------------4-------------");
        b.eat(2);
        m.eat(5);
        System.out.println("--------------5-------------");
        b.showDetails();
        m.showDetails();
    }
}