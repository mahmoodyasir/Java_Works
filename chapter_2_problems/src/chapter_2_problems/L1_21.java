package chapter_2_problems;
import java.text.*;
import java.util.Date;

public class L1_21 {

	public static void main(String[] args) {
		
		Date today = new Date();
		
		SimpleDateFormat simpleDF1 = new SimpleDateFormat("EEEE MMMM dd" + ", " + "yyyy");
		
		System.out.println(simpleDF1.format(today));

	}

}
