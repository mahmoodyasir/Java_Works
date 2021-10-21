package chapter_2_problems;
import java.util.*;

import javax.swing.JFrame;

import java.text.*;

public class L2_22 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter window Width: ");
		int width = scan.nextInt();
		
		System.out.println("Enter window Height: ");
		int height = scan.nextInt();
		
		System.out.println("Enter window Title: ");
		Scanner input = new Scanner(System.in).useDelimiter("\n");
		String title = input.next();
		
		scan.close();
		System.out.println(title);
		
		JFrame myWindow;

		myWindow = new JFrame();

		myWindow.setSize(width, height);

		myWindow.setTitle(title);

		myWindow.setVisible(true);
		
	}

}
