package chapter_10_solution;
import java.util.*;

public class L2_18 {

	public static void main(String[] args) {
		
		Random random_gen = new Random();
		
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter(System.getProperty("line.separator"));
		
		List<String> fortuneList = new ArrayList<String>();
		
		fortuneList.add("You may need to debug carefully today.");
		fortuneList.add("Great Day! Error free codes !!");
		fortuneList.add("You will win a Lottary today !!");
		fortuneList.add("You'll have a great surprise today.");
		fortuneList.add("Happiness is programmin.g");
		fortuneList.add("Satisfaction follows hard work.");
		fortuneList.add("Patience is virtue");
		fortuneList.add("Easy Day !!");
		fortuneList.add("Difficult Day!!");
		fortuneList.add("You will acheive good result in this semester.");
		
		System.out.println("Fortune (y/N)? ");
		
		char choice = scanner.next().charAt(0);
		
		while(choice == 'y')
		{
			int r = random_gen.nextInt(10);
			System.out.println("Your fortune is: " + fortuneList.get(r));
			System.out.println("Fortune (y/N)? ");
			choice = scanner.next().charAt(0);
		}
		
		scanner.close();

	}

}
