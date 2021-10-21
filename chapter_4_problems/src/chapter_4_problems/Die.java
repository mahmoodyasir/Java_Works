//Problem - 5 
package chapter_4_problems;
import java.util.*;

public class Die {
	
	private static final int MAX_NUMBER = 6;
	
	private static final int MIN_NUMBER = 1;
	
	private static final int NO_NUMBER = 0;
	
	private int number;
	private Random random;
	
	//Constructor
	public Die() 
	{
		random = new Random();
		number = NO_NUMBER;
	}
	
	//Rolls the die
	public void roll()
	{
		number = random.nextInt (MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;
	}
	
	//Returns the number on this die
	public int getNumber()
	{
		return number;
	}

}
