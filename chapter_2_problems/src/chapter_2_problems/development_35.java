package chapter_2_problems;
import java.util.Scanner;

public class development_35 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first name: ");
		String f_name = scanner.next();
		
		System.out.println("Enter middle name: ");
		String temp = scanner.next();
		
		System.out.println("Enter last name: ");
		String l_name = scanner.next();
		
		char m_name = temp.charAt(0);
		
		String name = l_name + ", " + f_name + " " + m_name + ".";
		
		System.out.println(name);

	}

}
