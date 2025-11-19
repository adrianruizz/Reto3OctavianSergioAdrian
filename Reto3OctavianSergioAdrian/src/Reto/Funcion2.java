package Reto;

public class Funcion2 {

	public static int contarPalabras(String frase) {// 15
		int contador = 0;

		for (int i = 0; i < frase.length(); i++) {
			if (!Character.isWhitespace(frase.charAt(i)) && (i == 0 || Character.isWhitespace(frase.charAt(i - 1)))) {
				contador++;
			}
		}

		return contador;
	}

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

	public static String palabraLarga(String frase) {
		String palabra = "";
		String invertida = "";
		String palabralarga = "";
		for (int i = 0; i < frase.length(); i++) {
			if (!Character.isWhitespace(frase.charAt(i))) {
				invertida=palabra+invertida;
				
				if (palabra.length()>palabralarga.length()) {
					palabralarga=palabra;
				}
				palabra="";
			}
			else {
				palabra += frase.charAt(i);
			}
			

		
		
}
		return palabralarga;

	
	}
	


}
