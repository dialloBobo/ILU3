package jeuxdecartes;
import java.util.List;

import jeu.Sabot;
import jeuxdecartes.Probleme.Type;


import java.util.ArrayList;
import java.util.List;

public class JeuDeCartes {




	private Carte[] typesDeCartes = {
            new Botte(1,Type.FEU), // Botte de type FEU (Véhicule Prioritaire)
            new Botte(1, Type.ESSENCE),
            new Botte(1, Type.CREVAISON),
            new Botte(1, Type.ACCIDENT),
            
            new Attaque(5,Type.FEU),
            new Attaque(3, Type.ESSENCE),
            new Attaque(3, Type.CREVAISON),
            new Attaque(3, Type.ACCIDENT),
            
            new Parade(14,Type.FEU),
            new Parade(6, Type.ESSENCE),
            new Parade(6, Type.CREVAISON),
            new Parade(6, Type.ACCIDENT),
            
            new DebutLimite(4),
            new FinLimite(6),

            new Borne(10,25),
            new Borne(10, 50),
            new Borne(10, 75),
            new Borne(12, 100),
            new Borne (4,200),
            
            
            
            
            
            
    };
	
	
    

    private List<Carte> listeCartes;

    public JeuDeCartes() {
    	
        listeCartes = new ArrayList<>();
        for (Carte carte : typesDeCartes) {
            for (int i = 0; i < carte.getNombre(); i++) {
                listeCartes.add(carte);
            }
        }
    }

    public List<Carte> getListeCartes() {
        return listeCartes;
    }
    
    
    public boolean checkCount() {
		for (Carte carteType : typesDeCartes) {
			int nbrExemplaires = 0;
			for (Carte carte : listeCartes) {
				if (carteType.equals(carte)) {
					nbrExemplaires++;
				}
			}
			if (nbrExemplaires!=carteType.getNombre()) {
				return false;
			}
		}
		return true;
	}
    
}
