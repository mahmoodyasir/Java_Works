package chapter_9_solution;
import java.util.*;

public class L2_13 {

	public static void main(String[] args) {
		
		String string;
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter(System.getProperty("line.separator"));
		
		System.out.println("Enter a String");
		
		string = scanner.next();
		
		int count_up = 0;
		
		char up;
		
		while(string.length() != 0)
		{
			for(int i = 0; i < string.length(); i++)
			{
				up = string.charAt(i);
				
				if(Character.isUpperCase(up))
				{
					count_up++;
				}
			}
			System.out.println("The number of Upper Case in the sentence are: " + count_up);
			count_up = 0;
			
			System.out.println("Enter a String: ");
			string = scanner.next();
		}
		System.out.println("Received an empty string. Existing Now !");

	}

}
