package com.formation.western;

public class Barman extends Humain{
 private String nomBar;

    public Barman(String nomBarman) {
        super(nomBarman);
        this.nomBar = "Coco..";
    }
    public void  servirBoisson(Humain persone){
        String texte = "Bonjour, " + persone.quelEstTonNom() +"Je vous sers un verre " + persone.quelleEstTaBoisson();
        parler(texte);
    }

    @Override
    public void parler(String texte) {
        super.parler(texte +" dand le Bar " + this.nomBar);
    }
}
