package jeu;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import jeuxdecartes.Bataille;
import jeuxdecartes.Borne;
import jeuxdecartes.Botte;
import jeuxdecartes.FinLimite;


public class Joueur {
	private String nom;
	List < FinLimite> pilelimite = new ArrayList <>();
	List <Bataille> pilebataille =new ArrayList <>();
	List <Borne> collection_bornes = new ArrayList <>();
	Set <Botte> ensemble_botte = new HashSet<> ();
	
	public Joueur(String nom, List<FinLimite> pilelimite, List<Bataille> pilebataille, List<Borne> collection_bornes,
			Set<Botte> ensemble_botte) {
		super();
		this.nom = nom;
		this.pilelimite = pilelimite;
		this.pilebataille = pilebataille;
		this.collection_bornes = collection_bornes;
		this.ensemble_botte = ensemble_botte;
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
	
}
