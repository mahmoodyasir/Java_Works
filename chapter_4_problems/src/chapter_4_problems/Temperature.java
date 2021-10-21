package chapter_4_problems;
import java.util.Scanner;

public class Temperature {
	
	double celsius, fahrenheit;
	
	public double to_fahrenheit()
	{
		double far = celsius * 1.8 + 32;
		return far;
	}
	
	public double to_celsius()
	{
		double cel = (( 5 *(fahrenheit - 32.0)) / 9.0);
		return cel;
	}
	
	public double setFahrenheit(double far)
	{
		fahrenheit = far;
		return fahrenheit;
	}
	
	public double setCelsius(double cel)
	{
		celsius = cel;
		return celsius;
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Value in Fahrenheit: ");
		
		double value = input.nextDouble();
		
		Temperature temp = new Temperature();
		
		temp.setFahrenheit(value);
		
		System.out.format("Temperature in Celsius: %.2f", temp.to_celsius());
		

	}

}
