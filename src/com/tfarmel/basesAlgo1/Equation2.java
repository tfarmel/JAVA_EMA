package com.tfarmel.basesAlgo1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Resolution d'une équation de second dégrée : aX²+bX+c
 * @author armel
 *
 */
public class Equation2 {

	public static void main(String[] args) {
		// Constantes a, b et c
		double a, b, c;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Equation du second degrée : ax² + bx + c");
		System.out.print("\ta = ");
		a = sc.nextDouble();
		System.out.print("\tb = ");
		b = sc.nextDouble();
		System.out.print("\tc = ");
		c = sc.nextDouble();
		
		double delta = Math.pow(b, 2) - 4* a * c;
		if(delta < 0) {
			System.out.println("Pas de solution");
		} else if(delta == 0) {
			System.out.println("Solution unique");	
			DecimalFormat df = new DecimalFormat();
			df.setMaximumFractionDigits(3);
			System.out.println("\t x = " + df.format((-b/(2*a))));
		} else {
			System.out.println("Solution double");
			double x1, x2;
			DecimalFormat df = new DecimalFormat();
			df.setMaximumFractionDigits(3);
			x1 = -b - Math.sqrt(delta);
			x2 = -b + Math.sqrt(delta);
			System.out.println("x1 = "+ df.format(x1) + " et x2 = "+ df.format(x2));
		}

	}

}
