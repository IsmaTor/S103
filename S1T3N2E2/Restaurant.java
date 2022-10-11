package S1T3N2E2;

import java.util.Objects;


public class Restaurant implements Comparable<Restaurant> {
	
		//atributs
		private String nom = "";
		private int puntuacio = 0;
		
		//constructor
		public Restaurant(String nom, int puntuacio) {
			this.nom = nom;
			this.puntuacio = puntuacio;
		}
		
		//getters
		public String getNom() {
			return nom;
		}
		
		public int getPuntuacio() {
			return puntuacio;
		}
		
		//setters
		public void setNom(String nom) {
			this.nom = nom;
		}
		
		public void setPuntuacio(int puntuacio) {
			this.puntuacio = puntuacio;
		}

		@Override
		public int hashCode() {
			return Objects.hash(nom, puntuacio);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Restaurant other = (Restaurant) obj;
			return Objects.equals(nom, other.nom) && puntuacio == other.puntuacio;
		}

		
		
		/*CompareTo () se utiliza para comparar dos cadenas lexicográficamente. Cada carácter de ambas cadenas se 
		convierte en un valor Unicode. Sin embargo, si ambas cadenas son iguales, este método devuelve 0 sino que 
		solo da como resultado un valor negativo o positivo.*/
		//El caràcter a ve abans que b. El resultat és -1
		//El caràcter b ve abans que a. El resultat és 1
		//El caràcter b es equivalent. per lo tant la sortida es 0.
		@Override
		public int compareTo(Restaurant obj1) {
			if (this.getNom().compareTo(obj1.getNom()) == 0) {
				if (this.getPuntuacio() < obj1.getPuntuacio()) { //comparem els caràcters si b està abans que a
					return 1;
				} else if (this.getPuntuacio() > obj1.getPuntuacio()) { //comparem els caràcters si a està abans que b
					return -1;
				} else {
					return 0;
				}
			} else {
				return this.getNom().compareTo(obj1.getNom());
			}
		}
	
		
}