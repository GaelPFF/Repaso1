package TestMetodosClase;

import MetodosClase.MetClase;
import MetodosClase.TScanner;
import TDA.Auto;

public class TestPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		creaObjetoAuto();
				
	}

	public static void creaObjetoAuto() {
		Auto objeto=new Auto();
		// capturar datos para almacenar en cada miembro
		
		objeto.setMarcaAuto(TScanner.leerString("Escribe marca de Auto: "));
		objeto.setColorAuto(TScanner.leerString("Color del Auto: "));
		objeto.setModeloAuto(TScanner.leerString("Escribe modelo de Auto: "));
		objeto.setAñoAuto(TScanner.leerShort("Escribe año del Auto: "));
		objeto.setNumllantasAuto(TScanner.leerBytes("Escribe numero de llantas del Auto: "));
		
		System.out.println(objeto.toString());
				
		
	}
}
