import java.util.Scanner;

public class Wallet
{
  double budget;
  double spent;
  public Wallet()
  {
    setup();
  }
  public void setup()
  {
    System.out.println("How much money do you have? (in USD)");
    Scanner s = new Scanner(System.in);
    budget = s.nextDouble();
    s.close();
  }
  public void setMoney()
  {
    System.out.println("Enter the amount of money you have (in USD): ");
    Scanner s = new Scanner(System.in);
    budget = s.nextDouble();
    s.close();
  }
  public void setMoney(double b)
  {
    budget = b;
  }
  public double getMoney()
  {
    return budget;
  }
  public void spendMoney(double p)
  {
    budget -= p;
    spent += p;
  }
}