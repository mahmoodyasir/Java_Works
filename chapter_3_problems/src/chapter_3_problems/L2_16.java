package chapter_3_problems;
import java.util.Scanner;

public class L2_16 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter body weight on earth: ");
		double weight = scanner.nextDouble();
		
		double mercury = weight * 0.4;
		double venus = weight * 0.9;
		double jupiter = weight * 2.5;
		double saturn = weight * 1.1;
		
		System.out.println("Your Weight on: ");
		
		System.out.format("Mercury = %.2f \n", mercury);
		System.out.format("Venus = %.2f \n", venus);
		System.out.format("Jupiter = %.2f \n", jupiter);
		System.out.format("Saturn = %.2f \n", saturn);

	}

}
