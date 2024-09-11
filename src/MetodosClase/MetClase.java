package MetodosClase;

import java.util.Scanner;

import EntradaSalida.TScanner;

public class MetClase {
	
	public static void numerCuadrado(){
		byte cont=1,dato;
		while(cont<=10) {
			dato=TScanner.leerBytes("Escribe un valor entero:");
			System.out.println(cont+".-"+dato+" cuadrado:" + Math.pow(dato, 2));
			cont++;
		}
	}
	

}
