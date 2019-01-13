package exo1;

import java.util.Scanner;

class Exo1_1 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		
	try {
		System.out.println("Veuillez entrer un chiffre :");
		int ent1 = sc.nextInt();
		System.out.println("Veuillez entrer un second chiffre");
		int ent2 = sc.nextInt();	
		System.out.println("Le résultat de " + ent1 + " + " + ent2 + " est : " + (ent1+ent2));
		}
	
	catch (Exception e) {
			System.err.println("Erreurr de saisie");
		}
	sc.close();

	}

}
