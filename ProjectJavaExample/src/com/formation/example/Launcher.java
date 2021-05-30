package com.formation.example;

import com.sun.source.util.SourcePositions;

import java.net.SocketTimeoutException;
import java.sql.SQLOutput;
import java.util.Locale;

/**
 * Clase Launcher por démarrer non programe
 * @since 1.0
 * @author sauvage
 */
public class Launcher {

    public static void main(String[] arg) {

        Aventurier nomAventurier = new Aventurier("ggg",100);


        nomAventurier.attaquer();
        nomAventurier.avancer();
}
    /**
     * Methode principale appele au demarrege du programe
     * @param xx
     * @author sauvageb
     * @since 1.0
     */
    public static void main123(String[] arguments) {



	// write your code here
        /*System.out.println("ça fonctionne toujours ");
        String guestName = xx[0] + " " + xx[0];
        String msg2 = "Bienvenue " + guestName;
        System.out.println(xx[0]);
        System.out.println(xx[1]);

        String msg = String.format("Bienvenue %d %s ", xx[0],xx[1]);
        msg = msg.toUpperCase();
        msg.toLowerCase();
        System.out.println(xx[1]);
        if (msg.equals(msg2))*/

        for (int j = 0; j < arguments.length; j++){
            System.out.println();
        }
        //for each
        for(String s : arguments){
            System.out.println(s);
        }
         //while
        int stop = 0;
        while (stop != arguments.length){

        }
        // condition IF
        int example = 0;

        String msg3 = example > 0 ? ")" : "(";
        System.out.println(msg3);


        int test;

    }

}
