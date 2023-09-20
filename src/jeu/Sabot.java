package jeu;

import jeuxdecartes.Carte;

public class Sabot {
		
		private Carte [] tabCartes;
		private int nbCartes;
		private  int nbCartesMaxi;

		public Sabot( int nbCartes) {
			Carte [] tabCartes = new Carte [nbCartesMaxi];
			this.tabCartes = tabCartes;
			this.nbCartes = nbCartes;
		}

		public Carte[] getTabCartes() {
			return tabCartes;
		}

		

		public int getNbCartes() {
			return nbCartes;
		}

		public Boolean estVide() {
			return nbCartes==0;
			
		}
		private int ajouter
	

}
