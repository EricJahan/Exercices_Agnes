package exo1_3;

class Exo1_3 {

	public static void main(String[] args) {

		int tab1[][] = {{2,4,5},{3, 33, 32}};
		int tab2[][] = {{3},{3,4,5},{3,5},{3,1,0}};

		for(int i = 0; i<tab1.length; i++) {

			for(int j = 0; j<tab1[i].length; j++) {
				System.out.print(tab1[i][j] + " ");
			}
			System.out.println("");
		}

		for(int o = 0; o<tab2.length; o++) {

			for(int p = 0; p<tab2[o].length; p++) {
				System.out.print(tab2[o][p]+ " ");
			}
			System.out.println("");
		}
	}
}
