package own_trying_problem;
import java.util.*;

public class ExtractWords {

	private static final char BLANK = ' ';

	public static void main(String[] args) {
		
		System.out.println("Enter the string: ");
		Scanner input = new Scanner(System.in);
		input.useDelimiter(System.getProperty("line.separator"));
		String title = input.next();
		
		int length = title.length();
		char store;
		
		int index = 0;
		System.out.println();
		
		do{
			
			if(title.charAt(index) != BLANK)
			{
				store = title.charAt(index);
				System.out.print(store);
				index++;
			}
			
			else if(title.charAt(index) == BLANK && title.charAt(index + 1) == BLANK)
			{
				index++;
			}
			
			else if(title.charAt(index) == BLANK && title.charAt(index + 1) != BLANK)
			{
				System.out.println();
				index++;
			}
			
			
			
		}while(index < length);
		

	}

}
