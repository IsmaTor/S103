package S1T3N1E1;

import java.util.Objects;

public class Month {
	//atributs
	private String nom;
	
	//constructor
	public Month (String nom) {
		this.nom = nom;
	}
	
	//getters
	public String getNom() {
		return nom;
	}
	
	//setters
	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nom);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Month other = (Month) obj;
		return Objects.equals(nom, other.nom);
	}
	
	
	
	

}
