package exercice2;

import java.util.Scanner;

class Exo2_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un mot");
		
		String entUs = sc.nextLine();
		entUs = entUs.toLowerCase();
		
		int tabComp[] = new int[6];
		char voyelles[] = {'a','e','i','o','u','y'};
		
		for (int i = 0; i < entUs.length(); i++) {
			for (int j = 0; j < 6; j++) {
				if (entUs.charAt(i) == voyelles[j]) {
					tabComp[j]++;
				}
			}
		}
		for (int i = 0; i < tabComp.length; i++) {
			System.out.println("Lettre [" + voyelles[i] + "] présente dans votre mot : " + tabComp[i] + " fois." );
		}
		sc.close();
	}
}
