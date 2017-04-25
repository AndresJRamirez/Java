package actividad02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author raulg
 *
 */
public class Actividad05 {

	/**Metodo principal del programa estrucutras do/while y switch
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		
		double cuenta1=0, cuenta2=0;
		int x =1, y;
		
		do {
			
			System.out.println("1 - Añadir dinero a la primera cuenta");
			System.out.println("2 - Añadir dinero a la segunda cuenta");
			System.out.println("3 - Quitar dinero de la primera cuenta");
			System.out.println("4 - Quitar dinero de la segunda cuenta");
			System.out.println("5 - Traspasar dinero de la primera a la segunda cuenta");
			System.out.println("0 - Finalizar");
	
			BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
			String Oper = br.readLine();
			x = Integer.parseInt(Oper);
	
			switch (x){
			
			default:
				System.out.println("Seleccion no valida, introduzca otro valor");
				break;
			case 1:
				System.out.println("Introduzca la cantidad");
				BufferedReader br1 = new BufferedReader ( new InputStreamReader(System.in));
				String Oper1 = br1.readLine();
				y = Integer.parseInt(Oper1);
				cuenta1= cuenta1 + y;
				System.out.println("cantidad en la cuenta 1 : " + cuenta1);
				System.out.println("cantidad en la cuenta 2 : " + cuenta2);
				break;
			case 2:	
				System.out.println("Introduzca la cantidad");
				BufferedReader br2 = new BufferedReader ( new InputStreamReader(System.in));
				String Oper2 = br2.readLine();
				y = Integer.parseInt(Oper2);
				cuenta2= cuenta2 + y;
				System.out.println("cantidad en la cuenta 1 : " + cuenta1);
				System.out.println("cantidad en la cuenta 2 : " + cuenta2);
				break;
			case 3: 
				System.out.println("Introduzca la cantidad");
				BufferedReader br3 = new BufferedReader ( new InputStreamReader(System.in));
				String Oper3 = br3.readLine();
				y = Integer.parseInt(Oper3);
				cuenta1= cuenta1 - y;
				System.out.println("cantidad en la cuenta 1 : " + cuenta1);
				System.out.println("cantidad en la cuenta 2 : " + cuenta2);
				break;
			case 4:
				System.out.println("Introduzca la cantidad");
				BufferedReader br4 = new BufferedReader ( new InputStreamReader(System.in));
				String Oper4 = br4.readLine();
				y = Integer.parseInt(Oper4);
				cuenta2= cuenta2 - y;
				System.out.println("cantidad en la cuenta 1 : " + cuenta1);
				System.out.println("cantidad en la cuenta 2 : " + cuenta2);
				break;
			case 5:
				System.out.println("Introduzca la cantidad");
				BufferedReader br5 = new BufferedReader ( new InputStreamReader(System.in));
				String Oper5 = br5.readLine();
				y = Integer.parseInt(Oper5);
				cuenta1= cuenta1 + y;
				cuenta2= cuenta2 - y;
				System.out.println("cantidad en la cuenta 1 : " + cuenta1);
				System.out.println("cantidad en la cuenta 2 : " + cuenta2);
				break;
			case 0:
				System.out.println("hasta pronto");
				System.exit(0);
				}
		} while (x>=0 || x<=5);
	
	}	
}
