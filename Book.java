
public class Book extends ItemForSale
{
  
  private String title;
  private String publisher;

  public Book(String t, int p, Author a, String pub){
    super(t, p, a);
    publisher = pub;
  }

  public String getPublisher(){
    return publisher;
  }
  
}
