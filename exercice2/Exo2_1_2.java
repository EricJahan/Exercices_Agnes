package exercice2;

import java.util.Scanner;

class Exo2_1_2 {

	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Veuillez entrer un mot.");
		String entUs = sc.nextLine();
		
		char ref[] = {'a','e','i','o','u','y'};
		int tabCount[] = new int[6];
		
		for (int i = 0; i < entUs.length(); i++) {
			for (int j = 0; j < ref.length; j++) {
				if (entUs.charAt(i) == ref[j]) {
					tabCount[j]++;
				}
			}
		}
		System.out.println("Dans votre mot, il y a :");
		for (int i = 0; i < tabCount.length; i++) {
			System.out.println(tabCount[i] + " x la lettre [" + ref[i]+ "]");
		}
		sc.close();
	}
}
