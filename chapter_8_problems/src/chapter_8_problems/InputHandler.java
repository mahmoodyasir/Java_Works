package chapter_8_problems;

import java.util.*;
class InputHandler {
	private static final String BLANK = ""
	;
	private String name;
	private String room;
	private String pwd;
	private Scanner scanner;
	public InputHandler(){
	name = BLANK;
	room = BLANK;
	pwd  = BLANK;
	scanner =
	new Scanner(System.in);
}
	public void getInput()
	{
	
		System.out.print("Enter Name:");

		try
		{
		 
		name = scanner.next();

		if(name==BLANK)
		{
		  
		throw new EmptyInputException("Blank String");
		}
		} 

		catch (EmptyInputException e) 
		{
		 
		 System.out.println(e);
		}

		System.out.print("Enter Room No.:");

		try
		{
		 
		room = scanner.next();

		if(room==BLANK)
		{
		 
		throw new EmptyInputException("Blank String");
		}
		} 

		catch (EmptyInputException e)
		{
		 
		System.out.println(e);
		}

		System.out.print("Enter Password:");

		try
		{
		 
		pwd = scanner.next();

		if(pwd==BLANK)
		{
		 
		throw new EmptyInputException("Blank String");
		}
		} 

		catch (EmptyInputException e) 
		{ 
		 
		System.out.println(e);
		}

	}
	
		public String getName(){
			return name;
		}
		public String getRoom(){
			return room;
		}
		public String getPassword(){
			return pwd;
		}
}


