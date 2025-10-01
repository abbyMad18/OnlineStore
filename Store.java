/*Implement the following functionality into the store:

  instance variables: 
    profit: how much money the store has made
    items:  instance variable (could be an array or LinkedList or ArrayList of one of the other classes)

  methods:
    showItems: displays all items available for sale
    addItem: adds an item for sale
    sellItem(itemName): removes the item from the store and adds its price to profit
    creator(itemName): displays who created the item in question

    You will need to include the following information to be stored in the inheritance heiarchy using the other classes:
      name of thing being sold
      price for things that are on sale
      names of creators of movies and books
      date of birth of book authors
      date that things are placed on sale
      duration of movies
      publisher of books

    Where these variables are stored and how to name them is up to you!
*/
public class Store
{
  int profit;
  ArrayList<ItemForSale> items = new ArrayList<ItemForSale>();

  public Store(){
    profit = 0;
    items = null;
  }
  
  public ArrayList showItems(){
    return items;
  }
  
  public void addItem(ItemForSale new){
    items.add(new);
  }
  
  public void sellItem(ItemForSale sold){
    items.remove(sold);
    profit+=sold.getPrice();
  }
  
  public Object creator(ItemForSale item){
    if(item instanceOf Book){
      return item.getAuthor();
    }
    else{
      return item.getCreator();
    }
  }
  
}
