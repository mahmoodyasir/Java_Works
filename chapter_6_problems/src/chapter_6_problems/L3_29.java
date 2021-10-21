package chapter_6_problems;
import java.applet.Applet;
import java.awt.Graphics;

public class L3_29 extends Applet{
	
	public void paint(Graphics g)
	{
		int i;
		for(i=70 ; i>10 ; i-=10)
		{
			g.drawRect(100+i, 100+i, 200-(2*i+50), 200-(2*i+50));
		}
	}

}
