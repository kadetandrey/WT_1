package main.kadetov.classes.basket;

import java.util.ArrayList;
import java.util.List;

public class Basketbool {

	private ArrayList<Ball> ballList;
	private double basketWeight;
	
	public Basketbool() {
		this.ballList = new ArrayList<Ball>();
	}
	
	public Basketbool(List<Ball> ballList) {
		this.ballList = new ArrayList<Ball>(ballList);
	}
	
	public ArrayList<Ball> getBallList() {
		return this.ballList;
	}
	
	public double getBasketWeight() {
		this.basketWeight = ballList.stream().mapToDouble(ball -> ball.getWeight()).sum();
		return this.basketWeight;
	}
	
	public void addBall(Ball ball) {
		this.ballList.add(ball);
	}
}