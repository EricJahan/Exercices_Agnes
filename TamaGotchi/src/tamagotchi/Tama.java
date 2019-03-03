package tamagotchi;

/**
 * Valeurs maximales : humeur = 10, faim = 10, besoin = 10, hygiene = 10, sante
 * = 10, poids = 10
 *
 * Valeurs d'état positif : humeur = 10/10, faim = 0/10, besoin = 0/10, hygiene
 * = 10/10, santé = 10/10, poids = 5/10
 *
 * Valeurs d'état négatif : humeur = 0/10, faim = 10/10, besoin = 10/10, hygiene
 * = 0/10, santé = 0/10, poids = 0/10 && 10/10
 *
 * Valeurs par défaut : humeur = 5, faim = 1, besoin = 0, hygiene = 8, sante =
 * 5, poids = 3
 *
 * Valeurs d'alerte : humeur = 1(-), faim = 9(+), besoin = 9(+), hygiene = 1(-),
 * sante = 2(-), poids = 1(-)
 *
 * Valeurs de décès : sante = 0
 *
 * @author eric
 */
public class Tama {

    private char sexe;
    private String nom;
    private int faim = 1, besoin = 0, hygiene = 8, sante = 8, poids = 3, humeur = 5;
    private boolean life = true;
    private int suicide;

    /**
     *
     * @return
     */
    public boolean isLife() {
        return life;
    }

    public void setLife(boolean life) {
        this.life = life;
    }

    /**
     *
     * @return
     */
    public boolean faucheuse() {
        String outDial = null;
        if (sante == 0) {
            outDial = "\nR.I.P. " + nom + " est décédé(e)...";
            this.life = false;
            goSuicide();
        }
        return life;
    }

    public void goSuicide() {
        this.addSante(-100);
        this.addBesoin(-100);
        this.addHumeur(-100);
        this.addHygiene(-100);
        this.addPoids(-100);
        this.addFaim(-100);

        this.life = false;
    }

    public int getSuicide() {
        return suicide;
    }

    public void setSuicide(int suicide) {
        this.sante = 0;
        this.suicide = suicide;
    }

    /**
     * 
     * @param pNom
     * @param pSexe 
     */
    public Tama(String pNom, char pSexe) {
        nom = pNom;
        sexe = pSexe;
        System.out.println("Votre " + nom + " vient de spawn.");
    }

    public String goSport() {
        String outDial;
        outDial = "\n" + nom + " va faire du sport.";
        this.addPoids(-2);
        this.addSante(-1);
        this.addHumeur(1);
        this.addHygiene(-1);
        this.addFaim(2);
        /*try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }*/
        return outDial;
    }

    public String goToilettes() {
        String outDial;
        outDial = "\n" + nom + " va aux toilettes.";
        this.addBesoin(-10);
        this.addPoids(-1);
        this.addSante(1);
        this.addHumeur(1);
        this.addHygiene(1);
        /*try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }*/
        outDial = "\nCa soulage !";
        return outDial;
    }

    public String goMiam() {
        String outDial;
        outDial = "\n" + nom + " va manger.";
        this.addSante(1);
        this.addHumeur(1);
        this.addHygiene(-1);
        this.addBesoin(2);
        this.addPoids(2);
        this.addFaim(-7);
        /*try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }*/
        if (faim < 10) {
            outDial ="\nCa fait du bien par ou ça passe ! BLURPS ! ";
        } else {
            outDial = "\nJ'ai trop mangé !";
        }
        return outDial;
    }

    public String goSleep() {
        String outDial;
        outDial = "\n" + nom + " s'endort";
        this.addSante(2);
        this.addHumeur(2);
        this.addHygiene(-1);
        this.addBesoin(1);
        this.addFaim(2);
        /*try {
                Thread.sleep(3000);
            } catch (Exception e) {
            }*/
        outDial ="\n" + "Rien ne vaut le confort de son oreiller !!";
        return outDial;
    }

    public String goShower() {

        String outDial;
        outDial = "\nFermez les yeux, " + nom + " prend sa douche.";
        this.addSante(1);
        this.addHygiene(8);
        this.addHumeur(1);
        /*try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }*/
        outDial = "\n" + "Ca sent meilleur !";

        return outDial;
    }

    public String goGame() {

        String outDial;
        outDial = "\n" + "Un petit CS:GO ?!";
        this.addFaim(2);
        this.addSante(-1);
        this.addHumeur(2);
        this.addBesoin(1);
        /*try {
                Thread.sleep(4000);
            } catch (Exception e) {
            }*/
        outDial = "\nTous des cheateurs !";
        return outDial;
    }

    /**
     *
     * @param returnStat
     * @return
     */
    public String getStatus(String returnStat) {
        System.out.print("Stats actuelles : ");
        System.out.print("Besoin = " + getBesoin() + " // ");
        System.out.print("Faim = " + getFaim() + " // ");
        System.out.print("Humeur = " + getHumeur() + " // ");
        System.out.print("Hygiene = " + getHygiene() + " // ");
        System.out.print("Poids = " + getPoids() + " // ");
        System.out.print("Santé = " + getSante() + ".");

        return returnStat;
    }

    public String checkStatus() {

        String outDial = null;
        if (faim == 8 || faim == 9) {
            outDial = "\n Il faut nourir " + nom + "...";
        } else if (faim == 10) {
            outDial = "\n" + nom + " est en train de mourrir de faim !!";
        }

        if (besoin == 8 || besoin == 9) {
            outDial = "\n" + nom + " veut aller aux toilettes !";
        } else if (besoin == 10) {
            outDial = "\n" + "Trop tard... Pipi culotte... Donnez lui une douche !";
        }

        if (hygiene == 3 || hygiene == 2) {
            outDial = "\n" + "Il faudrait le laver...";
        } else if (hygiene == 1) {
            outDial = "\n" + "L'odeur devient intenable... Lavez " + nom + " !";
        } else if (hygiene == 0) {
            outDial = "\n" + "La tapisserie se décolle là... Lavez " + nom + " !!!!";
        }

        if (poids == 8 || poids == 9) {
            outDial = "\n" + "Faudrait se mettre au sport...";
            outDial = "\n" + nom + ": J'aime pas le sport !!!";
        } else if (poids == 10) {
            outDial = nom + ": Appelez moi bibundum !";
            outDial = "\n" + nom + " est obèse ! Mettez le au sport d'urgence";
        } else if (poids == 2 || poids == 1) {
            outDial = "\n" + "Pensez à nourrir " + nom + ", il est maigre ...";
            outDial = "\n" + nom + ": j'ai faiimmmm !!!";
        } else if (poids == 0) {
            outDial = "Il faut nourrir " + nom + "de toute urgence !!!";
            outDial = "\n" + nom + ": à l'aiideeee, j'ai faimmmmm !!!";

        }

        if (humeur == 3 || humeur == 2) {
            outDial = "\n" + nom + " est triste !";
        } else if (humeur == 1) {
            outDial = "\n" + nom + " déprime. Occupez-vous de lui ?";
        } else if (humeur == 0) {
            outDial = "\n" + nom + " est en dépréssion !! Changez lui les idées ?";
        }

        if (sante == 2 || sante == 1) {
            outDial = "\n" + "Attention !! Santé faible ! " + sante + " points de vie restants.";
        } else if (sante == 0) {
            outDial = "\n" + nom + "Agonise, se tord de douleur... Et meurt dans un dernier râle.";
        }
        return outDial;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return nom + ", sexe=" + sexe + ", humeur=" + humeur + ", faim=" + faim + ", besoin=" + besoin + ", hygiene=" + hygiene + ", sante=" + sante + ", poids=" + poids;
    }

    public char getSexe() {
        return sexe;
    }

    public void setSexe(char sexe) {
        this.sexe = sexe;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getHumeur() {
        return humeur;
    }

    public void setHumeur(int humeur) {
        if (humeur > 10) {
            this.humeur = 10;
        } else if (humeur < 0) {
            this.humeur = 0;
        } else {
            this.humeur = humeur;
        }
    }

    public void addHumeur(int ajout) {
        int pushAdd = this.humeur + ajout;
        this.setHumeur(pushAdd);
    }

    public int getFaim() {
        return faim;
    }

    public void setFaim(int faim) {
        if (faim > 10) {
            this.faim = 10;
        } else if (faim < 0) {
            this.faim = 0;
        } else {
            this.faim = faim;
        }
    }

    public void addFaim(int ajout) {
        int pushAdd = this.faim + ajout;
        this.setFaim(pushAdd);
    }

    public int getBesoin() {
        return besoin;
    }

    public void setBesoin(int besoin) {
        if (besoin > 10) {
            this.besoin = 10;
        } else if (besoin < 0) {
            this.besoin = 0;
        } else {
            this.besoin = besoin;
        }
    }

    public void addBesoin(int ajout) {
        int pushAdd = this.besoin + ajout;
        this.setBesoin(pushAdd);
    }

    public int getHygiene() {
        return hygiene;
    }

    public void setHygiene(int hygiene) {
        if (hygiene > 10) {
            this.hygiene = 10;
        } else if (hygiene < 0) {
            this.hygiene = 0;
        } else {
            this.hygiene = hygiene;
        }
    }

    public void addHygiene(int ajout) {
        int pushAdd = this.hygiene + ajout;
        this.setHygiene(pushAdd);
    }

    public int getSante() {
        return sante;
    }

    public void setSante(int sante) {
        if (sante > 10) {
            this.sante = 10;
        } else if (sante < 0) {
            this.sante = 0;
        } else {
            this.sante = sante;
        }
    }

    public void addSante(int ajout) {
        int pushAdd = this.sante + ajout;
        this.setSante(pushAdd);
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        if (poids > 10) {
            this.poids = 10;
        } else if (poids < 0) {
            this.poids = 0;
        } else {
            this.poids = poids;
        }
    }

    public void addPoids(int ajout) {
        int pushAdd = this.poids + ajout;
        this.setPoids(pushAdd);
    }
}
