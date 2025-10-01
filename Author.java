public class Author
{
  
  private String name;
  private String dateOfBirth;

  public Author(String n, String d){
    name = n;
    dateOfBirth = d;
  }

  public String getName(){
    return name;
  }

  public String getDateOfBirth(){
    return dateOfBirth;
  }
  
}
