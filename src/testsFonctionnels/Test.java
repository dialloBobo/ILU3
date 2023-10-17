package testsFonctionnels;

import jeu.Sabot;
import jeuxdecartes.Attaque;
import jeuxdecartes.Botte;
import jeuxdecartes.Carte;
import jeuxdecartes.Parade;
import jeuxdecartes.Probleme.Type;

public class Test {
	
	public static void main (String[] args) throws Exception {
		
		Sabot sabot = new Sabot(110);
		
		
		
		sabot.ajouterFamilleCarte(
				new Attaque (3,Type.ACCIDENT ),
				new Parade (3,Type.ACCIDENT),
				new Botte (1,Type.ACCIDENT)
				);
				
		Carte carte = null;
		
		while (!sabot.estVide()) {
			carte = sabot.piocher();
			System.out.println("je pioche "+ carte.toString());
			

	}
			

       
        



	}
   

		
		
}
 
	



