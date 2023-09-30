package jeuxdecartes;

public class Probleme extends Carte {
	public Type type;
	
	public enum Type {
		FEU ,ESSENCE,CREVAISON,ACCIDENT
	}

	
	public Probleme(int nombre, Type type) {
		super(nombre);
		this.type = type;
	}


	public Type getType() {
		return type;
	}


	public void setType(Type type) {
		this.type = type;
	}
	


}
