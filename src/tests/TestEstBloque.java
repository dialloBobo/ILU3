package tests;

import java.util.ArrayList;
import java.util.HashSet;


import jeu.Joueur;
import jeu.MainAsListe;
import jeuxdecartes.Attaque;
import jeuxdecartes.Bataille;
import jeuxdecartes.Botte;
import jeuxdecartes.Probleme.Type;

public class TestEstBloque {



	



	public static void main(String[] args) {
		
		
		 Joueur joueur = new Joueur("John", new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new HashSet<>(), new MainAsListe());

	        // Ajout d'un feu rouge
	        joueur.getPilebataille().add(new Bataille(1, Carte.FEU_ROUGE));
	        System.out.println("Bloqué après ajout d'un feu rouge : " + joueur.estBloque());

	        // Ajout d'un véhicule prioritaire
	        joueur.getPilebataille().add(new Bataille(2, Carte.VEHICULE_PRIORITAIRE));
	        System.out.println("Bloqué après ajout d'un véhicule prioritaire : " + joueur.estBloque());

	        // Ajout d'un accident
	        joueur.getPilebataille().add(new Bataille(3, Carte.ACCIDENT));
	        System.out.println("Bloqué après ajout d'un accident : " + joueur.estBloque());

	        // Effacement des bottes
	        joueur.getEnsemble_botte().clear();
	        System.out.println("Bloqué après effacement des bottes : " + joueur.estBloque());

	        // Ajout d'un as du volant
	        joueur.getPilebataille().add(new Bataille(4, Carte.AS_DU_VOLANT));
	        System.out.println("Bloqué après ajout d'un as du volant : " + joueur.estBloque());

	        // Ajout d'une panne d'essence
	        joueur.getPilebataille().add(new Bataille(5, Carte.PANNE_ESSENCE));
	        System.out.println("Bloqué après ajout d'une panne d'essence : " + joueur.estBloque());

	        // Ajout d'essence
	        joueur.getPilebataille().add(new Bataille(6, Carte.ESSENCE));
	        System.out.println("Bloqué après ajout d'essence : " + joueur.estBloque());

	        // Effacement des bottes
	        joueur.getEnsemble_botte().clear();

	        // Ajout d'un feu vert
	        joueur.getPilebataille().add(new Bataille(7, Carte.FEU_VERT));
	        System.out.println("Bloqué après ajout d'un feu vert : " + joueur.estBloque());
	}
	
	
	 }


