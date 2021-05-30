package com.formation.western;

public class Brigand extends Humain implements HorsLaLoi,VisagePale {
    private String look;
    private int nbCaptures;
    private int recompenseOfferte;
    private boolean isPrisonnier;


    public Brigand(String nomHumain) {
        super(nomHumain,"tord-boyaux");
        this.look ="méchant";
        nbCaptures = 0;
        recompenseOfferte =100;
        isPrisonnier = false;
    }

    @Override
    public void seFaireEmprisonne(Cowboy cowboy) {
        this.isPrisonnier=true;
        parler("Damned, je suis fait ! ("+cowboy.quelEstTonNom() +"), tu m’as eu !");
    }

    @Override
    public void kidnappe(Dame dame) {
        dame.etreKidnapper();;
        this.nbCaptures = nbCaptures ++;
        parler("Ah ah ! "+ dame.quelEstTonNom() +", tu es mienne désormais !");
    }

    @Override
    public int getMiseAPrix() {
        return recompenseOfferte;
    }

    @Override
    public String quelEstTonNom() {
        return super.quelEstTonNom() + " le " + this.look;
    }

    @Override
    public void presentation() {
        String presentation;
          super.presentation();
          parler("J’ai l’air "+ this.look +" et j’ai déjà kidnappé" + this.nbCaptures + "dames !");
          parler("Ma tête est mise à prix " + this.recompenseOfferte + "$ !");
    }

    @Override
    public void scalp() {
        parler("Brigand Aïe ma tête !.");
    }
}
