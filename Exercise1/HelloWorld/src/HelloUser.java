
import java.util.Scanner;
	public class HelloUser 

	{
		String userName;
	 
		public HelloUser(String string)
		{
			this.userName=string;
		}
		
	 
		public void greetUser()
		{
		 
		 System.out.println("Please enter your name :)");
		 Scanner scanner1 = new Scanner( System.in );
		 this.userName = scanner1.nextLine();
		 System.out.print("Hello " + userName);
		}
	 
	}
