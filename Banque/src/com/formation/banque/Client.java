package com.formation.banque;
import java.util.List;
public class Client {
    //Attributs
    private int idClient;
    private String nom;
    private int compteTotal;
    private Compte [] ltcomptes=new Compte[100];

    //Constructeurs
    public Client() {

    }

    public  Client(int idClient, String nomClient) {
        this.idClient = idClient;
        this.nom= nomClient;
    }

    //Methodes


    public void ajouterCompte(){
        calculerNoCompte();
        Compte compte = new Compte(this.compteTotal);
        ltcomptes[this.compteTotal - 1] =compte;
    }
    public void ajouterCompteSolde(float solde){
        calculerNoCompte();
        Compte compte = new Compte(this.compteTotal,solde);
        ltcomptes[this.compteTotal - 1] =compte;
    }
    public float afficherSolde(int nroCompte){
       return ltcomptes[nroCompte].getSolde();
    }

    public void compteRetrait(int nroCompte, float nontant){
        ltcomptes[nroCompte].retrait(nontant);
    }
    public void compteDepot(int nroCompte, float nontant){
        ltcomptes[nroCompte].depot(nontant);
    }
    private void calculerNoCompte() {
        this.compteTotal = this.compteTotal + 1;
    }

    /*Cette m ́ethode aura donc deux arguments: la somme a` d ́eplacer, et le compte destinataire:*/
    public void virer(int nroCompte, int destinataire, float valeur){
        ltcomptes[nroCompte].retrait(valeur);
        ltcomptes[destinataire].depot(valeur);

    }
    public float afficherSoldeAll(){
        float tsolde = 0;
        for (int val= 0 ; val < this.compteTotal; val++){
            tsolde=  tsolde + this.ltcomptes[val].getSolde();
        }
        return tsolde;
    }

//Getters & Setter
    /**
     * qui renvoie le nom du client
     * @return
     */
    public String getNom(){
        return this.nom;
    }
    public int getCompteTotal() {
        return this.compteTotal;
    }
    public int getIdClient() {
        return this.idClient;
    }
    public Compte[] getLtcomptes() {
        return ltcomptes;
    }
/*public int getIdClient() {
    return idClient;
}

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getnCompote() {
        return nCompote;
    }

    public void setnCompote(int nCompote) {
        this.nCompote = nCompote;
    }

    public Compte[] getLtcomptes() {
        return ltcomptes;
    }

    public void setLtcomptes(Compte[] ltcomptes) {
        this.ltcomptes = ltcomptes;
    }*/
}
