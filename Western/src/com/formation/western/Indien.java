package com.formation.western;

import java.security.PrivateKey;

public class Indien extends Humain{
    private String nombrePlumes;
    private String totem;
    private String phrases;
    public Indien(String nomHumain) {
        super(nomHumain,"jus de racine");
        this.phrases = "Ugh !";
    }
    public void scalperVisage(VisagePale visagePale){
        nombrePlumes = nombrePlumes + 1;
        visagePale.scalp();
    }
}
