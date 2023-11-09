import java.util.Scanner;

public class Store
{
  public Store()
  {
    intro();
    getName();
    Wallet wallet = new Wallet();
  }
  public void intro()
  {
    System.out.println("---------------------------------\n| Welcome to Oliver's Bookshop! |\n---------------------------------");
  }
  public void getName() 
  {
    System.out.println("What's your name?");
    Scanner scan = new Scanner(System.in);
    String name = scan.nextLine();
    scan.close();
    if(name.equalsIgnoreCase("oliver"))
    {
      System.out.println("Wow! We have the same name! \nWelcome " + name + "!");
    } else {
      System.out.println("Welcome " + name + "!");
    }
  }
  
}