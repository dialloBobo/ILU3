package tests;

import jeuxdecartes.Carte;
import jeuxdecartes.JeuDeCartes;

public class TestJeuDeCartes {

    public static void main(String[] args) {
        JeuDeCartes jeu = new JeuDeCartes();
        for (Carte carte : jeu.getListeCartes()) {
            System.out.println(carte);
        }
        
        System.out.println("CheckCount = " + jeu.checkCount() + "\n");
    }
}



