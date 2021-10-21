package chapter_10_solution;
import java.util.*;

public class L1_11 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter(System.getProperty("line.separator"));
		
		int N;
		
		System.out.println("Enter N: ");
		
		N = scanner.nextInt();
		
		double[] real = new double[N];
		
		double sum = 0, avg, s, a = 0;
		
		for(int i = 0; i < N; i++)
		{
			System.out.println("Enter a real number [" + (i+1) + "]: ");
			real[i] = scanner.nextDouble();
			sum += real[i];
		}
		
		avg = sum / N;
		
		for(int i = 0; i < N; i++)
		{
			a += Math.pow((real[i] - avg), 2);
		}
		
		s = Math.sqrt(a/N);
		System.out.println("Standard Deviation: " + s);

	}

}
