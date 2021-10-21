package chapter_6_problems;
import java.util.ArrayList;
import java.util.Scanner;


public class L1_16 {

	public static void main(String[] args) {
		
		//find perfect number
		Integer limit;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Limit: ");
		limit = scanner.nextInt();
		ArrayList<Integer> perfectList = new ArrayList<Integer>();
		
		for(int number=6; number <= limit; number++) 
		{
			Integer divisorSum = 0;
			
			for(int i=1; i<number;i++) 
			{
				if(number%i == 0) 
				{
					divisorSum+=i;
					//divisotList.add(i);
				}
			}
			
			
			if(divisorSum == number) 
			{
				perfectList.add(number);
				
			}
			else 
			{
				System.out.println(number + " is not a Perfect Number");
			}
		}
		
		System.out.println("Perfect Numbers Found: ");
		for(int i=0; i < perfectList.size(); i++) 
		{
			System.out.println(perfectList.get(i));
		}


	}

}
