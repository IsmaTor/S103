package S1T3N1E3;

import java.io.IOException;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {


static Scanner entrada = new Scanner(System.in);

public static String jugador() {
	System.out.println("Indica el nom del jugador: ");
	String nom = entrada.next();
	return nom;
}

public static int joc() throws IOException {
	HashMap<String, String> LlistaPaisos = Arxiu.llegirArchiu();
	int preguntesTotal = 10;
	int punts = 0;
	String nom = "";
	
	Object[] nomPaisos = LlistaPaisos.values().toArray();//creem una colecció amb .values i .toArray torna tots els elements
	
	for (int i = 0; i < preguntesTotal; i++) {//farà 10 preguntes
		Object pregAleatoria = nomPaisos[new Random().nextInt(nomPaisos.length)]; //agafem els values.
		System.out.println("Quina es la capital de " + pregAleatoria);
		String capitalJugador = entrada.next();
		
		for (String capitals : LlistaPaisos.keySet()) {//comparem amb els keys
			
			if (pregAleatoria.equals(LlistaPaisos.get(capitals))) {
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
	return punts;
}
	
public static void main(String[] args) throws IOException {
	
	//variables
	int opcio = 0;
	String resposta = "";
	
	
	do {
		System.out.println("Benvingut al joc CAPITALS DEL MÓN \n"
				+ "1. JUGAR \n"
				+ "0. SALIR");
		opcio = entrada.nextInt();
		
		switch(opcio) {
		case 1:
			String nom = Main.jugador();
			int punts = Main.joc();
			Arxiu.escriureArxiu(nom, punts);
			 resposta = "";
			break;
		case 0:
			resposta = "Adeu";
			break;
		default:
			resposta = "ERROR: Opció invalida.";
			break;
		}
		System.out.println(resposta);
	}while (opcio != 0);	
}

	
	}





