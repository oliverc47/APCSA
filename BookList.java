import java.util.ArrayList;

public class BookList
{
  private static ArrayList<String> notInStock = new ArrayList<String>();
  private static ArrayList<String> inStock = new ArrayList<String>();
  private static ArrayList<String> inventory = new ArrayList<String>();
  
  
  public static ArrayList<String> getInventory()
  {
    return inventory;
  }
  
  public static ArrayList<String> getInStock()
  {
    return inventory;
  }
  
  public static  void addInStock(String b)
  {
    inStock.add(b);
  }
  
  public static  void addNotInStock(String b)
  {
    notInStock.add(b);
  }
  
  public static void addBook(String b) 
  {
    inventory.add(b);
  }
  
  public static ArrayList<String> getNotInStock()
  {
    return notInStock;
  }
}