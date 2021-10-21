package chapter_2_problems;
import java.util.*;

public class L2_26 {

	public static void main(String[] args) {
		
		System.out.println("Enter the string: ");
		Scanner input = new Scanner(System.in).useDelimiter("\n");
		String title = input.next();
		
		String[] parts = title.split("!");
		String part1 = parts[0];
		String part2 = parts[1];
		
		System.out.println(part1);
		System.out.println(part2);
		
		input.close();

	}

}
