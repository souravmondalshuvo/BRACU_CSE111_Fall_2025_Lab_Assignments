/*
Task 1

We know that Nike has opened their official outlets in Bangladesh. So let's construct a NikeBD class so that they can keep track of their inventory and sales here.
[Hint: Only 3 types of products are available: “Jordan”, “Cortez” and “Kobe”]

Driver Code
public class NikeTester {
  public static void main(String[] args) {
    System.out.println("==========1==========");
    NikeBD.status();
    NikeBD dhaka = new NikeBD("Dhaka Banani");
    NikeBD chittagong = new NikeBD("Chittagong GEC");
    System.out.println("==========2==========");
    dhaka.details();
    System.out.println("==========3==========");
    chittagong.details();
    System.out.println("==========4==========");
    dhaka.restockProducts("Jordan", 200);
    System.out.println("==========5==========");
    String [] products = {"Jordan", "Cortez", "Kobe"};
    int [] qty = {1200, 200, 200};
    String [] products2 = {"Jordan", "Cortez", "Kobe"};
    int [] qty2 = {1200, 250, 100};
    dhaka.restockProducts(products, qty);
    System.out.println("==========6==========");
    chittagong.restockProducts(products2, qty2);
    System.out.println("==========7==========");
    NikeBD.status();
    System.out.println("==========8==========");
    dhaka.details();
    System.out.println("==========9==========");
    chittagong.details();
    dhaka.productSold("Jordan", 760, "Cortez", 90);
    chittagong.productSold("Jordan", 520, "Kobe", 70);
    System.out.println("==========10==========");
    NikeBD.status();
    System.out.println("==========11==========");
    chittagong.details();

  }
}

Output
==========1==========
Nike Bangladesh Status:
Branches Opened: 0
Currently Stocked: Jordan: 0, Cortez: 0, Kobe: 0
Sold: 0
==========2==========
Nike Dhaka Banani outlet:
Products Currently Stocked: Jordan: 0, Cortez: 0, Kobe: 0
Sold: 0
==========3==========
Nike Chittagong GEC outlet:
Products Currently Stocked: Jordan: 0, Cortez: 0, Kobe: 0
Sold: 0
==========4==========
==========5==========
==========6==========
==========7==========
Nike Bangladesh Status:
Branches Opened: 2
Currently Stocked: Jordan: 2600, Cortez: 450, Kobe: 300
Sold: 0
==========8==========
Nike Dhaka Banani outlet:
Products Currently Stocked: Jordan: 1400, Cortez: 200, Kobe: 200
Sold: 0
==========9==========
Nike Chittagong GEC outlet:
Products Currently Stocked: Jordan: 1200, Cortez: 250, Kobe: 100
Sold: 0
==========10==========
Nike Bangladesh Status:
Branches Opened: 2
Currently Stocked: Jordan: 1320, Cortez: 360, Kobe: 230
Sold: 1440
==========11==========
Nike Chittagong GEC outlet:
Products Currently Stocked: Jordan: 680, Cortez: 250, Kobe: 30
Sold: 590
*/

public class NikeTester {
    public static void main(String[] args) {
        System.out.println("==========1==========");
        NikeBD.status();
        NikeBD dhaka = new NikeBD("Dhaka Banani");
        NikeBD chittagong = new NikeBD("Chittagong GEC");
        System.out.println("==========2==========");
        dhaka.details();
        System.out.println("==========3==========");
        chittagong.details();
        System.out.println("==========4==========");
        dhaka.restockProducts("Jordan", 200);
        System.out.println("==========5==========");
        String[] products = { "Jordan", "Cortez", "Kobe" };
        int[] qty = { 1200, 200, 200 };
        String[] products2 = { "Jordan", "Cortez", "Kobe" };
        int[] qty2 = { 1200, 250, 100 };
        dhaka.restockProducts(products, qty);
        System.out.println("==========6==========");
        chittagong.restockProducts(products2, qty2);
        System.out.println("==========7==========");
        NikeBD.status();
        System.out.println("==========8==========");
        dhaka.details();
        System.out.println("==========9==========");
        chittagong.details();
        dhaka.productSold("Jordan", 760, "Cortez", 90);
        chittagong.productSold("Jordan", 520, "Kobe", 70);
        System.out.println("==========10==========");
        NikeBD.status();
        System.out.println("==========11==========");
        chittagong.details();

    }
}