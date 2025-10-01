
public class Book extends ItemForSale
{
  private String title;
  private String publisher;

  public Book(String t, Author a, int p, String pub){
    super(p, a);
    title = t;
    publisher = pub;
  }

  public String getTitle(){
    return title;
  }

  public String getPublisher(){
    return publisher;
  }
  
}
