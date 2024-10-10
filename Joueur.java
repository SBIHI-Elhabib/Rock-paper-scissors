package chifoumi;

public class Joueur {
    private String nom;
    private int score=0;
    private IHMSaisie saisie ;

    public Joueur(String nom){
        this.nom=nom;
        saisie = new IHMSaisie(nom);
    }
    public String getNom() {
		return nom;
	}

    public int crediter(){
        return score++;
    }

    public Choix choisir() {
        return saisie.proposerChoix();
    }

    public int getScore() {
        return score;
    }


    public String ecrireScore(){
        return "Le score de "+nom+" est "+score;
    }
    
}
