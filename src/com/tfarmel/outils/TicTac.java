package com.tfarmel.outils;

public class TicTac {

	public static void main(String[] args) {
		for ( int i = 1; i <= 100; i++){
			if((i % 3 == 0) && (i % 5 == 0)){
				System.out.println("TicTac");
			}else if(i % 3 == 0){
				// multiples de 5
				System.out.println("Tic");
			}else if((i % 5 == 0)){
				
				System.out.println("Tac");
			}else{
				System.out.println(i);
			}
		}

	}

}
