package chapter_8_problems;

public class EmptyInputException extends Exception
{
 
String str;

EmptyInputException(String s)
{
 
str =s;

 System.out.println( "Caught Exception" );
}

public String toString()
{
 
return (str);
}
}
