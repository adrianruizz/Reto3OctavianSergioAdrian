package Reto;

import java.util.Scanner;

public class Funcion3 {

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

	
	
	
	
	public static int vocalesString(String texto) {
		int contador = 0;
		int maxvocales = 0;
		int minvocales = 0;
		String textoMinusculas = texto.toLowerCase();
		for (int i = 0; i < textoMinusculas.length(); i++) {
			char c = textoMinusculas.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				contador++;
			}
			for (int j = minvocales; j < maxvocales; j++) {

				if (maxvocales >minvocales) {
					return maxvocales;
				}
				
			}
		}
		return maxvocales;
	}

}
