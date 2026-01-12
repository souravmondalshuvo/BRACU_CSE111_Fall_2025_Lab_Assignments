/*
Task 5

Design the Bondhus class derived from the SocialMedia class so that the following output is produced.

Parent Class 
public class SocialMedia{
  public String userName;
  public String email;
  
  public SocialMedia(String name, String mail){
    userName = name;
    email = mail;
  }
  @Override
  public String toString() {
    return userName + "'s profile:"+ "\nUser Name: " + userName + "\nEmail:" + email;
  }
}

Driver Code
public class SocialMediaTester{
  public static void main(String []args){
    Bondhus f1 = new Bondhus("Sheldon", "sheldon@qmail.com");
    Bondhus f2 = new Bondhus("Penny", "penny@qmail.com");
    Bondhus f3 = new Bondhus("Leonard", "leonard@qmail.com");
    System.out.println("1----------------------------");
    f1.showSentbox();
    System.out.println("2----------------------------");
    f2.showSentbox();
    System.out.println("3----------------------------");
    f2.sendMessage("Hi");
    f2.sendMessage("Hello");
    f2.sendMessage("NiHao");
    f3.sendMessage("Hola");
    f3.sendMessage("Sheldon, please.");
    System.out.println("4----------------------------");
    f2.showSentbox();
    System.out.println("5----------------------------");
    f1.showSentbox();
    System.out.println("6----------------------------");
    f1.sendMessage("Bazinga!");
    f2.sendMessage("Well, duh!");
    f3.showSentbox();
    System.out.println("7----------------------------");
    f2.showSentbox();
    f2.sendMessage("Bye.");
    f2.sendMessage("Oh! No");
    System.out.println("8----------------------------");
    f1.showSentbox();
    System.out.println("9----------------------------");
    System.out.println(f1);
    System.out.println("10----------------------------");
    System.out.println(f2);
  }
}

Output
1----------------------------
Sheldon's Sentbox:
No sent messages.
2----------------------------
Penny's Sentbox:
No sent messages.
3----------------------------
4----------------------------
Penny's Sentbox:
Hi
Hello
NiHao
5----------------------------
Sheldon's Sentbox:
No sent messages.
6----------------------------
Leonard's Sentbox:
Hola
Sheldon, please.
7----------------------------
Penny's Sentbox:
Hi
Hello
NiHao
Well, duh!
Sentbox is full.
8----------------------------
Sheldon's Sentbox:
Bazinga!
9----------------------------
Sheldon's profile:
User Name: Sheldon
Email:sheldon@qmail.com
Messages Sent: 1
10----------------------------
Penny's profile:
User Name: Penny
Email:penny@qmail.com
Messages Sent: 5
*/

public class SocialMediaTester {
    public static void main(String[] args) {
        Bondhus f1 = new Bondhus("Sheldon", "sheldon@qmail.com");
        Bondhus f2 = new Bondhus("Penny", "penny@qmail.com");
        Bondhus f3 = new Bondhus("Leonard", "leonard@qmail.com");
        System.out.println("1----------------------------");
        f1.showSentbox();
        System.out.println("2----------------------------");
        f2.showSentbox();
        System.out.println("3----------------------------");
        f2.sendMessage("Hi");
        f2.sendMessage("Hello");
        f2.sendMessage("NiHao");
        f3.sendMessage("Hola");
        f3.sendMessage("Sheldon, please.");
        System.out.println("4----------------------------");
        f2.showSentbox();
        System.out.println("5----------------------------");
        f1.showSentbox();
        System.out.println("6----------------------------");
        f1.sendMessage("Bazinga!");
        f2.sendMessage("Well, duh!");
        f3.showSentbox();
        System.out.println("7----------------------------");
        f2.showSentbox();
        f2.sendMessage("Bye.");
        f2.sendMessage("Oh! No");
        System.out.println("8----------------------------");
        f1.showSentbox();
        System.out.println("9----------------------------");
        System.out.println(f1);
        System.out.println("10----------------------------");
        System.out.println(f2);
    }
}