package myutil;

public class MealCard {
	
int numberOfPoints;
	
	public MealCard() {
		this.numberOfPoints = 100;
	}
	
	public MealCard(int numberOfPoints) {
		this.numberOfPoints = numberOfPoints;
	}
	
	public void addPoint(int points) {
		this.numberOfPoints += points;
	}
	
	public void reducePoint(int points) {
		this.numberOfPoints -= points;
	}
	
	public void buyMeal(int price) {
		if(this.numberOfPoints < price) {
			System.out.println("Not availavle balance!");
		}
		else {
			this.reducePoint(price);
		}
		
	}
	
	public String showCurrentBalance() {
		return "Current Balance is: " + this.numberOfPoints;
	}


}
