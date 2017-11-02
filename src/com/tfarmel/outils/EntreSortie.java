package com.tfarmel.outils;

import java.util.Scanner;

public class EntreSortie {
	
	
	public int lireInt(){
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();		
	}
	
	public double lireDouble(){
		Scanner sc = new Scanner(System.in);
		return sc.nextDouble();
	}
	
	public float lireFloat(){
		Scanner sc = new Scanner(System.in);
		return sc.nextFloat();
	}
	
	public String lireString(){
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
}
