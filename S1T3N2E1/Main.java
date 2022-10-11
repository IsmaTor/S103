package S1T3N2E1;

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
		
		for (Restaurant restaurant : restaurants) {
			System.out.println(restaurant.getNom() + " " + restaurant.getPuntuacio());
		}
		
		// TODO Auto-generated method stub

	}

}
