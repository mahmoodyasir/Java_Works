package chapter_2_problems;
import javax.swing.*;
import java.util.Scanner;

public class L1_18 {

	public static void main(String[] args) {
		
		Scanner scanner;
		scanner = new Scanner(System.in);
		System.out.println("Enter your first name: ");
		String firstname = scanner.next();
		System.out.println("Enter your last name: ");
		String lastname = scanner.next();
		String name = lastname + ", " + firstname;
		
		JFrame myWindow;

		myWindow = new JFrame( );

		myWindow.setSize(500, 300);

		myWindow.setTitle(name);

		myWindow.setVisible(true);
		

	}

}
