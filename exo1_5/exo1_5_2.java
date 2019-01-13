package exo1_5;

class exo1_5_2 {

	public static void main(String[] args) {

		int count = 1;
		boolean check = true;
		while (check) {

			int nb1 = (int)Math.floor(Math.random()*1001);
			int nb2 = (int)Math.floor(Math.random()*1001);
			int nb3 = (int)Math.floor(Math.random()*1001);
			System.out.println(nb1 + " " + nb2 + " " + nb3);
			if (nb1%2 == 0 && nb2%2 == 0 && nb3%2 == 1) {
				System.out.println("Nous avons ici deux nombres pairs suivis d'un nombre impair : \n" + nb1 + " " + nb2 + " " + nb3);
				check = false;
			}
			count++;
		}
		
		System.out.println("Nous avons trouvé cette combinaison en " + count + " essai(s)");
	}
}
