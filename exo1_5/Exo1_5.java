package exo1_5;

class Exo1_5 {

	public static void main(String[] args) {

		int i = 0;
		boolean verif = true;
		while (verif) {

			int nb1 = (int)Math.floor(Math.random()*1001);
			int nb2 = (int)Math.floor(Math.random()*1001);
			int nb3 = (int)Math.floor(Math.random()*1001);

			System.out.println(nb1+ " " + nb2 + " " + nb3);
			System.out.println(" // ");

			String nb1S = String.valueOf(nb1);
			String nb2S = String.valueOf(nb2);
			String nb3S = String.valueOf(nb3);

			//System.out.println(nb1S+ "\n" + nb2S + "\n" + nb3S);
			//System.out.println(nb1S.substring(nb1S.length()-1));

			boolean check1;
			boolean check2;
			boolean check3;

			switch (nb1S.substring(nb1S.length()-1)) 
			{
			case "0": case "2": case "4": case "6": case "8": check1 = true;
			break;
			default: check1 = false;
			}

			switch (nb2S.substring(nb2S.length()-1)) 
			{
			case "0": case "2": case "4": case "6": case "8": check2 = true;
			break;
			default: check2 = false;
			}

			switch (nb3S.substring(nb3S.length()-1)) 
			{
			case "0": case "2": case "4": case "6": case "8": check3 = true;
			break;
			default: check3 = false;
			}
			if (check1 == true && check2 == true && check3 == false) {
				System.out.println("En " + i + "nous avons trouvé la combinaision de deux nombres pairs suivis d'un nombre impair : \n" + nb1 + " " + nb2 + " " + nb3);
			verif = false;			
			}
			i++;
		}
		
		System.out.println("Nous avons trouvé cette combinaison en " + i + " essai(s)");
	}
}
