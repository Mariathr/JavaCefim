package com.formation.banque;

import java.util.Scanner;

/**
 * qui entame un dialogue avec l’utilisateur pour faire fonctionner la banque
 */
public class Banque {

   private BanqueInteractive banqueInteractive = new BanqueInteractive();

    //Methodes
    public void interaction() {

        // pre,ier question
        String question1 = " 1) Ajouter un client? \n";
        String question2 = " 2) Effectuer une operation sur un client? \n";
        String question3 = " 3) Afficher un bilan général?";

        Scanner questions = new Scanner(System.in);
        System.out.println(question1 + question2 + question3);
        int reponse = questions.nextInt();

        if (reponse == 1){
            interactionAjoutClient();
        }else if(reponse ==2){
            interactionOperationClient();
        }else if(reponse ==3){
            banqueInteractive.afficherBilanCompteAll();
        }

    }
    /**
     * pourra s’occuper de demander le nom du nouveau client a` l’utilisateur
     */
    private void  interactionAjoutClient(){
        // question
        String question = " Entrez le nom du client:";
        System.out.println(question);
        Scanner questions = new Scanner(System.in);
        String reponse = questions.nextLine();

        //créé client

        banqueInteractive.ajouterClient(reponse);
        System.out.println("Le client " + reponse + " a é́té́ créé.");

        //appeler questions
        interaction();
    }

    /**
     * pourra s’occuper des op ́erations sur un client, et appeler si besoin
     */
    private void interactionOperationClient(){
        Client[] ltClient  = banqueInteractive.getltclients();
        int nroClientTotal = banqueInteractive.getClientTotal();
        System.out.println();
        Scanner questions = new Scanner(System.in);

        //  list clients
        System.out.println(" Quel client? \n");

        for (int val= 0 ; val < nroClientTotal; val++){
            ltClient[val].getIdClient();
            ltClient[val].getNom();
            System.out.print(ltClient[val].getIdClient() +") " + ltClient[val].getNom() + " \n");
        }

        int idClient = questions.nextInt();
        idClient = idClient - 1;
        String selectionClient = banqueInteractive.afficherClient(idClient);

        System.out.print("Quelle operation voulez-vous effectuer sur le client  " + selectionClient  +" ?\n");
        // questions client
        System.out.print( " 1) Afficher un bilan? \n");
        System.out.print( " 2) Faire un retrait? \n");
        System.out.print( " 3) Faire un dépot? \n");
        System.out.print(  " 4) Faire un virement? \n");
        System.out.print(  " 5) Ajoute un nouveau Compte ?");
        System.out.println();
        int reponse = questions.nextInt();
        if (reponse == 1){
            /*Afficher un bilan*/
            banqueInteractive.afficherBilanCompte(idClient);
        }else if(reponse ==2){
            /*Faire un retrait*/
            faireRetrait(idClient);
        }else if(reponse ==3){
            /*Faire un dépott*/
            faireDepot(idClient);
        }else if(reponse ==4){
            /*Faire un virement?*/
            faireVirer(idClient);
        }else if(reponse ==5){
            ajouteCompte(idClient);
        }

        //appeler questions
        interaction();
    }
    private void faireRetrait(int idClient){
        System.out.println();
        Scanner questions = new Scanner(System.in);
        System.out.println("entrer le numéro de compte..  ");
        int nroCompte = questions.nextInt() - 1;
        System.out.println("entrer le montant..  ");
        float valeurMontant = questions.nextFloat();
        banqueInteractive.faireRetraitCompte(idClient,nroCompte,valeurMontant);
        float nbSolde = banqueInteractive.afficherSoldeCompte(idClient,nroCompte);
        System.out.println("Solde Compte..  " + nbSolde );
    }
    private void faireDepot(int idClient){
        System.out.println();
        Scanner questions = new Scanner(System.in);
        System.out.println("entrer le numéro de compte..  ");
        int nroCompte = questions.nextInt() - 1;
        System.out.println("entrer le montant..  ");
        float valeurMontant = questions.nextFloat();
        banqueInteractive.faireDepotCompte(idClient,nroCompte,valeurMontant);
        float nbSolde = banqueInteractive.afficherSoldeCompte(idClient,nroCompte);
        System.out.println("Solde Compte..  " + nbSolde );
    }
    private void faireVirer(int idClient){
        System.out.println();
        Scanner questions = new Scanner(System.in);
        System.out.println("entrer le numéro de compte..  ");
        int nroCompte = questions.nextInt() -1;
        System.out.println("entrer le numéro de compte destinataire..  ");
        int nrodestinataire = questions.nextInt() - 1;
        System.out.println("entrer le montant..  ");
        float valeurMontant = questions.nextFloat();
        banqueInteractive.afficherBilanCompte(idClient);
        banqueInteractive.fairevirerComptes(idClient,nroCompte,nrodestinataire,valeurMontant);
        banqueInteractive.afficherBilanCompte(idClient);
    }
    private void ajouteCompte(int idClient){
        System.out.println();
        Scanner questions = new Scanner(System.in);
        System.out.println("Entrer le montant a nouveau Compte..  ");
        float valeurMontant = questions.nextFloat();
        banqueInteractive.ajouterCompteSolde(idClient,valeurMontant);
        int nrCompte =banqueInteractive.afficherCompte(idClient);
        System.out.println("Compte a été créé  :  " +nrCompte + " Solde :" + valeurMontant);


    }
}
