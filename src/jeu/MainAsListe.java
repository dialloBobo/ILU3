package jeu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import jeuxdecartes.Carte;

public class MainAsListe implements Main {
	
	List <Carte> cartEnMain;

	
	
	public MainAsListe() {
		
		this.cartEnMain = new ArrayList<>();
	}

	@Override
	public void prendre(Carte carte) {
		cartEnMain.add(carte);
		
	}

	@Override
	public void jouer(Carte carte) {
		assert cartEnMain.contains(carte); 
			cartEnMain.remove(carte);
		
		
		
	}

	@Override
	public Iterator<Carte> iterator() {
		return cartEnMain.iterator();
	}

}
