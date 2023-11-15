package jeu;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import jeuxdecartes.Attaque;
import jeuxdecartes.Bataille;
import jeuxdecartes.Borne;
import jeuxdecartes.Botte;
import jeuxdecartes.Carte;
import jeuxdecartes.FinLimite;
import jeuxdecartes.Limite;
import jeuxdecartes.Parade;
import jeuxdecartes.Probleme.Type;


public class Joueur {
	private String nom;
	List < FinLimite> pilelimite = new ArrayList <>();
	List <Bataille> pilebataille =new ArrayList <>();
	List <Borne> collection_bornes = new ArrayList <>();
	Set <Botte> ensemble_botte = new HashSet<> ();
	private Main main;
	
	
	


	public Joueur(String nom, List<FinLimite> pilelimite, List<Bataille> pilebataille, List<Borne> collection_bornes,
			Set<Botte> ensemble_botte, Main main) {
		super();
		this.nom = nom;
		this.pilelimite = pilelimite;
		this.pilebataille = pilebataille;
		this.collection_bornes = collection_bornes;
		this.ensemble_botte = ensemble_botte;
		this.main = main;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public List<FinLimite> getPilelimite() {
		return pilelimite;
	}


	public void setPilelimite(List<FinLimite> pilelimite) {
		this.pilelimite = pilelimite;
	}


	public List<Bataille> getPilebataille() {
		return pilebataille;
	}


	public void setPilebataille(List<Bataille> pilebataille) {
		this.pilebataille = pilebataille;
	}


	public List<Borne> getCollection_bornes() {
		return collection_bornes;
	}


	public void setCollection_bornes(List<Borne> collection_bornes) {
		this.collection_bornes = collection_bornes;
	}


	public Set<Botte> getEnsemble_botte() {
		return ensemble_botte;
	}


	public void setEnsemble_botte(Set<Botte> ensemble_botte) {
		this.ensemble_botte = ensemble_botte;
	}


	public Main getMain() {
		return main;
	}


	public void setMain(Main main) {
		this.main = main;
	}


	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Joueur) {
			Joueur joueur = (Joueur) obj;
			return nom.equals(joueur.getNom());
		}
	
	return false;
	}
	

	@Override
	public int hashCode () {
		return nom.hashCode();
	}
	
	private void donner (Carte carte) {
		assert main.iterator().hasNext();
		main.prendre(carte);
		assert main.iterator().hasNext();
	}
	
	
	private Carte prendreCarte (List <Carte> sabot) {
		if (!sabot.isEmpty()) {
			Carte carte = sabot.remove(0);
			main.prendre(carte);
			return carte;
		}
		return null;
		
	}
	
	public int getKM() {
		int totalkm=0;
		for (Borne borne:collection_bornes) {
			totalkm+= borne.getKm();
		}
		return totalkm;
	}
	
	public int getLimite() {
	    // Vérifier si la pile de limites est vide
	    if (pilelimite.isEmpty()) {
	        return 200;  // Limite par défaut si la pile est vide
	    }

	    // Obtenir le sommet de la pile
	    Limite sommetPile = pilelimite.get(pilelimite.size() - 1);

	    // Vérifier si le sommet de la pile est une fin de limite
	    if (sommetPile instanceof FinLimite) {
	        return 200;  // Limite par défaut si le sommet est une fin de limite
	    }

	    for (Botte botte : ensemble_botte) {
	        if (botte.getType() == Type.FEU) {
	            return 200;  // Limite par défaut si le joueur est prioritaire
	        }
	    }
	    // Si aucune des conditions précédentes n'est remplie, la limite est de 50
	    return 50;
	}


	public boolean estBloque() {
        // Vérifier si la pile de bataille est vide et le joueur est prioritaire
        if (pilebataille.isEmpty() && ensemble_botte.stream().anyMatch(botte -> botte.getType() == Type.FEU)) {
            return false;
        }

        // Obtenir le sommet de la pile de bataille
        if (!pilebataille.isEmpty()) {
            Carte sommetPile = pilebataille.get(pilebataille.size() - 1);

            // Vérifier si le sommet est une parade de type FEU et le joueur est prioritaire
            if (sommetPile instanceof Parade && ((Parade) sommetPile).getType() == Type.FEU &&
                    ensemble_botte.stream().anyMatch(botte -> botte.getType() == Type.FEU)) {
                return false;
            }

            // Vérifier si le sommet est une parade et le joueur est prioritaire
            if (sommetPile instanceof Parade && ensemble_botte.stream().anyMatch(botte -> botte.getType() == Type.FEU)) {
                return false;
            }

            // Vérifier si le sommet est une attaque de type FEU et le joueur est prioritaire
            if (sommetPile instanceof Attaque && ((Attaque) sommetPile).getType() == Type.FEU &&
                    ensemble_botte.stream().anyMatch(botte -> botte.getType() == Type.FEU)) {
                return false;
            }

            // Vérifier si le sommet est une attaque d'un autre type pour lequel le joueur a une botte et le joueur est prioritaire
            if (sommetPile instanceof Attaque &&
                    ensemble_botte.stream().anyMatch(botte -> botte.getType() == ((Attaque) sommetPile).getType() &&
                            botte.getType() != Type.FEU)) {
                return false;
            }
        }

        return true; // Le joueur est bloqué dans les autres cas
    }


	
}
