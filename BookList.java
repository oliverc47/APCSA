import java.util.ArrayList;

public class BookList
{
  private ArrayList<String> inventory = new ArrayList<String>();
  
  
  public ArrayList<String> getInventory()
  {
    return inventory;
  }
  
  
  public void addBook(String b) 
  {
    inventory.add(b);
  }
}