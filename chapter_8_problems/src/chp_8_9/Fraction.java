package chp_8_9;

import java.util.*;

class Fraction extends Exception
{ 

	private int numerator;

	private int denominator;

	public Fraction(int num, int denom) 
	{
	 
		setNumerator(num);

		setDenominator(denom);
	}

	public int getDenominator() 
	{
	 
		return denominator;
	}

	public int getNumerator() 
	{
	 
		return numerator;
	}

	public void setDenominator(int denom) 
	{
	 
		 if (denom == 0) 
		 {
			throw new IllegalArgumentException ("Fatal Error");
		 }
	 
	 	denominator = denom;
	}
	 

	 public void setNumerator(int num) 
		{

	 		numerator = num;
	 	}

	 public String toString() 
		{ 
	  
		 assert (getNumerator()==0):"Numerator is zero, the fraction would be zero";

		 return getNumerator() + "/" + getDenominator();
		}

}

