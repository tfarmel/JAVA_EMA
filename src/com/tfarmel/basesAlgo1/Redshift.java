package com.tfarmel.basesAlgo1;

public class Redshift {
	
	private final static double C = 299792.458;  // Vitesse de la lumière
	private final static double H = 71;

	public static void main(String[] args) {
		interpreter(6.4);
	}
	
	public static void interpreter(double z){
		double v; // vitesse de fuite apparente de la galaxie.
		double d; // distance apparente
		v = ((Math.pow(z+1, 2) - 1) / (Math.pow(z+1, 2) + 1)) * C; 
		d = v * Math.pow(10, 6) * 3.26 / H;
		System.out.println("Pour z = "+ z + " on a : \n\t v = " + v + " km/s \n\t d = " + d + " années-lumière");
	}

}
