package jeuxdecartes;

public class Botte extends Probleme {

	public Botte(int nombre , Type type) {
		super(nombre, type);
	}
	
	
	public String toString() {
		
	switch (type)
	{
	case FEU:
		return "VEHICULE PRIORITAIRE";
			
	case ESSENCE:
		return "CITERNE D'ESSENCE";
	case CREVAISON:
		return "INCREVABLE";
	case ACCIDENT:
		return "AS DU VOLANT";
			

	default:
		  return "INCONNU";
	}

}
}
