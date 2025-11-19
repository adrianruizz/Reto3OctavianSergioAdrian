package Reto;

public class uwu {
	

		
		public static boolean estaLetraEnString(String palabra, char caracter) {//1
			String cha = String.valueOf(caracter);
			
			return palabra.contains(cha);
		}
		
		
		public static String pasarIntaString( int num) {//2
			String numero= String.valueOf(num);
			return numero;
		}
		
		
		public static int pasarStringaInt(String palabra) {//3
			int pala = Integer.parseInt(palabra);
			return pala;
		}
		
		
		public static int posicionLetra(String palabra, char caracter) {//4
			for (int i = 0; i < palabra.length(); i++) {
			 if (palabra.charAt(i)==caracter) {
				return i+1;
			}
			}return -1;	
		}
		
		
		public static String primeroAlfaString(String palabra1, String palabra2) {//5
			if (palabra1.compareTo(palabra2)<0) {
				return palabra1;
			}else if (palabra1==palabra2) {
				return palabra1;
			}return palabra2;
		}
		
		
		public static String capitalizar (String palabra) {//6
				return palabra.substring(0,1).toUpperCase()+palabra.substring(1).toLowerCase();
			}	
				
				
			
		public static String letraACambio(String palabrita) {//7
			return palabrita.replace("a", "*");
		}
		
		
		public static String numerosCambio(String palabra) {//8
			for (char i ='0' ; i <= '9'; i++) {
				palabra= palabra.replace(i, '*');
			}
			return palabra;
		}
		
		public static int vecesLetraing(String palabra, char caracter) {//9
			int contador=0;
			for (int i = 0; i < palabra.length(); i++) {
				if (palabra.charAt(i)==caracter) {
					contador++;
				}
			}return contador;
		}
		
		
		public static String invertirString(String palabra) {//10
			String resultado="";
			for (int i = 0; i < palabra.length(); i++) {
				char c= palabra.charAt(i);
				if (Character.isUpperCase(c)) {
					resultado+= Character.toLowerCase(c);
				}else if (Character.isLowerCase(c)) {
					resultado+= Character.toUpperCase(c);
				}
			}
			return resultado;
		}
		
		public static String intercalarMayusMinus(String palabra) {//11
			String resultado="";
			boolean mayus =true;
			for (int i = 0; i < palabra.length(); i++) {
				char c=palabra.charAt(i);
				
				if (mayus) {
					resultado+= Character.toUpperCase(c);
				}else {
					resultado+= Character.toLowerCase(c);
				}
				mayus =!mayus;
			}
			return resultado;
		}
		
		public static boolean comienzaAcabaString(String palabra, String inicio, String fin) {//12
		    return palabra.startsWith(inicio) && palabra.endsWith(fin);
		}
		
		public static String concatenarSeparador(String separador, String n1, String n2, String n3, String n4) {//13
		    return n1 + separador + n2 + separador + n3 + separador + n4;
		}
		
		public static int contarLetrasSinEspacios(String palabra) {//14
		    int contador = 0;

		    for (int i = 0; i < palabra.length(); i++) {
		        char c = palabra.charAt(i);

		        if (!Character.isWhitespace(c)) {
		            contador++;
		        }
		    }

		    return contador;
		}
		
		public static int contarPalabras(String palabra) {//15
		    int contador = 0;

		    for (int i = 0; i < palabra.length(); i++) {
		        if (!Character.isWhitespace(palabra.charAt(i)) &&
		            (i == 0 || Character.isWhitespace(palabra.charAt(i - 1)))) {
		            contador++;
		        }
		    }

		    return contador;
		}



		
		
		
		
		
		
		
		
		
	}



