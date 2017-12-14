package com.tfarmel.coursechevaux;

public class Cheval {
	
	private String nom;
	private int dorssard;
	private int temps;

	public static void main(String[] args) {
		
		

	}
	// Temps de parcours
	public void tempsParcours() {
		
	}
	
	public void afficher() {
		
	}

	public Cheval(String nom, int dorssard) {
		super();
		this.nom = nom;
		this.dorssard = dorssard;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getDorssard() {
		return dorssard;
	}

	public void setDorssard(int dorssard) {
		this.dorssard = dorssard;
	}

	public int getTemps() {
		return temps;
	}

	public void setTemps(int temps) {
		this.temps = temps;
	}

}
