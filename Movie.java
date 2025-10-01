public class Movie extends ItemForSale
{
  
   private int duration;

  public Book(String t, int p, String a, String d){
    super(t, p, a);
    duration = d;
  }
  
  public int getDuration(){
    return duration;
  }
  
}
