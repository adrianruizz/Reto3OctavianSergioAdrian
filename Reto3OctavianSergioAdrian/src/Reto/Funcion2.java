package Reto;

public class Funcion2 {
	/* Cuenta las palabras que tiene una frase */
	public static int contarPalabras(String frase) {// 15
		int contador = 0;

		for (int i = 0; i < frase.length(); i++) {
			if (!Character.isWhitespace(frase.charAt(i)) && (i == 0 || Character.isWhitespace(frase.charAt(i - 1)))) {
				contador++;
			}
		}

		return contador;
	}

	/* Invierte el orden de las palabras en la frase */
	public static String invertirFrase(String frase) {
		String palabra = "";
		String invertida = "";

		for (int i = 0; i < frase.length(); i++) {
			if (!Character.isWhitespace(frase.charAt(i))) {
				palabra += frase.charAt(i);

			} else {
				invertida = palabra + " " + invertida;
				palabra = "";

			}
		}
		return invertida;

	}

	/* Muestra la palabra mas larga */
	public static String palabraLarga(String frase) {
		String palabra = "";
		String invertida = "";
		String palabralarga = "";
		for (int i = 0; i < frase.length(); i++) {
			if (!Character.isWhitespace(frase.charAt(i))) {
				palabra += frase.charAt(i);
				invertida = palabra + invertida;

				if (palabra.length() > palabralarga.length()) {
					palabralarga = palabra;
				}

			} else {
				palabra = "";
			}

		}
		return palabralarga;

	}

}
