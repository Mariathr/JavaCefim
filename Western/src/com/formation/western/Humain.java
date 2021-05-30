package com.formation.western;

public class Humain {


    private String nom;
    private String boisson;

    public Humain(String nom, String boisson) {
        this.nom = nom;
        this.boisson = boisson;
    }

    public Humain(String nomHumain){
        this.boisson = "l'eau";
        this.nom = nomHumain;
    }
    public void parler(String texte){
        System.out.println("( " +  this.nom + ") - " + texte);
    }
    public void presentation(){
        parler("Bonjour, je suis " + this.quelEstTonNom() +  " j’aime le  " + this.boisson);

    }
    public void boire(){
        parler(" Ah ! un bon verre de " + this.boisson +" ! GLOUPS ! ");
    }

    public String quelEstTonNom(){
        return this.nom;
    }
    public String quelleEstTaBoisson(){
        return this.boisson;
    }

}
