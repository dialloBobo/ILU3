package tests;

import jeuxdecartes.Carte;
import jeuxdecartes.JeuDeCartes;
import jeuxdecartes.Probleme.Type;

public class TestJeuDeCartes {

    public static void main(String[] args) {
        JeuDeCartes jeu = new JeuDeCartes();
        for (Carte carte : jeu.getListeCartes()) {
            System.out.println(carte);
        }
        
       
        
        
        
        if (jeu.checkCount()) {
            System.out.println(jeu.checkCount()+ "  :le nombre d'exemplaires souhaité pour chaque type de carte a été respecté." );
        } else {
            System.out.println(jeu.checkCount()+ "  Erreur : Le nombre d'exemplaires souhaité pour chaque type de carte n'a pas été respecté.");
        }

    
    
    }


}



