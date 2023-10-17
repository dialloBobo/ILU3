package jeu;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import jeuxdecartes.Attaque;
import jeuxdecartes.Botte;
import jeuxdecartes.Carte;
import jeuxdecartes.Parade;


public class Sabot implements Iterable <Carte> {
		
		private Carte[] tabCartes;
		private int nbCartes;
		private  int nbCartesMaxi;

	

		public Sabot( int nbCartesMaxi) {
			this.tabCartes = new Carte [nbCartesMaxi];
			this.nbCartesMaxi = nbCartesMaxi;
			
		}




	

		public int getNbCartes() {
			return nbCartes;
		}

		public int getNbCartesMaxi() {
			return nbCartesMaxi;
		}

		public boolean estVide() {
			return nbCartes==0;
		}

		private void ajouterCarte (Carte carte) {
			if (nbCartes < nbCartesMaxi){ 
				tabCartes[nbCartes]=carte;
				nbCartes++;
			}
			else {
				throw new IllegalStateException ("depacement de capacité");
			}
			
		}
		
		public void ajouterFamilleCarte (Carte carte ,int nombre) {
			for (int i =0 ; i < nombre; i++) {
				ajouterCarte(carte);
			}
			
		}
		public void ajouterFamilleCarte (Carte... tabCartes) {
			
			for (Carte carte : tabCartes) {
				ajouterFamilleCarte(carte ,carte.getNombre());
			}
			
			
		}
		
		
		
		
		
		
		@Override
		public Iterator<Carte> iterator() {
			
			return new Iterator<Carte> () {
				private int indiceIt =0;
				private int taille = nbCartes;
				private boolean nextEffectue =false;
				

				@Override
				public boolean hasNext() {
					return indiceIt < nbCartes;
					
				}

				@Override
				public Carte next() {
					if (hasNext()) {
						Carte carte = tabCartes[indiceIt];
						indiceIt++;
						nextEffectue = true;
						return carte;
						
					}
					else {
						throw new NoSuchElementException();
					}
					
					
				
			}
			
				@Override
				public void remove() {
					if (nbCartes<1 || !nextEffectue) {
						throw new IllegalStateException();
					}
					for(int i = indiceIt -1 ; i < nbCartes -1 ; i++) {
						tabCartes[i]=tabCartes[i+1];
					}
					nextEffectue=false;
					indiceIt --;
					nbCartes --;
					
					if (indiceIt>0) {
						
						taille--;
						nbCartes--;	
					}
				}
				
		};
		
		
	

}
		public Carte piocher() {
			
			Iterator <Carte> iterator =iterator();
			if (iterator.hasNext()) {
				Carte carte = iterator.next();
				iterator.remove();
				return carte;
			}
			throw new NoSuchElementException();
			
		}






		
		
}
		
