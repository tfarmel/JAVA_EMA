package com.tfarmel.basesAlgo2;

import java.util.Scanner;

public class CarreParfait {

	public static void main(String[] args) {
		try {
			// le maximum
			int max = 0;

			// sert a lire depuis le clavier
			Scanner sc = new Scanner(System.in);

			// La lecture du maximum
			System.out.print("Donner un Maximum : \n");
			max = sc.nextInt();

			System.out.println("Voilà les nombres parfait : ");
			for (int j = 1; j <= max; j++) {
				if (estParfait(j)) {
					System.out.println(j);
				}
				;
			}

		}

		catch (Exception e) {
			System.out.println(e);
		}

	}

	public static boolean estParfait(int nombre) {
		// Somme des facteurs du nombre.
		int somme = 0;

		// Déterminer les facteurs du nombre.
		for (int i = 1; i <= nombre / 2; i++)
			if (nombre % i == 0)
				somme += i;

		return (nombre == somme);
	}

}
