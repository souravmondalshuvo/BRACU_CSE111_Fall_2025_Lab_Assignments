/*
Task 3

Design the Nokia class derived from the Mobile class so that the following output is produced.

Parent Class 
class Mobile {
  public String model;
  public String IMEICode;
  public boolean simCardStatus;
  
  public Mobile(String model, String IMEICode, boolean simCardStatus) {
    this.model = model;
    this.IMEICode = IMEICode;
    this.simCardStatus = simCardStatus;
    System.out.println("Model " + model + " is manufactured.");
  }
    
  public String getCountryName(String countryCode) {
    if (countryCode.equals("880")) {
      return "Bangladesh";
    } else if (countryCode.equals("455")) {
      return "USA";
    }
    return null;
  }
    
  public void activateSimCard() {
    if (!simCardStatus) {
      simCardStatus = true;
      System.out.println("SIM card is activated successfully.");
    }
  }
  
  @Override
  public String toString() {
    return "Mobile Phone Detail:\nModel: " + model + "\nIMEICode: " + IMEICode + "\nSIM Card Status: " + simCardStatus;
  }
}

//Driver code below
Driver Code
public class MobileTester {
  public static void main(String[] args) {
    Nokia N3110 = new Nokia("N3110", true, "IMEI-102", 0);
    System.out.println(N3110);
    System.out.println("1========================");
    Nokia N1100 = new Nokia("N1100", false, "IMEI-124", 100);
    System.out.println(N1100);
    System.out.println("2========================");
    System.out.println(N3110.dialCall("88017196xxxx"));
    System.out.println("3========================");
    N3110.rechargeSIMCard(200);
    N1100.rechargeSIMCard(300);
    System.out.println("4========================");
    System.out.println(N3110.dialCall("88017196xxxx"));
    System.out.println("5========================");
    System.out.println(N1100.dialCall("45517196xxxx"));
    System.out.println("6========================");
    N1100.activateSimCard();
    System.out.println("7========================");
    System.out.println(N1100.dialCall("45517196xxxx"));
    System.out.println("8========================");
    System.out.println(N1100.dialCall("96617196xxxx"));
  }
}

Output
Model N3110 is manufactured.
Mobile Phone Detail:
Model: N3110
IMEICode: IMEI-102
SIM Card Status: true
Balance: 0.0 TK
1========================
Model N1100 is manufactured.
Mobile Phone Detail:
Model: N1100
IMEICode: IMEI-124
SIM Card Status: false
Balance: 100.0 TK
2========================
Insufficient balance! Please recharge.
3========================
Recharge successful! Current balance 200.0 TK.
Recharge successful! Current balance 400.0 TK.
4========================
Dialing the number 88017196xxxx to Bangladesh region.
5========================
No SIM card available! Please check the SIM card connectivity.
6========================
SIM card is activated successfully.
7========================
Dialing the number 45517196xxxx to USA region.
8========================
Dialing is not allowed in this region.
*/

public class MobileTester {
    public static void main(String[] args) {
        Nokia N3110 = new Nokia("N3110", true, "IMEI-102", 0);
        System.out.println(N3110);
        System.out.println("1========================");
        Nokia N1100 = new Nokia("N1100", false, "IMEI-124", 100);
        System.out.println(N1100);
        System.out.println("2========================");
        System.out.println(N3110.dialCall("88017196xxxx"));
        System.out.println("3========================");
        N3110.rechargeSIMCard(200);
        N1100.rechargeSIMCard(300);
        System.out.println("4========================");
        System.out.println(N3110.dialCall("88017196xxxx"));
        System.out.println("5========================");
        System.out.println(N1100.dialCall("45517196xxxx"));
        System.out.println("6========================");
        N1100.activateSimCard();
        System.out.println("7========================");
        System.out.println(N1100.dialCall("45517196xxxx"));
        System.out.println("8========================");
        System.out.println(N1100.dialCall("96617196xxxx"));
    }
}