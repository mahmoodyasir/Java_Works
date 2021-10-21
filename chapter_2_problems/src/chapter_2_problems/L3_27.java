package chapter_2_problems;
import java.util.*;

public class L3_27 {

	public static void main(String[] args) {
		
		System.out.println("Enter the string: ");
		Scanner input = new Scanner(System.in);
		input.useDelimiter(System.getProperty("line.separator"));
		String title = input.next();
		
		int length = title.length();
		System.out.println(length);
		
		char s1 = title.charAt(0);
		char s2 = title.charAt(length-1);
		
		System.out.println(length);
		System.out.println(s1);
		System.out.println(s2);

	}

}
