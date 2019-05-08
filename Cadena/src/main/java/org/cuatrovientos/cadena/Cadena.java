package org.cuatrovientos.cadena;

public class Cadena {
	
	
	
	public int longitud(String cadena) {
		return cadena.length();
	}
	
	public int vocales(String cadena) {
		int contador = 0;
		for(int i=0;i<cadena.length();i++) {
			  if ((cadena.charAt(i)=='a') || (cadena.charAt(i)=='e') || (cadena.charAt(i)=='i') || (cadena.charAt(i)=='o') || (cadena.charAt(i)=='u')){
			    contador++;
			  }
			}
		return contador;
	}
	
	public String invertir(String cadena) {
		String cadenaInvertida = "";
		for (int i=cadena.length()-1;i>=0;i--) {
			cadenaInvertida = cadenaInvertida + cadena.charAt(i);
			}
		return cadenaInvertida;
	}
	
	public int contarLetra(String cadena, char caracter) {
		int posicion,contador = 0;
		posicion = cadena.indexOf(caracter);
        while (posicion != -1) { 
            contador++;                       
            posicion = cadena.indexOf(caracter, posicion + 1);
        }
        return contador;
}
	}


