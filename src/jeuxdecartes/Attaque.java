package jeuxdecartes;

public class Attaque extends Bataille {


	public Attaque(int nombre ,Type type) {
		super(nombre, type);
	}


	public String toString() {
	
	switch (type)
	{
	case FEU:
		return "FEU ROUGE";
			
	case ESSENCE:
		return "PANNE D'ESSENCE";
	case CREVAISON:
		return "CREVAISON";
	case ACCIDENT:
		return "ACCIDENT";
			

	default:
		  return "INCONNU";
	}
		
				 
	}



 


	
	
	
	

}
