package com.tfarmel.basesAlgo1;

import com.tfarmel.outils.EntreSortie;

/**
 * permet de faire differentes conversions à l'aide de méthodes différentes
 * @author armel
 *
 */
public class Conversion {
	
	/**
	 * methode principale
	 * @param args
	 */
	public static void main(String[] args){		
		EntreSortie es = new EntreSortie();
		System.out.print("Veuillez saisir une température en °C : ");
		temperatureCF(es.lireDouble());
		System.out.print("Veuillez saisir une température en °F : ");
		temperatureFC(es.lireDouble());		
	}
	
	/**
	 * Convertit le dégrée celsius en Fahrenheit
	 * @param celsius
	 */
	public static void temperatureCF(double celsius){
		double fahrenheit;
		fahrenheit = 1.8 * celsius + 32;
		System.out.println("La température " + celsius + " °C est égale à "+ fahrenheit + " °F");
	}
	
	/**
	 * Convertit le Fahrenheit en celsius
	 * @param fahrenheit
	 */
	public static void temperatureFC(double fahrenheit){
		double celsius;
		celsius = (5 * (fahrenheit - 32)) / 9;
		System.out.println("La température " + fahrenheit + " °F est égale à "+ celsius + " °C");
	}
	
	/**
	 * Convertit un temps t (en seconde) en heures, minutes et secondes
	 */
	public void versHMS(){
		
	}
	
	/**
	 * Convertit des heures, minutes et secondes (3 parametres) en un temps en secondes
	 */
	public void versSec(){
		
	}

}
