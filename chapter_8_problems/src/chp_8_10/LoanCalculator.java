package chp_8_10;
import java.util.*;
class LoanCalculator
{

private Loan loan;

public LoanCalculator()
{
 loan = new Loan(0, 0, 0);
}

public void start()
{

 describeProgram();
 getInput();
 displayOutput();
}

private void describeProgram()
{
 
System.out.println ("This program computes the monthly and total");

System.out.println ("payments for a given loan amount, annual ");
 

System.out.println ("interest rate, and loan period (# of years).");

 System.out.println ("\n");
}


private void displayOutput()
{
	System.out.println("Loan Amount:$" + loan.getAmount());

	System.out.println("Annual Interest Rate:" + loan.getRate() + "%");

	System.out.println("Loan Period(years):" + loan.getPeriod());

	System.out.println("Monthly payment is $" + loan.getMonthlyPayment());

	System.out.println("TOTAL Payment is $" + loan.getTotalPayment());
}

private void getInput()
{
	double loanAmount = 0, annualInterestRate = 0;
	int loanPeriod = 0;
	Scanner scanner = new Scanner(System.in);
	System.out.print("Loan Amount (Dollars + Cents):");

	try
	{
		loanAmount = scanner.nextDouble();

		 if (loanPeriod < 0)
			{
				throw new Exception("Negative loan Period is invalid");
			}
}


catch(InputMismatchException e)
	{
		scanner.next();
	 
		System.out.println("Invalid Entry. Please enter digits only.");
	}

catch (Exception e)
{
 System.out.println("Error:"+e.getMessage());
 }


finally
 {
 
 System.out.println("DONE");
 }

 System.out.print("Annual Interest Rate (e.g .. 905)");
 try
 {
 	if (annualInterestRate < 0) 
 	{
 		throw new Exception("Negative annual Interest Rate is invalid");
 	}
 }
 catch(InputMismatchException e)
 {
 	scanner.next();
 	System.out.println("Invalid Entry. Please enter digits only");
 }

 catch(Exception e)
 {
 	System.out.println("Error:"+e.getMessage());
 }

 finally
 {
 	System.out.println("DONE");
 }

 System.out.print("Loan Period-# of years:");

 try
 {
 	loanPeriod = scanner.nextInt();
 	if (loanPeriod < 0) 
 	{
 		throw new Exception("Negative loan period is invalid");
 	}
 }

 catch(InputMismatchException e)
 {
 	scanner.next();
 	System.out.println("Invalid entry. Please enter digits only.");
 }

 catch(Exception e)
 {
 	System.out.println("Error:" + e.getMessage());
 }

 finally
 {
 	System.out.println("DONE");
 }

loan=new Loan(loanAmount, annualInterestRate,loanPeriod);

System.out.println("Loan Amount: $" + loan.getAmount());

System.out.println("Annual Interest Rate:" + loan.getRate() + "%");

System.out.println("Loan Period (years):" + loan.getPeriod());

}
}




