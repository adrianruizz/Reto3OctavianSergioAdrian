package Reto;

import java.util.Scanner;

public class Funcion3 {
  //Funcion mostrar numeros en una frase
	public static String numerosEnFrase(String digito) {

		String nueva = "";
		boolean primera = true;
		for (int i = 0; i < digito.length(); i++) {
			char c = digito.charAt(i);
			if (Character.isDigit(c)) {
				if (primera) {
					nueva = nueva + c;
					primera = false;
				} else {
					nueva = nueva + "," + c;
				}

			}
		}
		return nueva;

	}

	
	
	// Funcion contar vocales de un texto y decir que palabra tiene mas
	
	public static int ContarVocales(String texto) {
		int contador = 0;
		
		String vocales = "aeiuo";
		String textoMinusculas = texto.toLowerCase();
		for (int i = 0; i < textoMinusculas.length(); i++) {
			char palabra = textoMinusculas.charAt(i);
			if (vocales.indexOf(textoMinusculas)) {
				contador++;
			}
			
				
			}
		
		return contador;
	}

}
