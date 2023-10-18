package tests;

import jeuxdecartes.Attaque;
import jeuxdecartes.Carte;
import jeuxdecartes.Parade;
import jeuxdecartes.Probleme.Type;

public class Test_2 {
	
	public static void main(String[] args) {
		Carte carte1 = new Carte(5);
        Carte carte2 = new Carte(8);
        Carte carte3 = new Carte(5);

        // Comparaison des cartes en ignorant le nombre d'exemplaires
        System.out.println("Carte 1 : " + carte1.getNombre());
        System.out.println("Carte 2 : " + carte2.getNombre());
        System.out.println("Carte 3 : " + carte3.getNombre());

        // Vérification des comparaisons en ignorant le nombre d'exemplaires
        System.out.println("Carte 1 est égale à Carte 2 : " + carte1.equals(carte2));
        System.out.println("Carte 1 est égale à Carte 3 : " + carte1.equals(carte3));
        System.out.println("Carte 1 est supérieure à Carte 2 : " + (carte1.getNombre() > carte2.getNombre()));
        System.out.println("Carte 1 est inférieure à Carte 3 : " + (carte1.getNombre() < carte3.getNombre()));
    }
}

