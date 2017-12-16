package com.tfarmel.basesAlgo2;

import java.util.Scanner;

public class Factorielle {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Factorielle");
		System.out.print("\t n = ");
		int nb = sc.nextInt();
		System.out.println("Le factorielle de " + nb + " est " + facto(nb));
	}
	
	public static int facto(int n) {
		if(n <= 1) {
			return 1;
		} else {
			return n*facto(n-1);
		}
	}

}
