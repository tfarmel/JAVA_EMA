package com.tfarmel.basesAlgo1;

public class Regression {
	
	private double a;
	private double b;
	
	private double x;
	private double y;

	public static void main(String[] args) {

	}
	
	public void ajouter(double dx, double dy){
		x = x + dx;
		y = y + dy;
	}
	
	public void calcCoef(){
		
	}
	
	public void calcY(double x){
		System.out.println("y = " + (a*x + b));
	}
	
	public void calcX(double y){
		System.out.println("x = " + (y-b)/a);
	}

}
