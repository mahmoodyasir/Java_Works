package L1_9;
import java.util.*;

public class Circle {
	
	public double radius, area;
	
	public Circle()
	{
		radius = 0;
		area = 0;
	}
	
	public double getArea()
	{
		return area;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public double computeArea()
	{
		return (Math.PI*radius*radius);
	}
	
	public double computeCircim()
	{
		return (2*Math.PI*radius);
	}
}
