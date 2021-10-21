package chapter_3_problems;
import java.util.Scanner;

public class L2_17 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age in earth: ");
		double age = scanner.nextDouble();
		
		double mercury = (age * 365) / 88;
		double venus = (age * 365) / 225;
		double jupiter = (age * 365) / 4380;
		double saturn = (age * 365) / 10767;
		
		System.out.println("Your Age In: ");
		
		System.out.format("Mercury = %.2f \n", mercury);
		System.out.format("Venus = %.2f \n", venus);
		System.out.format("Jupiter = %.2f \n", jupiter);
		System.out.format("Saturn = %.2f \n", saturn);

	}

}
