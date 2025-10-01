public class ItemForSale
{
  private int price;
  private Object creator;

  public ItemForSale(int p, Object c){
    price = p;
    creator = c;
  }

  public int getPrice(){
    return price;
  }

  public Object getCreator(){
    return creator;
  }
  
}
