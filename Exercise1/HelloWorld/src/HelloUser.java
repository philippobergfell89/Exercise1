
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
	 System.out.println("Please enter your name :)");
	 Scanner scanner1 = new Scanner( System.in );
	 this.userName = scanner1.nextLine();
	 System.out.print("Hello " + userName);
	}
}