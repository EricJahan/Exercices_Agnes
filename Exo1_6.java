package Exo1_6;

import java.util.Scanner;
import java.util.Timer;

//1. Créer une variable nombre aléatoire entre 0 et 1000
//2. Créer une indication a l'utilisateur qu'il doit entrer un nombre entre 0 et 1000
//3. Créer une variable saisie utilisateur 
//4. Créer une condition de limite sur la saisie entre 0 et 1000
//5. Créer une condition pour comparer la saisie avec le nombre généré
//6. Créer une boucle pour relancer le programme si le nombre n'est pas trouvé
//7. Créer un compteur pour le nombre d'essaies effectués
//8. Créer un booleen pour sortir de la boucle si la proposition correspond au nombre généré aléatoirement
//9. Afficher le compteur quand le nombre est trouvé


class Exo1_6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int nb = (int) (Math.random() *1001);
		int count = 0;

		boolean verif = true;

		while (verif) {

			System.out.println("Veuillez entrer un nombre entre 0 et 1000");
			//System.out.println(nb); //Affichage du nombre généré

			int saisie = sc.nextInt();

			if (saisie >= 0 && saisie <= 1000) {
				if (saisie > nb) {
					System.out.println("C'est moins !");
				}
				else if (saisie < nb) {
					System.out.println("c'est plus !");
				}
				else {
					System.out.println("Bravo ! Le nombre était bien " + nb);
					verif = false;
				}
			}
			count++;
		}
		System.out.println("Vous avez trouvé en " + count + " essais");
		sc.close();
	}
}
