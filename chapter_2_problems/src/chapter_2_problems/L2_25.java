package chapter_2_problems;
import javax.swing.*;
import java.util.Scanner;

public class L2_25 {

	public static void main(String[] args) {
		
		JFrame myWindow;

		myWindow = new JFrame( );

		myWindow.setSize(300, 200);

		myWindow.setTitle("My First Frame");
		
		
		myWindow.setVisible(true);
		try {Thread.sleep(500);} catch(Exception e) {}
		myWindow.setVisible(false);
		try {Thread.sleep(500);} catch(Exception e) {}
		myWindow.setVisible(true);

	}

}
