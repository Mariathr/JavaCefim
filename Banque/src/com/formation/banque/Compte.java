package com.formation.banque;

public class Compte {
    //Attributs
    private int nroCompte;
    private float solde;

    //Constructeurs
    public Compte(){

    }
    public Compte(int nroCompte){
        this.nroCompte = nroCompte;
        this.solde = 0;
    }
    public Compte(int nroCompte,float solde){
        this.nroCompte = nroCompte;
        this.solde = solde;
    }
    //Methodes
    /* pour faire un dépot sur le compte. */
    public void depot(float valeur){
        this.solde = this.solde + valeur;
    }
    /* pour faire un retrait sur le compte. */
    public void retrait(float valeur){
        this.solde = this.solde - valeur;
    }
//Getters & Setter
/* pour obtenir la valeur du solde */
public float getSolde(){
    return this.solde;
}
public int getNroCompte(){
    return this.nroCompte;
}
}
