package chapter_3_problems;
import java.util.Scanner;

public class L1_8 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Temperature in degree Celsius: ");
		int celsius = scanner.nextInt();
		
		double fahrenheit = 1.8 * celsius + 32;
		
		System.out.println("Temperature in fahrenheit is: ");
		System.out.format("%.2f", fahrenheit);

	}

}
