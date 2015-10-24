/**
 * 
 */
import java.util.Scanner;
/**
 * @author Tobias
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Scanner user_input = new  Scanner (System.in);
		String userName;

		
		System.out.println("Hello ASE2015 - how are you now? :)");

		System.out.println("Hello ASE2015 - how are you? :)");

		System.out.println("Please enter your name ! :)");
		
		userName = user_input.next();
		System.out.println("Hello" + userName);
	}

}
