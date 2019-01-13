package exo1_3;

class exo1_3_2 {
	public static void lecturetab(int tab[][]) {
		
		for(int i = 0; i<tab.length; i++) {

			for(int j = 0; j<tab[i].length; j++) {
				System.out.print(tab[i][j] + " ");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		
		int tab1[][] = {{2,4,5},{3, 33, 32}};
		lecturetab(tab1);
		int tab2[][] = {{3},{3,4,5},{3,5},{3,1,0}};
		lecturetab(tab2);
	}
}
