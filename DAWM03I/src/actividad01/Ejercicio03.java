package actividad01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author raulg
 *
 */
public class Ejercicio03 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		float total;
		System.out.println("Escribe el numero que desees multiplicar x 10");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String valor_introducido = br.readLine();
		float res = Float.parseFloat(valor_introducido);
		total = res * 10;
		System.out.println("el resultado es " + total);
	}
}
