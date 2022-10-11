package S1T3N1E3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		HashMap<String, String> paisos = new HashMap<String, String>();
		Scanner entrada = new Scanner(System.in);
		
		//variables
		String frase = "";
		String pais;
		String capital;
		String nom = "";
		int punts = 0;
		int preguntesTotal = 10;
		
		//LLLEGIR ARXIU
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
		
		
		//NOM JUGADOR
		System.out.println("Indica el nom del jugador: ");
		nom = entrada.next();
		
		//JUGAR AL JOC
		//quan arribi a 10 preguntes finalitza el bucle
			Object[] nomPaisos = paisos.values().toArray();//creem una colecció amb .values i .toArray torna tots els elements
			
					for (int i = 0; i < preguntesTotal; i++) {//farà 10 preguntes
						Object pregAleatoria = nomPaisos[new Random().nextInt(nomPaisos.length)]; //agafem els values.
						System.out.println("Quina es la capital de " + pregAleatoria);
						String capitalJugador = entrada.next();
						
						for (String capitals : paisos.keySet()) {//comparem amb els keys
							
							if (pregAleatoria.equals(paisos.get(capitals))) {
								if(capitalJugador.equals(capitals)){//comparació de la pregunta del jugador amb les capitals
									punts++;
								System.out.println("Pregunta CORRECTE" + " " + punts + " punts.\n");
								
								}else {
									System.out.println("Pregunta FALLADA" + " " + punts + " punts.\n");
								}
								
								if(punts == 5) {
									System.out.println("GUAU PORTES 5 PUNTS.\n");
								}else if (punts == 8) {
									System.out.println("BESTIAL PORTES 8 PUNTS.\n");
								}else if (punts == 10) {
									System.out.println("PERFECT.\n");
								}
							}
					}
	}
					System.out.println("FI DE LA PARTIDA. GRÀCIES PER JUGAR A CAPITALS DEL MÓN.");
					System.out.println("El jugador " + nom + " ha fet una puntuació de: " + punts + " punts.");
				
					//FRASE A ESCRIURE A L'ARXIU CLASSIFICACIÓ
					frase = "El jugador " + nom + " ha fet una puntuació de: " + punts + " punts.\n";
					
					//ESCRITPURA DE ARXIUS
				try {
					FileWriter escriptura = new FileWriter("C:\\Users\\Usuario\\eclipse-workspace\\S1T3\\src\\S1T3N1E3main\\classificacio.txt", true);
					// en el cas que existeixi o no un fitxer "classificacio" em de possar true per anar afegin i no fer sobreescriptura
					//PrintWriter ArxiuA = new PrintWriter(escriptura);
					for(int i = 0; i < frase.length(); i++) {//i sigui es igual 0 i sigui menor que la longitud de la frase
						escriptura.write(frase.charAt(i));//cada volta del bucle escriu
				}
					escriptura.close();

				} catch (IOException e) {
					System.out.println("No s'ha trobat l'arxiu.");
}
	}		
}
	


