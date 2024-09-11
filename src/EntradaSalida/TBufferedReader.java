package EntradaSalida;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TBufferedReader {
	
	static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	
	public static byte leerByte(String msje)throws IOException {
		System.out.println(msje);
		return Byte.parseByte(input.readLine());
	}
	public static short leerShort(String msje)throws IOException {
		System.out.println(msje);
		return Short.parseShort(input.readLine());
	}
	public static int leerInt(String msje)throws IOException {
		System.out.println(msje);
		return Integer.parseInt(input.readLine());
	}
	public static long leerLong(String msje)throws IOException {
		System.out.println(msje);
		return Long.parseLong(input.readLine());
	}
	public static float leerFloat(String msje)throws IOException {
		System.out.println(msje);
		return Float.parseFloat(input.readLine());
	}
	public static char leerChar(String msje)throws IOException {
		System.out.println(msje);
		return input.readLine().charAt(0);
	}
	public static String leerString(String msje)throws IOException {
		return input.readLine();
	}
	public static void limpiabuffer()throws IOException{
		input.readLine();
		input.close();
	}

}
