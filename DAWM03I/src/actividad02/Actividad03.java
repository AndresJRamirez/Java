package actividad02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author raulg
 *
 */
public class Actividad03 {

	/**Metodo principal del programa, estructuras while
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		
		float a, b=0, res;
		System.out.println("Introduzca el dividendo");
		BufferedReader br1 = new BufferedReader ( new InputStreamReader(System.in));
		String Oper1 = br1.readLine();
		a = Float.parseFloat(Oper1);
		while(b==0){
			System.out.println("Introduzca el divisor (ha de ser distinto a 0)");
			BufferedReader br2 = new BufferedReader ( new InputStreamReader(System.in));
			String Oper2 = br2.readLine();
			b = Float.parseFloat(Oper2);
		}
		res= a/ b;
		System.out.println("el resultado de la division es: " + res);
	}
}
