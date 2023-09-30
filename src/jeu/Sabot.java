package jeu;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import jeuxdecartes.Carte;

public class Sabot implements Iterable <Carte> {
		
		private List <Carte> tabCartes;
		private int nbCartes;
		private  int nbCartesMaxi;

	

		public Sabot( int nbCartesMaxi, int nbCartes) {
			this.tabCartes = new ArrayList<>();
			this.nbCartesMaxi = nbCartesMaxi;
			this.nbCartes = nbCartes;
		}




		public List<Carte> getTabCartes() {
			return tabCartes;
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
				tabCartes.add(carte);
				nbCartes++;
			}
			else {
				throw new IllegalStateException ("depacement de capacité");
			}
			
		}
		
		public void ajouterFamilleCarte (Carte carte ,int nombre) {
			for (int i =0 ; i < nombre;i++) {
				ajouterCarte(carte);
			}
			
		}
		public void ajouterFamilleCarte (List <Carte> tabCartes) {
			
			for (Carte carte : tabCartes) {
				ajouterFamilleCarte(carte ,carte.getNombre());
			}
			
			
		}
		
		
		
		
		
		
		@Override
		public Iterator<Carte> iterator() {
			
			return new Iterator<Carte> () {
				private int indice =0;
				private int taille = nbCartes;
				

				@Override
				public boolean hasNext() {
					return indice < nbCartes;
					
				}

				@Override
				public Carte next() {
					if (!hasNext()) {
						throw new NoSuchElementException();
					}
					if (taille!=nbCartes) {
						throw new ConcurrentModificationException();
					}
					return tabCartes.get(indice++);
					
				
			}
			
				@Override
				public void remove() {
					if (indice>0) {
						tabCartes.remove(--indice);
						taille--;
						nbCartes--;
						
					}
					throw new IllegalStateException();
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
		
