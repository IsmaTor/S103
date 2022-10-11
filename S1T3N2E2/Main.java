package S1T3N2E2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {

		
		HashSet<Restaurant> restaurants = new HashSet<Restaurant>();
		
		restaurants.add(new Restaurant("Can Paco", 6));
		restaurants.add(new Restaurant("L'empanat", 7));
		restaurants.add(new Restaurant("El dau", 9));
		restaurants.add(new Restaurant("El Bulli", 8));
		restaurants.add(new Restaurant("El Programador", 10));
		restaurants.add(new Restaurant("El Programador", 10));
		restaurants.add(new Restaurant("El Programador", 9));
		
		//cambiem a una ArrayList per fer ordenar el restaurants
		ArrayList<Restaurant> LlistaRestaurants = new ArrayList<Restaurant>(restaurants);
		
		//agafem de la classe Collections el mètode sort per endreçar
		Collections.sort(LlistaRestaurants); 
		//Collections.reverse(LlistaRestaurants); endreçar al reves Z a A
		
		//mostrem la llista
		for (Restaurant restaurant : LlistaRestaurants) {
			System.out.println("Nom: " + restaurant.getNom() + " " + "," + "Puntuacion: " + restaurant.getPuntuacio() + " puntos.");
	}
}
}