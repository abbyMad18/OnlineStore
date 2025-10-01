
public class Main
{
   //Your tests go here! I expect you to make sure various parts of your program work. 

     public static void main(String[] args)
     {
        Store s = new Store();
        Book b = new Book();
        System.out.println(b instanceof ItemForSale);
     }

      public static void test(){
         Store a = new Store();
         Book hp = new Book("Harry Potter", 8.0, "J.K. Rowling", "Scholastic");
         Book hg = new Book("Hunger Games", 9.5, "Suzanne Collins", "Scholastic Press");
         a.addItem(hp);
         a.addItem(hg);
         System.out.print("We have " a.showItems() " for sale");
         Movie s = new Movie("Superman", 12.0, "James Gunn", 129);
         Movie b = new Movie("Barbie", 11.5, "Greta Gerwig", 114);
         a.addItem(s);
         a.addItem(b);
         System.out.print(a.creator(s) + "made " + s.getTitle());
         System.out.print("We have " a.showItems() " for sale");
         System.out.print("Total profit: $" a.getProfit()) ;
         a.sellItem(b);
         System.out.print("Total profit: $" a.getProfit()) ;
         System.out.print("We have " a.showItems() " for sale");
         
      }
}
