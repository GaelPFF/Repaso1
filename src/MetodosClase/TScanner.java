package MetodosClase;

import java.util.Scanner;

public class TScanner {

	static Scanner leer=new Scanner(System.in);
	public static byte leerBytes(String msje) {
		System.out.println(msje+"byte:"+Byte.MIN_VALUE+".."+Byte.MAX_VALUE);
		return leer.nextByte();
	}
	public static short leerShort(String msje) {
		System.out.println(msje+"short:"+Short.MIN_VALUE+".."+Short.MAX_VALUE);
		return leer.nextShort();
	}
	public static int leerInt(String msje) {
		System.out.println(msje+"int:"+Integer.MIN_VALUE+".."+Integer.MAX_VALUE);
		return leer.nextInt();
	}
	public static long leerLong(String msje) {
		System.out.println(msje+"long:"+Long.MIN_VALUE+".."+Long.MAX_VALUE);
		return leer.nextLong();
	}
	public static float leerFloat(String msje) {
		System.out.println(msje+"float:"+Float.MIN_VALUE+".."+Float.MAX_VALUE);
		return leer.nextFloat();
	}
	public static double leerDouble(String msje) {
		System.out.println(msje+"double:"+Double.MIN_VALUE+".."+Double.MAX_VALUE);
		return leer.nextDouble();
	}
	public static String leerString(String msje) {
		System.out.println(msje);
		return leer.next();
	}
	public static char leerChar(String msje) {
		System.out.println(msje);
		return leer.next().charAt(0);
	}
}
