public class ItemForSale
{
  
  private String title;
  private int price;
  private Object creator;

  public ItemForSale(String t, int p, Object c){
    title = t;
    price = p;
    creator = c;
  }

  public String getTitle(){
    return title;
  }

  public int getPrice(){
    return price;
  }

  public Object getCreator(){
    return creator;
  }
  
}
