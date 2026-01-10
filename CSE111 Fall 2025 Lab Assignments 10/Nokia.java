//Task03

public class Nokia extends Mobile {

    public double balance;

    public Nokia(String model, boolean simCardStatus, String IMEICode, double balance) {
        super(model, IMEICode, simCardStatus);
        this.balance = balance;
    }

    public String dialCall(String number) {

        if(balance <= 0) {
            return "Insufficient balance! Please recharge.";
        }

        if(!simCardStatus) {
            return "No SIM card available! Please check the SIM card connectivity.";
        }

        String country_code = number.substring(0, 3);
        String country = getCountryName(country_code);

        if(country == null) {
            return "Dialing is not allowed in this region.";
        }

        return "Dialing the number " + number + " to " + country + " region.";
    }

    public void rechargeSIMCard(double amount) {
        balance += amount;
        System.out.println("Recharge successful! Current balance " + balance + " TK.");
    }

    @Override
    public String toString() {
        return super.toString() + "\nBalance: " + balance + " TK";
    }
}