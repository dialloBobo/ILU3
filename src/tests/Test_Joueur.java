package tests;

import java.util.ArrayList;
import java.util.HashSet;

import jeu.Joueur;
import jeu.Main;
import jeu.MainAsListe;
import jeuxdecartes.Borne;

public class Test_Joueur {
    public static void main(String[] args) {
        // Création d'un joueur
        Joueur joueur = new Joueur("John", new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new HashSet<>(), new MainAsListe());

        joueur.getCollection_bornes().add(new Borne(1, 50));
        joueur.getCollection_bornes().add(new Borne(2, 70));
        joueur.getCollection_bornes().add(new Borne(1, 100));

        int totalkm = joueur.getKM();
        System.out.println("Le km total est: " + totalkm);

        // Vérification du résultat
        int resultat_attendu = 50 +  70 + 100;
        System.out.println("Résultat attendu : " + resultat_attendu);

        assert resultat_attendu == totalkm : "Erreur: km différent de celui attendu";
    }

}
