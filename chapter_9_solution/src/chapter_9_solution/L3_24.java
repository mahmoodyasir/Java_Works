package chapter_9_solution;
import java.util.*;

public class L3_24 {

	public static void main(String[] args) {
		
		String sentence;
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter(System.getProperty("line.separator"));
		
		System.out.println("Enter a Sentence");
		
		sentence = scanner.next();
		
		String rev;
		
		while(sentence.length() != 0)
		{
			sentence = sentence.replaceAll("\\W", "");
			
			StringBuffer strBuf = new StringBuffer(sentence);
			
			rev = strBuf.reverse().toString();
			
			if(sentence.equalsIgnoreCase(rev))
			{
				System.out.println("Palindrome !!!");
			}
			else
			{
				System.out.println("Not a Palindrome !!!");
			}
			
			System.out.println("Enter a Sentence");
			sentence = scanner.next();
		}
		System.out.println("Received an empty string. Existing Now !");

	}

}
