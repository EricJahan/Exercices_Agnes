package exercice2;

import java.util.Scanner;

class Exo2_2 {

	public static void main(String[] args) {

		/*Scanner sc = new Scanner(System.in);	//initialisation du scanner

		System.out.println("Entrez une valeur"); //question a l'utilisateur

		int n = sc.nextInt();					//entrée utilisateur
		String s = String.valueOf(n);

		for(int i=0;i<s.length();i++){			//boucle de parcour de l'entrée
			System.out.println(s.charAt(i));	// sortie transformant en charactere
		}

		 */		




		Scanner sc = new Scanner(System.in);

		System.out.println("Entrez quelque chose");

		String n = sc.nextLine();

		for (int i = 0; i < n.length(); i++) {
			System.out.println(n.charAt(i));
		}
		sc.close();								//fermeture du scanner

	}
}