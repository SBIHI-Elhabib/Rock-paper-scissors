package chifoumi;

public class JeuUnTour {
    Joueur j1;
    Joueur j2;


    public JeuUnTour(String nom1, String nom2){
        this.j1 = new Joueur(nom1);
        this.j2 = new Joueur(nom2);

        jouer();

    }
    public void jouer(){
        tour();
        j1.ecrireScore();
        j2.ecrireScore();
        conclure();
    }

    public void tour(){
        Choix c1= j1.choisir();
        Choix c2= j2.choisir();
        if (c1== Choix.CAILLOU && c2==Choix.CISEAUX) {
            j1.crediter();
        }
        if (c1== Choix.CAILLOU && c2==Choix.PAPIER) {
            j2.crediter();
        }
        if (c1== Choix.CISEAUX && c2==Choix.PAPIER) {
            j2.crediter();
        }
        if (c1== Choix.CISEAUX && c2==Choix.CAILLOU) {
            j1.crediter();
        }
        if (c1== Choix.PAPIER && c2==Choix.CAILLOU) {
            j1.crediter();
        }
        if (c1== Choix.PAPIER && c2==Choix.CISEAUX) {
            j2.crediter();
        }

    }

    public void conclure(){

        while (j1.getScore()<3 && j2.getScore()<3) {
            tour();
            System.out.println(j1.ecrireScore()); 
            System.out.println(j2.ecrireScore());
        }
        if(j1.getScore()==j2.getScore()){
            System.out.println(j1.getNom() + "  et " + j2.getNom() +
					" ont fait une partie nulle");
        }
        if(j1.getScore()>j2.getScore()){
            System.out.println( j1.getNom() +" wins");
        }
        else System.out.println( j2.getNom() +" wins");
    }
}
