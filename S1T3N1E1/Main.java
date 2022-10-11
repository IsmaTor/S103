package S1T3N1E1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		ArrayList<Month> calendari = new ArrayList<Month>(); //arraylist per afegir el mesos
		
		calendari.add(new Month("gener1")); //un altre manera per afegir objectes 
		//objectes mesos
		Month mes1 = new Month("gener");
		Month mes2 = new Month("febrer");
		Month mes3 = new Month ("Març");
		Month mes4 = new Month ("Abril");
		Month mes5 = new Month ("Maig");
		Month mes6 = new Month ("Juny");
		Month mes7 = new Month ("Juliol");
		Month mes8 = new Month ("Agost"); //el mes agost no serà afegit desde un principi
		Month mes9 = new Month ("Septembre");
		Month mes10 = new Month ("Octubre");
		Month mes11 = new Month ("Novembre");
		Month mes12 = new Month ("Desembre");
		Month mes13 = new Month ("Desembre"); //dupliquem el nom d'un mes
		
		//afegim els mesos a la array calendari
		calendari.add(mes1);
		calendari.add(mes2);
		calendari.add(mes3);
		calendari.add(mes4);
		calendari.add(mes5);
		calendari.add(mes6);
		calendari.add(mes7);
		calendari.add(mes9);
		calendari.add(mes10);
		calendari.add(mes11);
		calendari.add(mes12);
		
		//mostrem els mesos
		System.out.println("Mostrem el mesos sense agost:");
		for (Month month : calendari) {
			System.out.println(month.getNom());
		}
		
		//afegim agost en la posició 8 de la array
		calendari.add(7, mes8);
		
		//mostrem agost 
		System.out.println("Mostrem el mesos amb agost:");
		for (Month month : calendari) { 
			System.out.println(month.getNom());
		}
		
		//afegim desembre per veure que está repetit, HashSet no permet elements duplicats però en aquest cas
		//detecta que es un element diferent encara que hi han 2 desembres.
		calendari.add(mes13);
		//ho mostrem
		for (Month month : calendari) { 
			System.out.println(month.getNom());
		}
		
		//convertir la array calendari a HashSet
		HashSet<Month> mesos = new HashSet<Month>(calendari);
		
		System.out.println("HASHSET,,,,,,,,,,,,,");
		//mostrem el mesos amb desembre duplicat, els mètodes hashCode i equals a la classe Month ho fan possible
		System.out.println("Mostrem els mesos amb desembre duplicat, però no surtirà");
		for (Month month : mesos) { 
			System.out.println(month.getNom());
		}
		
		//creem l'iterator
		Iterator<Month> iterator1 = mesos.iterator();
		
		System.out.println("ITERATOR,,,,,,,,,,,,,,,");
		
		//eliminar objecte "gener1" del calendari
		while (iterator1.hasNext()) { // li diem que mentre hi hagi coses a recórrer, fins que no arriba al següent objecte
			// no sap si hi ha objecte o no. "a toro pasado".
			String nomMesos = iterator1.next().getNom(); //li diem que agafi tots els noms de dins del iterator i els fiqui a la variable nomMesos
					if (nomMesos.equals("gener1")) { //li diem que trobi un nom com "gener1"
					iterator1.remove(); //i l'elimini
					}
				}
				
				//mostra el calendari sense "gener1"
				for (Month month : mesos) { 
					System.out.println(month.getNom());
				}
		
				// TODO Auto-generated method stub

	}
	
}
