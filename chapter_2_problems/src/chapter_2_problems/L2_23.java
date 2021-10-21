package chapter_2_problems;
import java.text.*;
import java.util.Date;

public class L2_23 {

	public static void main(String[] args) {
		
		Date today = new Date();
		
		SimpleDateFormat simpleDF1 = new SimpleDateFormat("hh" + ":" + "mm" + ":" + "ss a");
		
		System.out.println(simpleDF1.format(today));


	}

}
