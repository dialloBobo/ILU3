package jeuxdecartes;

public class Attaque extends Bataille {

	public Attaque(int nombre ,Type type) {
		super(nombre, type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "FeuRouge " + " " + getType() ;
				 
	}

	public static void main(String[] args) {
		Attaque attaque = new Attaque(1, Type.FEU);
		System.out.println(attaque);
	}




	
	
	
	

}
