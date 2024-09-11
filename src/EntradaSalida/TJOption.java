package EntradaSalida;

import javax.swing.JOptionPane;

public class TJOption {

	public static byte leerBytes(String msje){
		return Byte.parseByte(JOptionPane.showInputDialog(null,msje,"Lectura byte", JOptionPane.QUESTION_MESSAGE));
	}
	public static short leerShort(String msje){
		return Short.parseShort(JOptionPane.showInputDialog(null,msje,"Lectura short", JOptionPane.QUESTION_MESSAGE));
	}
	public static long leerLong(String msje){
		return Long.parseLong(JOptionPane.showInputDialog(null,msje,"Lectura long", JOptionPane.QUESTION_MESSAGE));
	}
	public static char leerChar(String msje){
		return JOptionPane.showInputDialog(null,msje,"Lectura short", JOptionPane.QUESTION_MESSAGE).charAt(0);
	}
	public static String leerString(String msje){
		return JOptionPane.showInputDialog(null,msje,"Lectura short", JOptionPane.QUESTION_MESSAGE);
	}
	public static void imprimir(String msje) {
		JOptionPane.showMessageDialog(null, msje, "Salida", JOptionPane.PLAIN_MESSAGE);
	}
	
}
