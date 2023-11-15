package tests;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import jeu.Joueur;
import jeu.MainAsListe;
import jeuxdecartes.Botte;
import jeuxdecartes.FinLimite;
import jeuxdecartes.Probleme.Type;

public class TestGetLimite {
	
	public static void main (String [] args) {

	 // Création d'un joueur sans botte
	    Joueur joueurSansBotte = new Joueur("bobo",  new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new HashSet<>(), new MainAsListe());
	    System.out.println("Limite pour " + joueurSansBotte.getNom() + ": " + joueurSansBotte.getLimite());

	    // Création d'un joueur avec la botte de type FEU
	    Set<Botte> ensembleBotteFEU = new HashSet<>();
	    ensembleBotteFEU.add(new Botte(1, Type.FEU));
	    Joueur joueurAvecBotteFEU = new Joueur("Arti",  new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), ensembleBotteFEU, new MainAsListe());
	    System.out.println("Limite pour " + joueurAvecBotteFEU.getNom() + ": " + joueurAvecBotteFEU.getLimite());

	    // Création d'un joueur avec une autre botte
	    Set<Botte> ensembleBotteAutre = new HashSet<>();
	   
	    Joueur joueurAvecBotteAutre = new Joueur("Omar", new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), ensembleBotteAutre, new MainAsListe()); 
	    System.out.println("Limite pour " + joueurAvecBotteAutre.getNom() + ": " + joueurAvecBotteAutre.getLimite());
	
	    
	
	
	}
}

