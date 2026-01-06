//Task01

public class NikeBD {
 
    public static int total_branches;
    public static int total_jordan;
    public static int total_cortez;
    public static int total_kobe;
    public static int total_sold;
    public int jordan_branch;
    public int cortez_branch;
    public int kobe_branch;
    public int sold_branch;
    public String branch_name;

    public NikeBD(String outlet) {
        this.branch_name = outlet;
        total_branches++;
    }

    public void restockProducts(String product_name, int amount) {

        if(product_name.equals("Jordan")) {
            this.branch_name += amount;
            total_jordan += amount;
        } else if(product_name.equals("Cortez")) {
            this.branch_name += amount;
            total_cortez += amount;
        } else if(product_name.equals("Kobe")) {
            this.branch_name += amount;
            total_kobe += amount;
        }
    }

    public void restockProducts(String[] products, int[] amounts) {

        for(int i = 0; i < products.length; i++) {
            this.restockProducts(products[i], amounts[i]);
        }
    }

    public void updateSale(String product, int amount) {

        if(product.equals("Jordan")) {
            this.jordan_branch -= amount;
            total_jordan -= amount;
        } else if(product.equals("Cortez")) {
            this.cortez_branch -= amount;
            total_cortez -= amount;
        } else if(product.equals("Kobe")) {
            this.kobe_branch -= amount;
            total_kobe -= amount;
        }
    }

    public void productSold(String product_1, int amount_1, String product_2, int amount_2) {
        updateSale(product_1, amount_1);
        updateSale(product_2, amount_2);
    }

    public void details() {
        System.out.println("Nike: " + this.branch_name + " outlet: ");
        System.out.println("Products Currently Stocked: Jordan: " + this.jordan_branch + ", Cortez: " + this.cortez_branch + ", Kobe: " + this.kobe_branch);
        System.out.println("Sold: " + this.sold_branch);
    }

    public static void status() {
        System.out.println("Nike Bngladesh Status: ");
        System.out.println("Branches Opened: " + total_branches);
        System.out.println("Currently Stocked: Jordan: " + total_jordan + ", Cortez: " + total_cortez + ", Kobe: " + total_kobe);
        System.out.println("Sold: " + total_sold);
    }
}