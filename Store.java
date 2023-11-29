import java.util.Scanner;

public class Store
{
  public Store()
  {
    intro();
    getName();
    Wallet wallet = new Wallet();
    buyOrLook();
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
  
  
  public void buyOrLook()
  {
    System.out.println("Do you know what you'd like to buy, or would you like to see our catalog?\n[1] Buy\n[2] Catalog");
    Scanner s = new Scanner(System.in);
    String input = s.nextLine();
    if(input.equals("Buy") || Integer.parseInt(input) == 1)
    {
      buy();
    } 
    else 
    {
      if(s.nextLine().equals("Catalog") || s.nextInt() == 2)
      {
        catalog();
      }
      else 
      {
        System.out.println("That's not an option, silly!");
        buyOrLook();
      }
    }
  }
  
  
  public void buy()
  {
    System.out.println("What's the name of the book you'd like to buy?");
    Scanner s = new Scanner(System.in);
    String book = s.nextLine();
    s.close();
    System.out.println("That will cost you " + ((Math.random() * 15) + 15) + " USD.");
  }
  
  
  public void catalog()
  {
  }
}
  
  
  
  
  
  
  
  
  
  