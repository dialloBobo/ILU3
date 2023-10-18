package jeuxdecartes;

import java.util.Objects;

public class Carte {
	private int nombre;
	
	
	public Carte(int nombre) {
		this.nombre = nombre;
	}

	public int getNombre() {
		return nombre;
	}

	public void setNombre(int nombre) {
		this.nombre = nombre;
	}
	
	@Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return true;
    }
	
	
	@Override
    public int hashCode() {
        // Ignorer le nombre d'exemplaires dans le code de hachage
        return Objects.hash();
    }
		
	}



	


	
	


