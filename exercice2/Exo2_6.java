package exercice2;

import java.util.Scanner;
/**
 * Écrire un programme JAVA calculant la somme des n premiers termes de la "série harmonique"
 * Améliorer le programme précédant afin de lire l'entier n, lors de l'exécution du programme.
 * 
 * @author eric
 *
 */

class Exo2_6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int entUs = sc.nextInt();
		double somme = 0;

		for (double i=1; i <= entUs; i++) {
			somme+=1/i;
			System.out.println(somme + " " + i);
		}

		System.out.println(somme);
		sc.close();
	}
}
