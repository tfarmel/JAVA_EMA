package com.tfarmel.basesAlgo1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Equation1 {

	public static void main(String[] args) {
		// Données d'entrée : a et b
		double a,b;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Résolution d'une équation du 1 degrée : ax + b");
		
		System.out.println("\t a = ");
		a = sc.nextDouble();
		System.out.println("\t b = ");
		b = sc.nextDouble();
		
		if(a == 0) {
			System.out.println("Pas de solution");
		}else {
			DecimalFormat df = new DecimalFormat();
			df.setMaximumFractionDigits(3);
			System.out.println(" solution : x = " + df.format((-b/a)));
		}
	}

}
