//Problem - 5
package chapter_4_problems;

public class RollDice {

	public static void main(String[] args) {
		
		Die one, two, three;
		one   = new Die();
		
		one.roll();
		
		System.out.println("Result of first Roll: " + one.getNumber());
		
		one.roll();
		
		System.out.println("Result of second Roll: " + one.getNumber());
		
		one.roll();
		
		System.out.println("Result of third Roll: " + one.getNumber());

	}

}
