package exercice2;

import java.util.Scanner;

class Exo2_4 {

	public static int fibo(int n) {

		int f1=0, f2=1;
		int f3 = (f1+f2);

		for (int i = 0 ; i < n; i++) {		
			f3 = f2;
			f2 = f1;
			f1 = (f3+f2);

			System.out.println(f1);
		}
		return f1;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Veuillez entrer une nombre pour avoir "
				+ "la valeur correspondante à sa position dans la suite de fibonacci.");
		
		int entUs = sc.nextInt();
		
		System.out.println("En position " + entUs + " se trouve le nombre : " + fibo(entUs));	
		
		sc.close();
	}
}
