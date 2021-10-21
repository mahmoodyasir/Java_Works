package chapter_6_problems;
import java.util.ArrayList;
import java.util.Scanner;


public class L1_15 {

	public static void main(String[] args) {
		
		//find perfect number
				Integer number;
				Scanner scanner = new Scanner(System.in);
				
				System.out.println("Enter Number: ");
				number = scanner.nextInt();
				
				Integer divisorSum = 0;
				ArrayList<Integer> divisotList = new ArrayList<Integer>();
				
				for(int i=1; i<number;i++) {
					if(number%i == 0) {
						divisorSum+=i;
						divisotList.add(i);
					}
				}
				
				
				if(divisorSum == number) {
					System.out.println("Perfect Number");
					System.out.println("Divisors are as follows: ");
					for(int i=0; i<divisotList.size(); i++) {
						System.out.println(divisotList.get(i));
					}
					
				}else {
					System.out.print("Not a Perfect Number");
				}

			}

}
