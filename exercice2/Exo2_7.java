package exercice2;

import java.util.Scanner;

/**
 * Écrire un programme qui crée un tableau comportant les valeurs des carrés des n 
 * premiers nombres impairs, la valeur de n étant lue au clavier et qui en affiche les valeurs
 * @author eric
 *
 */
class Exo2_7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int entUs = sc.nextInt();
		int tab[] = new int[entUs];

		for (int i=0; i<=entUs;i = 2*i+1) {
			//i = (2*i+1);
			tab[i] = i*i;
			
			System.out.println(i);
		}
		sc.close();
	}
}
