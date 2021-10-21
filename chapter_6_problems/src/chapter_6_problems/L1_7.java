package chapter_6_problems;
import java.util.Scanner;

public class L1_7 {
	
	
	public static boolean checkPrime(Integer number) {
			
			if(number ==0)
				return false;
			
			if(number ==1)
				return true;
			
			for(int i=2; i < number; i++) {
				if(number%i == 0)
					return false;
			}
			
			return true;
		}

	

	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);
		
		while(true) {
			Integer number = scanner.nextInt();
			if(number < 0) {
				break;
			}
			
			boolean isPrime = checkPrime(number);
			
			if(isPrime) {
				System.out.println("Prime");
			}else {
				System.out.println("Not Prime");
			}
			
		}
		


	}

}
