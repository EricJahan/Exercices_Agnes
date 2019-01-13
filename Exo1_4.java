package exo1_4;

class Exo1_4 {

	public static void main(String[] args) {

		String tab[] = new String[10];
		int countGmail = 0, countOrange = 0, countHotmail = 0, countSfr = 0;

		tab[0] = "aquaman@gmail.com";
		tab[1] = "alfred@orange.fr";
		tab[2] = "batman@hotmail.fr";
		tab[3] = "robin@sfr.fr";
		tab[4] = "superman@gmail.com";
		tab[5] = "wonderwoman@sfr.fr";
		tab[6] = "greenlantern@orange.fr";
		tab[7] = "spiderman@gmail.com";
		tab[8] = "antman@orange.fr";
		tab[9] = "thor@hotmail.fr";

		for (int i = 0; i < tab.length; i++)
		{
			//System.out.println(tab[i].substring(tab[i].indexOf("@")));
			switch (tab[i].substring(tab[i].indexOf("@"))) {
			case "@gmail.com": countGmail++;
			break;
			case "@orange.fr" : countOrange++;
			break;
			case "@hotmail.fr" : countHotmail++;
			break;
			case "@sfr.fr" : countSfr++;
			break;
			}
		}
		System.out.println("Il y a " + countGmail + " adresses Gmail");
		System.out.println("Il y a " + countOrange + " adresses Orange");
		System.out.println("Il y a " + countHotmail + " adresses Hotmail");
		System.out.println("Il y a " + countSfr + " adresses SFR");
	}
}
