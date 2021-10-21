package myutil2;
import myutil.MealCard;

public class TestMeal {

	public static void main(String[] args) {
		
		MealCard obj1 = new MealCard(100);
		MealCard obj2 = new MealCard(40);
		
		obj1.addPoint(50);
		obj1.buyMeal(100);
		System.out.println(obj1.showCurrentBalance());
		
		
		obj2.addPoint(50);
		obj2.buyMeal(100);
		System.out.println(obj2.showCurrentBalance());
		



	}

}
