package com.formation.banque;

import javax.management.openmbean.ArrayType;

public class BanqueInteractive {
    //Attributs
    private int clientTotal;
    private Client [] ltclients=new Client[100];

    //Methodes
    public void ajouterClient(String nomduclient) {
        calculerNroClient();
        Client client= new Client(this.clientTotal,nomduclient);
        //ajuter compte
        client.ajouterCompte();
        ltclients[this.clientTotal - 1]   = client;
    }
    public void ajouterCompteSolde(int idClient,float solde) {
        ltclients[idClient].ajouterCompteSolde(solde);
    }
    private void calculerNroClient() {
       this.clientTotal = this.clientTotal + 1;
    }

    public String afficherClient(int idClient){
        String nomClient = ltclients[idClient].getNom();
        return nomClient;
    }
    public int afficherCompte(int idClient){
        int nomClient = ltclients[idClient].getCompteTotal();
        return nomClient;
    }

    /**
     * qui affiche le bilan de tous les comptes d’un client
     * @param nroClient
     */
    public void afficherBilanCompte(int idClient){
        int nroCompte = ltclients[idClient].getCompteTotal();
        Compte[] ltcompte =ltclients[idClient].getLtcomptes();

        for (int val= 0 ; val < nroCompte; val++){
            System.out.print( ltcompte[val].getNroCompte()+ " - " + ltcompte[val].getSolde() + " \n");
        }
        System.out.println();
    }

    /**
     * qui affiche un bilan général de tous les compte de tous les clients.
     */
    public void afficherBilanCompteAll(){

        for (int cli= 0 ; cli < this.clientTotal; cli++){
            int nroCompte = ltclients[cli].getCompteTotal();
            Compte[] ltcompte =ltclients[cli].getLtcomptes();
            for (int cpt= 0 ; cpt < nroCompte; cpt++){
                System.out.print(ltclients[cli].getIdClient() +" " + ltclients[cli].getNom()+" - "+ ltcompte[cpt].getNroCompte()+ " - " + ltcompte[cpt].getSolde() + " \n");
            }
        }
        System.out.println();
    }

    public  void faireRetraitCompte(int idClient,int nroCompte, float montant){
       ltclients[idClient].compteRetrait(nroCompte,montant);
    }
    public  void faireDepotCompte(int idClient,int nroCompte, float montant){
        ltclients[idClient].compteDepot(nroCompte,montant);
    }
    public  void fairevirerComptes(int idClient,int nroCompte, int destinataire, float montant){
        ltclients[idClient].virer(nroCompte,destinataire,montant);
    }
    public  float afficherSoldeCompte(int idClient,int nroCompte){
       return ltclients[idClient].afficherSolde(nroCompte);
    }
    public int getClientTotal() {
        return clientTotal;
    }
    public Client[] getltclients() {
        return ltclients;
    }
}
