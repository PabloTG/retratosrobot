package retratosrobot;

import java.util.Scanner;

public class RetratosRobot {

	public static void main(String[] args) {
		// Declaro las variables que necesitaré
		String pelo, ojos, nariz, boca, barbilla = null;
		// repetirRetratos servirá para crear más de un retrato con un solo inicio de programa.
		int repetirRetratos = 1;
		 while (repetirRetratos == 1) {
		// Declaro los componentes de las caras
		String pelo1 ="WWWWWWWWW", pelo2 = "\\\\\\//////", pelo3 = "|\"\"\"\"\"\"\"|", pelo4 = "|||||||||";
		String ojos1 = "| 0   0 |", ojos2 = "|-(. .)-|", ojos3 = "|-(o o)-|", ojos4 = "| \\   / |";
		String nariz1 = "@   J   @", nariz2 = "{   \"   }", nariz3 = "[   j   ]", nariz4 ="<   -   >";
		String boca1 = "|  ===  |", boca2 = "|   -   |", boca3 = "|  ___  |", boca4 = "|  ---  |";
		String barbilla1 = "\\_______/", barbilla2 = "\\,,,,,,,/";
		
		// Pido los componentes por teclado, empezando por el pelo.
		Scanner entrada = new Scanner(System.in);
		System.out.println("Vamos a crear un nuevo retrato robot.\nPor favor, seleccione el pelo: ");
		System.out.println("Pelo 1: " + pelo1 + "\nPelo 2: " + pelo2 + "\nPelo 3: " + pelo3 + "\nPelo 4: " + pelo4);
		switch (entrada.next()) {
		case "1": pelo = pelo1; break;
		case "2": pelo = pelo2; break;
		case "3": pelo = pelo3; break;
		case "4": pelo = pelo4; break;
		default: pelo = pelo1; System.out.println("Sólo se aceptan los números del 1 al 4; se escoge el tipo 1 por defecto.");
		}// fin switch pelo

		// Pido los ojos.
		System.out.println("Por favor, seleccione los ojos: ");
		System.out.println("Ojos 1: " + ojos1 + "\nOjos 2: " + ojos2 + "\nOjos 3: " + ojos3 + "\nOjos 4: " + ojos4);
		switch (entrada.next()) {
		case "1": ojos = ojos1; break;
		case "2": ojos = ojos2; break;
		case "3": ojos = ojos3; break;
		case "4": ojos = ojos4; break;
		default: ojos = ojos1; System.out.println("Sólo se aceptan los números del 1 al 4; se escoge el tipo 1 por defecto.");
		}// fin switch ojos
		
		// Pido la nariz.
		System.out.println("Por favor, seleccione la nariz: ");
		System.out.println("Nariz 1: " + nariz1 + "\nNariz 2: " + nariz2 + "\nNariz 3: " + nariz3 + "\nNariz 4: " + nariz4);
		switch (entrada.next()) {
		case "1": nariz = nariz1; break;
		case "2": nariz = nariz2; break;
		case "3": nariz = nariz3; break;
		case "4": nariz = nariz4; break;
		default: nariz = nariz1; System.out.println("Sólo se aceptan los números del 1 al 4; se escoge el tipo 1 por defecto.");
		}// fin switch nariz
		
		// Pido la boca.
		System.out.println("Por favor, seleccione la boca: ");
		System.out.println("Boca 1: " + boca1 + "\nBoca 2: " + boca2 + "\nBoca 3: " + boca3 + "\nBoca 4: " + boca4);
		switch (entrada.next()) {
		case "1": boca = boca1; break;
		case "2": boca = boca2; break;
		case "3": boca = boca3; break;
		case "4": boca = boca4; break;
		default: boca = boca1; System.out.println("Sólo se aceptan los números del 1 al 4; se escoge el tipo 1 por defecto.");
		}// fin switch boca
		
		// Pido la barbilla.
		System.out.println("Por favor, seleccione la barbilla: ");
		System.out.println("Barbilla 1: " + barbilla1 + "\nBarbilla 2: " + barbilla2);
		switch (entrada.next()) {
		case "1": barbilla = barbilla1; break;
		case "2": barbilla = barbilla2; break;
		default: barbilla = barbilla1; System.out.println("Sólo se axceptan los números 1 y 2; se escoge el tipo 1 por defecto.");
		}// fin switch barbilla
		
		// Muestro el resultado por consola.
		System.out.println("Éste es su retrato robot:");
		System.out.println(pelo + "\n" + ojos + "\n" + nariz + "\n" + boca + "\n" + barbilla);
		
		/* Permito crear otro retrato robot, utilizando repetirRetratos y un nuevo while. Al
		 asignar el valor 2 a repetirRetratos, el nuevo bucle permitirá decidir si se quiere
		 dibujar otro retrato robot o no. El valor 0 para repetirRetratos es más o menos aleatorio,
		 y serviría otro cualquiera. */
		repetirRetratos = 2;
		while (repetirRetratos == 2) {
		System.out.println("¿Desea crear otro retrato robot? S/N");
		switch (entrada.next()) {
		case "S": repetirRetratos = 1; break;
		case "N": repetirRetratos = 0; break;
		default: System.out.println("Sólo se reconocen los símbolos S y N para \"Sí\" y \"No\"");
		}// fin switch Sí/No
		
		}//fin while repetir
		
		}// fin while principal
		 
	}// fin main

}// fin RetratosRobot
