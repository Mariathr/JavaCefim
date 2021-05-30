package com.formation.western;

public class Sherif extends Cowboy {

   public Sherif(String nomHumain) {
     super("Sherif");

   }
   public void coffrerBrigand(HorsLaLoi brigand){
      brigand.seFaireEmprisonne(this);
      parler("Au nom de la loi, je vous arrête !" + brigand.quelEstTonNom() );
      parler("je reçois la récompense yupii  " + brigand.getMiseAPrix() + " $  - " + brigand.quelEstTonNom() );
   }
   public void rechercheBrigand(HorsLaLoi brigand){
    parler("OYEZ OYEZ BRAVE GENS !! 200 $ à qui arretera "+ brigand.quelEstTonNom() +" le brigand mort ou vif !!");
   }
}
