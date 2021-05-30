package com.formation.western;

public class Dame extends Humain implements VisagePale {
    private String couleurRobe;
    private boolean isCaptive;

    public Dame(String nomHumain) {
        super(nomHumain,"lait");
    }

    public void etreKidnapper(){
        this.isCaptive =true;
        parler( "Aide, j'ai été capturé");
    }
    public void libre(){
        this.isCaptive =false;
        parler("Merci beaucoup, Je suis liberé " );
    }
    public void changerRobe(String Couleur){
        this.couleurRobe=Couleur;
        parler("Regardez ma nouvelle robe "+ this.couleurRobe+" !");
    }

    @Override
    public String quelEstTonNom() {
        return "Miss " + super.quelEstTonNom();
    }

    @Override
    public void scalp() {
        parler("Aïe ma tête !. Je suis une Dame");
    }
}
