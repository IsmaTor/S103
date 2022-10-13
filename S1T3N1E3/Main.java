package S1T3N1E3;

import java.io.IOException;
import java.util.Scanner;

public class Main {

static Scanner entrada = new Scanner(System.in);
	
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
			 Arxiu.llegirArchiu();
			 Arxiu.preguntes();
			 Arxiu.escriureArxiu();
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



