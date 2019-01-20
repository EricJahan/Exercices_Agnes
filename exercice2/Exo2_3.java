package exercice2;

/**
 * Écrire une fonction permettant de calculer le factoriel d’un entier saisi au clavier.
 * Sachant que :
 * N ! = N * (N – 1) !
 * 1! = 0! = 1
 */

import java.util.Scanner;

class Exo2_3 {

	public static int laposte(int n) {
		int entUs = n;
		float outCal = 1;
		
		for (int i = 1; i <= entUs; i++) {
			outCal *= i;
			//System.err.println(outCal + "x" + i);
			System.out.println(outCal);
		}
		return n;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Veuillez entrer un nombre");
		int entUs = sc.nextInt();
		
		laposte(entUs);
		sc.close();
	}
}
