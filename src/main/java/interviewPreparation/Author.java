package interviewPreparation;


public class Author
{
	
	public String Name;
	public int	Id;
	
	public Author(int Id, String Name)
	{
		this.Name = Name;
		this.Id = Id;
		System.out.println(Name +" "+ Id);
	}
	
	public static String GetAuthorName()
	{
		
		return "java";
	}
	
	public int GetAuthorID()
	{
		
		return 200;
	}
	
	
}

