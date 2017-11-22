package com.tfarmel.PlacementEmprunt;

public class Placement {
	
	private double t;
	private double c;
	private double f;
	private int a; // Année
	private double n;
		
	public void init() {
		this.t = 0;
		this.c = 0;
		this.f = 0;
		this.a = 0;
		this.n = 0;
	}

	public double getT() {
		return t;
	}

	public void setT(double t) {
		this.t = t;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public double getF() {
		return f;
	}

	public void setF(double f) {
		this.f = f;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public double getN() {
		return n;
	}

	public void setN(double n) {
		this.n = n;
	}

}
