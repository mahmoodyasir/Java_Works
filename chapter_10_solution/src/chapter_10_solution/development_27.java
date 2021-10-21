package chapter_10_solution;
import java.util.*;
import java.lang.*;

public class development_27 {

	public static void main(String[] args) {
		
		int[] x = new int[20];
		int[] y = new int[20];
		
		int temp = 1;
		int i = 0;
		
		double g = 9.8;
		
		double dist = 0;
		int time = 1;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter initial Speed: ");
		double vel = input.nextDouble();
		
		System.out.println("Enter initial Angle: ");
		double alpha = input.nextDouble();
		
		double rad = (alpha * 3.186) / 180;
		
		while(temp > 0)
		{
			x[i] = (int)(vel * Math.cos(rad) - time);
			temp = (int)((vel * Math.sin(rad) * time) - (g * time * time) / 2);
			y[i] = temp;
			time++;
			i++;
		}
		
		for(int j = 0; j < time ; j++)
		{
			dist = Math.sqrt(Math.pow((x[j+1]-x[j]),2) + Math.pow((y[j+1] - y[j]),2));
			System.out.println("Average Distance :" + dist + " in " + j + " seconds ");
			System.out.print("\n");
		}

	}

}
