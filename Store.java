import java.util.Scanner;
import java.util.concurrent.TimeUnit;

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
    if(BookList.getNotInStock().size() >0)
    {
      System.out.println("Hey, we ordered those books you asked for before!");
      for(int i = 0; i < BookList.getNotInStock().size(); i++)
      {
        for(int a = 0; a < 4; a++)
        {
          System.out.println("Searching");
          try {
            TimeUnit.SECONDS.sleep(1);
          } catch (InterruptedException e) {
            System.out.println("Threw InterruptedException");
          }
            
        }
        System.out.println("Found it!");
        BookList.addInStock(BookList.getNotInStock().get(i));
      }
    }
    System.out.println("Do you know what you'd like to buy, or would you like to see our catalog?\n[1] Buy\n[2] Catalog");
    Scanner s = new Scanner(System.in);
    String input = s.nextLine();
    if(input.equals("Buy") || Integer.parseInt(input) == 1)
    {
      buy();
    } 
    else 
    {
      if(input.equals("Catalog") || Integer.parseInt(input) == 2)
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
    if(Math.random() > .25)
    {
      System.out.println("That will cost you " + (int)(Math.random() * 15 + 15) + " USD.");
    } else {
      System.out.println("We don't have that right now. Sorry!");
      BookList.addNotInStock(book);
    }
    buyOrLook();
  }
  
  
  public void catalog()
  {
  }
}