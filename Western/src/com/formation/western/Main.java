package com.formation.western;

public class Main {

    public static void main(String[] args) {
	// write your code here
       Dame dame = new Dame("Jenifer");
       dame.presentation();

       Cowboy cowboy = new Cowboy("Black Bart");
       cowboy.presentation();

       Brigand brigand = new Brigand("Bod");
       brigand.presentation();
       brigand.kidnappe(dame);

       Sherif sherif = new Sherif("Joel");
       sherif.rechercheBrigand(brigand);
       cowboy.tirerBrigand(brigand);


       sherif.coffrerBrigand(brigand);
       cowboy.libererDame(dame);

       FemmeBrigand femmeBrigand = new FemmeBrigand("Rosa Brigand");
       femmeBrigand.presentation();
       femmeBrigand.kidnappe(dame);

       sherif.coffrerBrigand(femmeBrigand);
       femmeBrigand.seFaireEmprisonne(sherif);


      /* Barman barman = new Barman("Alex");
       Sherif sherif = new Sherif("sherif");
       Ripoux ripoux = new Ripoux("Ripoux");
       FemmeBrigand femme_brigand = new FemmeBrigand("femmeBrigand");
       Indien indien = new Indien("Indien Evo");
       barman.presentation();
       sherif.presentation();
       ripoux.presentation();
       femme_brigand.presentation();
       indien.presentation();
       */





    }
}
