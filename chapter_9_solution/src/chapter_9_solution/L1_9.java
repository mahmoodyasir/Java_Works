package chapter_9_solution;
import java.util.*;

public class L1_9 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter(System.getProperty("line.separator"));
		
		String c;
		char check;
		
		System.out.println("Enter a character: ");
		
		c = scanner.next();
		
		while((int)c.charAt(0) != 64)
		{
			int length = c.length();
			
			if(length>1)
			{
				System.out.println("Error !!!! More than one chracter entered");
			}
			else
			{
				check = c.charAt(0);
				System.out.println("The ASCII value of " + check + " is " + (int)check);
			}
			System.out.println("Enter a character: ");
			c = scanner.next();
		}
		
		System.out.println("You entered @. Exiting Now ......");
		

	}

}
