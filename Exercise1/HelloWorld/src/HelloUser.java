
import java.util.Scanner;
public class HelloUser 

{
	String userName;
 
	public HelloUser(String a)
	{
		this.userName=a;
	}
	
 
	public void greetUser()
	{
	 
	 Scanner scanner1 = new Scanner( System.in );
	 this.userName = scanner1.nextLine();
	 System.out.print("Hello " + userName);
	}
 
}