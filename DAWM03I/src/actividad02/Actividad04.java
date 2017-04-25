package actividad02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author raulg
 *
 */

public class Actividad04 {

	/**Metodo principal del programa estructuras while/if
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		
		int a=3, b=3;
		
		while(a%2!=0){
			System.out.println("Introduzca el primer numero (ha de ser multiplo de 2)");
			BufferedReader br1 = new BufferedReader ( new InputStreamReader(System.in));
			String Oper1 = br1.readLine();
			a = Integer.parseInt(Oper1);
		}
		while(b%2!=0) {
			System.out.println("Introduzca el Segundo numero (ha de ser multiplo de 2)");
			BufferedReader br2 = new BufferedReader ( new InputStreamReader(System.in));
			String Oper2 = br2.readLine();
			b = Integer.parseInt(Oper2); ;
		}
		
		if (a>b){
			System.out.println(">Los multiplos de 2 entre a y b son: ");	
			System.out.println(b);
			while (a>b){
				b=b+2;
				System.out.println(b);
			} 
		} else if (b>a) {
			System.out.println(">Los multiplos de 2 entre a y b son: ");	
			System.out.println(a);
			while (b>a){
				a=a+2;
				System.out.println(a);
			}
			} else {
			System.out.println("ambos numeros son iguales, no hay multiplos de dos entre ambos");
		}
		}
		
	}

				
	
		
		



	

