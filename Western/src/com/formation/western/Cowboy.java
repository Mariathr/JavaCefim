package com.formation.western;

public class Cowboy extends Humain implements VisagePale{
    private int popularite;
    private String adjectif;


    public Cowboy(String nomHumain) {
        super(nomHumain,"whisky");
        this.popularite = 0;
        this.adjectif = "vaillant";
    }

    public void tirerBrigand(HorsLaLoi brigand){
        parler("Le "+ this.adjectif + " "+ this.quelEstTonNom()  + "tire sur" + brigand.quelEstTonNom() + ". PAN !");
        parler("Prend ça, rascal !");
    }
    public void libererDame(Dame dame){
        popularite ++;
        dame.libre();
        parler("Jolie dame tu es libérée");
    }
    @Override
    public void presentation() {
        String presentation;
        super.presentation();
        parler("Je suis  Cowboy " + this.adjectif + " et ma  popularité est " + this.popularite);
    }

    @Override
    public void scalp() {
        parler("Aïe ma tête !.");
    }
}
