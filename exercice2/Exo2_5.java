package exercice2;

import java.util.Scanner;

class Exo2_5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int tab[] = {0,0,0,0,0};
		int somme=0;
		for (int i=0; i<tab.length; i++) {
				System.out.println("Entrez une valeur pour tab["+i+"]");
				int entUs = sc.nextInt();
				tab[i] = entUs;
		}
		for (int i=0; i<tab.length; i++) {
			somme += tab[i];
			System.out.println(somme);
		}
		sc.close();
	}

}
