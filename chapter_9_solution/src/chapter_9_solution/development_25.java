package chapter_9_solution;
import java.util.*;
import java.io.*;

public class development_25 {

	public static void main(String[] args) {
		
		String str, temp;
		int count;
		
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter(System.getProperty("line.separator"));
		
		System.out.println("Enter a String");
		
		str = scanner.next();
		
		System.out.println("You have entered: " + str);
		
		for(count = 0; count < str.length(); count++)
		{
			temp = str.substring(count, count + 1);
			
			if(temp.equalsIgnoreCase("a") || 
					temp.equalsIgnoreCase("e") ||
					temp.equalsIgnoreCase("i") ||
					temp.equalsIgnoreCase("o") ||
					temp.equalsIgnoreCase("u"))
			{
				
				str = str.substring(0, count) + "egg" + temp + str.substring(count + 1, str.length());
				count = count + 3;
				
			}
		}
		System.out.println("Resulting string is: " + str);

	}

}
