package chapter_3_problems;
import java.util.Scanner;

public class L3_24 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Number of coffe Bags/Units: ");
		int unit_number = scanner.nextInt();
		System.out.println("Wight of per Bag/Unit: ");
		double unit_weight = scanner.nextDouble();
		
		double raw_price = unit_weight * unit_number * 5.99;
		double tax_price = raw_price + raw_price * 0.0725;
		
		System.out.println("Number of bags sold: " + unit_number);
		System.out.format("     Weight per bag: %.2f", unit_weight);
		System.out.println(" lb");
		System.out.println("    Price per pound: $5.99");
		System.out.println("          Sales tax: 7.25% \n");
		System.out.format("        Total price: $ %.3f", tax_price);

	}

}
