package Reto;

import java.util.Scanner;

public class Funcion1 {

	public static String capitalizarString(String palabra) { // te muestra la palabra con la primera letra en mayuscula y el resto en minuscula
		return palabra.substring(0, 1).toUpperCase() + palabra.substring(1).toLowerCase();
	}

	public static void nombres(Scanner sc) {// pide nombres hasta que de un espacio en blanco, te muestra la palabra de longitud menor y te dice que palabra es primera alfanumericamente
		String nombre = "";
		String menor = "ZZZZZZZZZZZZZZZZZZZZZ";
		String primera = "";
		do {

			System.out.println("Dame un nombre");
			nombre = sc.nextLine();
			if (!nombre.equals("")) {
				System.out.println(capitalizarString(nombre));

				if ((!nombre.equals(" ")) || (nombre.compareTo(primera) > 0)) {
					primera = nombre;
				}
		

				if (!nombre.equals(" ")) {
					if (nombre.length() < menor.length()) {

						menor = nombre;
					}
				}

			}
		} while (!nombre.equals(""));
		System.out.println("la palabra mas corta es " + menor);
		System.out.println("la primera palabra alfabeticamente es " + primera);
	}

}
