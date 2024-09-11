package TestMetodosClase;

import java.io.IOException;

import EntradaSalida.TBufferedReader;
import EntradaSalida.TJOption;
import EntradaSalida.TScanner;
import MetodosClase.MetClase;
import TDA.Auto;
import TDA.Futbolista;

public class TestPrincipal {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		menuObjetos();
				
	}

	public static String creaObjetoAuto() {
		// instancia
		Auto objeto=new Auto();
		// capturar datos para almacenar en cada miembro
		
		objeto.setMarcaAuto(TJOption.leerString("Escribe marca de Auto: "));
		objeto.setColorAuto(TJOption.leerString("Color del Auto: "));
		objeto.setModeloAuto(TJOption.leerString("Escribe modelo de Auto: "));
		objeto.setAñoAuto(TJOption.leerShort("Escribe año del Auto: "));
		objeto.setNumllantasAuto(TJOption.leerBytes("Escribe numero de llantas del Auto: "));
		
		//System.out.println(objeto.toString());
		return objeto.toString();		
		
	}
	public static String creaObjetoFutbolista() {
		// instancia
		Futbolista objeto=new Futbolista();
		// capturar datos para almacenar en cada miembro
		objeto.setNombreFutbolista(TJOption.leerString("Escribe el nombre del futbolista: "));
		objeto.setPosicionFutbolista(TJOption.leerString("Escribe que posicion juega el futbolista: "));
		objeto.setEquipoFutbolista(TJOption.leerString("Escribe en que equipo juega el futbolista: "));
		objeto.setColortenisFutbolista(TJOption.leerString("Escribe el color de tenis del futbolista"));
		objeto.setPieFutbolista(TJOption.leerString("Escribe el pie habil del futbolista: "));
		objeto.setNumeroFutbolista(TJOption.leerBytes("Escribe el numero de jugador: "));
		
		//System.out.println(objeto.toString());
		return objeto.toString();
				
		
	}
	
	public static void menuObjetos() {
	
		String cad= "Menu\n 1) Objeto Auto\n 2) Objeto Futbolista\n 3) Salir\n";
		cad+="Selecciona una opcion:";
		byte opcion;
		String unir_Obj="";
		do {
		opcion=TJOption.leerBytes(cad);
		switch(opcion) {
		case 1: System.out.println("Creacion de objeto de tipo Auto");
				 unir_Obj+=creaObjetoAuto()+"\n";
				break;
		case 2: System.out.println("Creacion de objeto de tipo Futbolista");
				 unir_Obj+=creaObjetoFutbolista()+"\n";
				break;
		case 3:TJOption.imprimir("Datos capturados:\n"+ unir_Obj);break;
		case 4: System.out.println("Fin del programa");
				break;
		default: System.out.println("Opcion incorrecta, intenta de nuevo");
				break;
		}// switch
			
		}while(opcion!=3);
	}// metodo menu
}
