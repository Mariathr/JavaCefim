package com.formation.example;

public class Aventurier {
    //Atrributs
    private String non;
    private String attaque;
    private int pointsVie;

    //Methods
    public Aventurier(){

    }
    public  Aventurier(String nomAventurier1, int pointsVie1){
        this.non = nomAventurier1;
        this.pointsVie = pointsVie1;
    }
    public void avancer(){ System.out.println("avancer"); }
    public void  attaquer(){ System.out.println("attaquer"); }
    public void setPresenter(){
        System.out.println("Hello" + this.non + "! J'ai " + this.pointsVie );
    }
}
