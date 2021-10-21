package chapter_4_level_2;
import java.util.Scanner;

public class Height {
	
	int age;
	double height;
	
	public double rec_weight(int age, double height)
	{
		int s_age = age;
		double s_height = height;
		
		double weight = Math.abs((s_height - 100 + s_age / 10) * 0.90);
		
		return weight;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Height obj = new Height();
		
		System.out.println("Enter age: ");
		int age = scan.nextInt();
		
		System.out.println("Enter height: ");
		double height = scan.nextDouble();
		
		System.out.println("Recommended Weight: " + obj.rec_weight(age, height));
		
	}

}
