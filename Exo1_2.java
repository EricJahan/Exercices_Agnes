package exo1_2;

import java.util.Scanner;

class Exo1_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Veuillez entrer votre nom");
		String lastName = sc.nextLine();

		System.out.println("veuillez entrer vore prénom");
		String name = sc.nextLine();

		lastName = lastName.toUpperCase();
		name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
		System.out.println(lastName + " " + name);
		
		/*System.out.println(lastName.toUpperCase() + " " + name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase());
		sc.close();*/
		sc.close();
	}
}
