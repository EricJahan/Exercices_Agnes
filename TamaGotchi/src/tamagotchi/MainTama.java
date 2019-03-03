package tamagotchi;

import java.util.Scanner;

/**
 *
 * @author eric
 */
public class MainTama {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String usEnt = sc.nextLine();

        String usEnt2 = sc.nextLine();

        Tama monTama = new Tama(usEnt, usEnt2.charAt(0));

       

        System.out.println(monTama);

        
        while (monTama.isLife() == true) {
            System.out.println();
            System.out.println("Que voulez faire faire à " + monTama.getNom() + " ?");
            System.out.println("Indiquez une valeur numérique :");
            System.out.println("1 = Sport, 2 = Manger, 3 = Dormir, 4 = Toilettes, 5 = Douche, 6 = Jouer.");

            int interaction = sc.nextInt();

            switch (interaction) {
                case 1:
                    monTama.goSport();
                    break;
                case 2:
                    monTama.goMiam();
                    break;
                case 3:
                    monTama.goSleep();
                    break;
                case 4:
                    monTama.goToilettes();
                    break;
                case 5:
                    monTama.goShower();
                    break;
                case 6:
                    monTama.goGame();
                    break;
                case 7:
                    monTama.goSuicide();
                    break;
                    
                default: 
                    System.err.println("Mauvaise entrée.");
            }

            monTama.checkStatus();
            System.out.println();
            monTama.faucheuse();
            
            String retourStats = monTama.getStatus("");

            System.out.println(retourStats);
        }
        sc.close();
    }
}
