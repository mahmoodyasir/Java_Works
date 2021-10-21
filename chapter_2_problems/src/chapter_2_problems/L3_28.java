package chapter_2_problems;
import java.util.*;

public class L3_28 {

	public static void main(String[] args) {
		
		System.out.println("Enter a word: ");
		Scanner input = new Scanner(System.in).useDelimiter("\n");
		String title = input.next();
		
		int length = title.length();
		length = length - 1;
		int sum = length / 2;
		
		char s1 = title.charAt(sum);
		
		System.out.println(s1);

	}

}
