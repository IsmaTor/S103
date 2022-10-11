package S1T3N1E2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		//creació de les llistes
		List<Integer> llista1 = new ArrayList<Integer>();
		List<Integer> llista2 = new ArrayList<Integer>();
		
		//afegir elements a la llista1
		llista1.add(1);
		llista1.add(2);
		llista1.add(3);
		//mostrar elements de la llista1
		//System.out.println(llista1.toString());
		//afegir elements a la llista2
		llista2.add(4);
		llista2.add(5);
		llista2.add(6);
		//mostrar elements de la llista2
		//System.out.println(llista2.toString());
		
		ListIterator iterator1 = llista1.listIterator();
		/*
		//d'aquesta forma afegeix 1 en 1 els objectes a iterator1
		iterator1.next();
		iterator1.next(); 
		*/
		//afegim tots els objectes al iterator1
		while(iterator1.hasNext()) { 
			  System.out.println(iterator1.next());
		}
		//afegim els objectes de la llista1 a la llista2 al reves amb el mètode previousIndex()
		while(iterator1.hasPrevious()) {
			  llista2.add(iterator1.previousIndex() + 1);
				iterator1.previous();
		}
		//ho mostrem
				System.out.println(llista1);
				System.out.println(llista2);
				
				//eliminem un objecte de la llista1
			iterator1.next(); //posició 1
			iterator1.next(); //posició 2
			iterator1.remove(); //elimina la posició 2
			
			System.out.println(llista1);
				
		// TODO Auto-generated method stub

	}

}
