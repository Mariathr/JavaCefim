package com.formation.western;

public class Ripoux extends Sherif implements HorsLaLoi {
    private int nbCaptures;
    private int recompenseOfferte;
    private boolean isPrisonnier;

    public Ripoux(String nomHumain) {
        super(nomHumain);
        nbCaptures = 0;
        recompenseOfferte =200;
        isPrisonnier = false;
    }

    @Override
    public void seFaireEmprisonne(Cowboy cowboy) {
        parler("Damned, je suis fait ! ("+cowboy.quelEstTonNom() +"), tu m’as eu !");
    }

    @Override
    public void kidnappe(Dame dame) {
        dame.etreKidnapper();
        parler("Ah ah ! "+ dame.quelEstTonNom() +", tu es mienne de ́sormais !");
    }

    @Override
    public int getMiseAPrix() {
        return this.recompenseOfferte;
    }

    @Override
    public String quelEstTonNom() {
        return super.quelEstTonNom();
    }
}
