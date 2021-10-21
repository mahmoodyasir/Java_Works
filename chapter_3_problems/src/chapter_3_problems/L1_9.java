package chapter_3_problems;
import java.util.Scanner;

public class L1_9 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter body weight: ");
		double weight = scanner.nextDouble();
		
		double calories = weight * 19;
		
		System.out.println("Total Calorie: ");
		System.out.format("%.2f", calories);
		
	}

}
