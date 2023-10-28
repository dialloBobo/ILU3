package tests;

import java.util.ArrayList;
import java.util.List;

import Utils.Utils;
import jeuxdecartes.Carte;
import jeuxdecartes.JeuDeCartes;

public class TestUtils {
	
	public static void main(String[] args) {
		
		
		JeuDeCartes jeu = new JeuDeCartes();
        List<Carte> listeCarteNonMelangee = jeu.getListeCartes();
        List<Carte> listeCartes = new ArrayList<>(listeCarteNonMelangee);
        System.out.println("Liste initiale : " + listeCartes);
        
        System.out.println("     ");
        
        listeCartes = Utils.melanger(listeCartes);
        System.out.println("Liste mélangée : " + listeCartes);
        System.out.println("Liste mélangée sans erreur ? " + Utils.verifierMelange(listeCarteNonMelangee, listeCartes));
        
        System.out.println("      ");
        
        listeCartes = Utils.rassembler(listeCartes);
        System.out.println("Liste rassemblée : " + listeCartes);
        System.out.println("Liste rassemblée sans erreur ? " + Utils.verifierRassemblement(listeCartes));
	}

}
