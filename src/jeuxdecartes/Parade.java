package jeuxdecartes;

public class Parade extends Bataille {

	public Parade(int nombre , Type type) {
		super(nombre, type);
		
	}
	
	public String toString() {
		switch (type) {
		case FEU:
			return "FEU VERT";
			
		case ESSENCE:
			return "ESSENCE";
			
		case CREVAISON:
			return "ROUE DE SECOURS";
			
		case ACCIDENT:
			return "REPARATIONS";
		default:
			return "INCONNU";
		}
	}

}
