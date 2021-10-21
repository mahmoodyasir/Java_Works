package chp_8_10;

import java.util.InputMismatchException;
import java.util.Scanner;

class Loan
{
 
	private final int MONTHS_IN_YEAR = 12;

	private double loanAmount;

	private double monthlyInterestRate;

	private int numberOfPayments;

	private double monthlyPayment;

	public double getTotalPayment;

	public Loan(double amount, double rate, int period)
	{
	 
	setAmount(amount);
	setRate (rate );
	setPeriod(period);
	}

	public double getAmount()
	{
		return loanAmount;
	}

	public int getPeriod()
	{
		return numberOfPayments / MONTHS_IN_YEAR;
	}

	public double getRate()
	{
		return monthlyInterestRate * 100.0 * MONTHS_IN_YEAR;
	}

	public void setAmount(double amount)
	{
		assert amount == 0:"Zero amount loan is invalid";
		loanAmount = amount;
	}

	public void setRate(double annualRate)
	{
		assert annualRate == 0:"Zero annual rate is invalid";
		monthlyInterestRate = annualRate/100.0/MONTHS_IN_YEAR;
	}



	public void setPeriod(int periodInYears)
	{
		assert periodInYears == 0:"Zero number of years is invalid.";
		numberOfPayments = periodInYears * MONTHS_IN_YEAR;
	}

	public double getMonthlyPayment()
	 {

		 double monthlyPayment;
		monthlyPayment = (loanAmount * monthlyInterestRate)
		 / (1 - Math.pow(1/(1 + monthlyInterestRate),
		 numberOfPayments ) );
		 return monthlyPayment;
	 }

	public double getTotalPayment( )
	 {

		 double totalPayment;
		 totalPayment = getMonthlyPayment( ) * numberOfPayments;
		 return totalPayment;
	 }

}
