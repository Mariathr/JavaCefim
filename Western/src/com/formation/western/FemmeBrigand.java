package com.formation.western;

public class FemmeBrigand extends Dame implements HorsLaLoi {
    private int nbCaptures;
    private int recompenseOfferte;
    private boolean isPrisonnier;

    public FemmeBrigand(String nomHumain) {
        super(nomHumain);
        nbCaptures = 0;
        recompenseOfferte =150;
        isPrisonnier = false;
    }


    @Override
    public void seFaireEmprisonne(Cowboy cowboy) {
        parler("Damned, je suis fait ! ("+cowboy.quelEstTonNom() +"), tu m’as eu !");
    }

    @Override
    public void kidnappe(Dame dame) {
        dame.etreKidnapper();;
        parler("Ah ah ! "+ dame.quelEstTonNom() +", tu es mienne désormais !");
    }

    @Override
    public int getMiseAPrix() {
        return this.recompenseOfferte;
    }


}
