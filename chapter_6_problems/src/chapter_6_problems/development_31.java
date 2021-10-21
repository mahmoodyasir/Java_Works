package chapter_6_problems;
import java.util.*;
import java.util.spi.TimeZoneNameProvider;

public class development_31 {
	
	public static final double ACC = -9.81;
	
	public static double round2(double n)
	{
		return (int) (n * 100.0 + 0.5) / 100.0;
	}

	public static void main(String[] args) {
		
		Scanner UserInput = new Scanner(System.in);
		System.out.println();
		
		System.out.print("Enter Velocity (in meters/second): ");
		double velocity = UserInput .nextDouble();
		System.out.print("Enter Angle (in degrees): ");
		
		double InitialAngle = Math.toRadians(UserInput.nextDouble());
		System.out.println();
		
		
		double XCord = velocity * Math.cos(InitialAngle);
		double YCord = velocity * Math.sin(InitialAngle);
		double AddSecond = 1;
		double xIncrement = XCord * AddSecond;
		double x = 0.0;
		double y = 0.0;
		double t = 0.0;
		
		System.out.println("step\tx\ty\ttime");
		int count = 0;
		
		do
		{
			
			t += AddSecond;
			x += xIncrement;
			y = YCord * t + 0.5 * ACC * t * t;
			
			if (round2(y) <= 0)
			{
				break;
			}
			
			System.out.println(count + "\t" + round2(x) + "\t" + round2(y) + "\t" + round2(t));
			count++;
			
		}while (y > 0);
	}

}
