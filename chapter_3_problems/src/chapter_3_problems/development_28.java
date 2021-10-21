package chapter_3_problems;
import java.util.Scanner;
import java.lang.Math;

public class development_28 {

	public static void main(String[] args) {
		
		int dollar = 100;
		int quarter = 25;
		int dime = 10;
		int nickel = 5;
		int penny = 1;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Purchase Price In Cents: ");
		double p_price = scanner.nextDouble();
		
		System.out.println("Enter Amount Tendered In Cents: ");
		double tender = scanner.nextDouble();
		
		double temp = tender - p_price;
		double cents = Math.abs(temp);
		
		double change = cents / 100;
		
		int num_dollar = (int)cents / dollar;
		int cents_left = (int)cents % dollar;
		
		int num_quarter = cents_left / quarter;
		cents_left = cents_left % quarter;
		
		int num_dime = cents_left / dime;
		cents_left = cents_left % dime;
		
		int num_nickel = cents_left / nickel;
		cents_left = cents_left % nickel;
		
		int num_penny = cents_left / penny;
		cents_left = cents_left % penny;
		
		System.out.println("Purchase Price: $ " + p_price / 100);
		System.out.println("Amount Tendered: $ " + tender / 100 + "\n");
		
		System.out.println("Your change is: $ " + change + "\n");
		
		System.out.println(num_dollar + " one-dollar-bill(s)");
		System.out.println(num_quarter + " quarter(s)");
		System.out.println(num_dime + " dime(s)");
		System.out.println(num_nickel + " nickel(s)");
		System.out.println(num_penny + " penn(y/ies)" + "\n");
		
		System.out.println("Thank you for your business. Come back soon.");
		

	}

}
