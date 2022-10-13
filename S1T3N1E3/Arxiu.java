package S1T3N1E3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class Arxiu {

	//mètode per trobar un archiu que no retornarà res
	/*public void trobarArchiu() {
	
	try { //buscar l'arxiu, com a nota tot el que importem de java.io ens obligarà a fer try/catch per fer Excepcions controlades
		FileReader texte1 = new FileReader("C:\\Users\\Usuario\\eclipse-workspace\\S1T3\\src\\S1T3N1E3\\countries.txt");
		
		int trobaTexte = 0; //agafa els caràcters del texte i necessita un Exception tipo IO, possem 0 perque agafi el primer caràcter
		
		while(trobaTexte != -1){//mentres troba sigui diferent de -1 farà lo següent
			trobaTexte = texte1.read(); //guarda tots el caràcters
			char lletra = (char)trobaTexte; //fem un casting per fer llegible la informació
			System.out.print(lletra);
		}
		texte1.close();//tanquem el fluxe de dades sempre
		
	} catch (IOException ex) { //captura l'Exception de read();
		// TODO Auto-generated catch block
		System.out.println("Nos s'ha trobat l'arxiu.");
	}
}
*/
	public static String escriureArxiu(String nom, int punts) {
		
		String frase = "El jugador " + nom + " ha fet una puntuació de: " + punts + " punts.\n";
		
		
		try {
			FileWriter escriptura = new FileWriter("C:\\Users\\Usuario\\eclipse-workspace\\S1T3\\src\\S1T3N1E3\\classificacio.txt", true);
			// en el cas que existeixi o no un fitxer "classificacio" em de possar true per anar afegin i no fer sobreescriptura
			//PrintWriter ArxiuA = new PrintWriter(escriptura);
			for(int i = 0; i < frase.length(); i++) {//i sigui es igual 0 i sigui menor que la longitud de la frase
				escriptura.write(frase.charAt(i));//cada volta del bucle escriu
		}
			escriptura.close();

		} catch (IOException e) {
			System.out.println("No s'ha trobat l'arxiu.");
	}
		return frase;
		
	}
	
//mètode per trobar un archiu que no retornarà res
public static  HashMap<String, String> llegirArchiu() throws IOException {
	String frase;
	String pais;
	String capital;
	HashMap<String, String> paisos = new HashMap<String, String>();
	
	try { //buscar l'arxiu, com a nota tot el que importem de java.io ens obligarà a fer try/catch per fer Excepcions controlades
		FileReader texte1 = new FileReader("C:\\Users\\Usuario\\eclipse-workspace\\S1T3\\src\\S1T3N1E3\\countries.txt");
		
		BufferedReader bufferArxiu = new BufferedReader(texte1); //s'ha creat una memoria intermedia
		
		//String separador = " ";
		//String[] parts = frase.split(separador);//on aniran emmagatzemades les parts
		
		//el que s'ha de trobar per separar les paraules ens interesa (" ") els altres son exemples
		 /*if(separador.equals("|")|| separador.equals("\\")||separador.equals(".")||separador.equals("^")||separador.equals("$")
		            ||separador.equals("?")||separador.equals("*")||separador.equals("+")||separador.equals("(")||separador.equals(")")
		            ||separador.equals("{")||separador.equals("[")||separador.equals(" ")){
			 
		 }*/
		while((frase = bufferArxiu.readLine()) != null){//quan no hi hagi String tornarà null
			//frase = bufferArxiu.readLine();//emmagatzemarà la primera frase del buffer
			String parts[] = frase.split(" ");
			
			if (parts.length > 1) {
			pais = parts[0];
			capital = parts[1];
			paisos.put(capital, pais); //inserta un par clau/valor
			}
			//if(frase != null)  //condició per que no surti NULL per pantalla
			//System.out.println(parts[0]);
			//System.out.println(parts[1]);
			//System.out.println(paisos);
		}
		texte1.close();//tanquem el fluxe de dades sempre
		bufferArxiu.close();
	} catch (IOException e) { //captura l'Exception de read();
		// TODO Auto-generated catch block
		System.out.println("Nos s'ha trobat l'arxiu.");
	} 
	return paisos;
}
}