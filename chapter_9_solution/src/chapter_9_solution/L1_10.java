package chapter_9_solution;
import java.util.*;


public class L1_10 {

	public static void main(String[] args) {
		
		String string;
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter(System.getProperty("line.separator"));
		
		System.out.println("Enter a sentence");
		
		string = scanner.next();
		
		while(string.length() != 0)
		{
			String reverse = new StringBuffer(string).reverse().toString();
			
			System.out.println("Sentence after reverse: " + reverse);
			
			System.out.println("Enter sentence");
			string = scanner.next();
			
		}
		System.out.println("Received an empty string. Existing Now !");
	}

}
