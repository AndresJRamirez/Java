package actividad03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author raulg
 *
 */
public class Ejercicio01 {

	/**
	 * Principal Class Method
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		int s;
		double res;
		do {
			System.out.println("Que operacion desea realizar");
			System.out.println("1 Convertir Euros a Linkia Coins");
			System.out.println("2 divide dos numeros");
			System.out.println("3 multiplica y realiza progresion");
			System.out.println("4 salir");
			s = pideEntero();

			switch (s) { // mediante un switch ejecutamos la opcion deseada por
							// el usuario
			case 1:
				res = conversorEuroLinkia();
				System.out.println(res + " linkia coins");
				break;
			case 2:
				res = divideDosNumeros();
				System.out.println(res + " resultado de la division");
				break;
			case 3:
				multiplicaYProgresion();
				break;
			case 4:
				System.out.println("bye bye");
				System.exit(4);
				break;
			default: 
				System.out.println("Seleccion no valida, introduzca otro valor");
				break;
			}
		} while (s >= 1 || s <= 4);
	}

	
	/**Function to introduce a integer and return it
	 * @return a integer introduced by keyboard
	 * @throws IOException
	 */
	public static int pideEntero() throws IOException {
		int x = 0;
		System.out.println("Seleccione una opcion");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String cadena = br.readLine();
		try {
			x = Integer.parseInt(cadena);
		} catch (NumberFormatException Ex) {
			System.out.println("No has introducido un numero entero");
			x = pideEntero();
		}
		return x;
	}

	
	/**Function to introduce a double and return it
	 * @param recibe a text string for user question
	 * @return a double introduced by keyboard
	 * @throws IOException
	 */
	public static double pideDouble(String text) throws IOException {
		double y = 0;
		System.out.println(text);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String cadena = br.readLine();
		try {
			y = Double.parseDouble(cadena);
		} catch (NumberFormatException Ex) {
			System.out.println("No has introducido un double");
			y = pideDouble("Introduce un valor Double");
		}
		return y;
	}

	/**Function to introduce a integer and return it
	 * @param recibe a text string for user question
	 * @return a double introduced by keyboard
	 * @throws IOException
	 */
	public static int pideEntero(String text) throws IOException {
		int z = 0;
		System.out.println(text);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String cadena = br.readLine();
		try {
			z = Integer.parseInt(cadena);
		} catch (NumberFormatException Ex) {
			System.out.println("No has introducido un numero entero");
			z = pideEntero();
		}
		return z;
	}


	/**Function to convert € to linkia coins 1€=0.5linkia coins
	 * @return a double converted to linkia coins
	 * @throws IOException
	 */
	public static double conversorEuroLinkia() throws IOException {
		double x = pideDouble("Introduce los euros a convertir");
		x = x * 0.5;
		return x;
	}

	
	/**Function to divide to doubles introduced by the user
	 * @return a double, result of the division 
	 * @throws IOException
	 */
	public static double divideDosNumeros() throws IOException {
		double a = pideDouble("primer valor");
		double b = pideDouble("Segundo valor");
		while (b == 0) {
			System.out.println("no puedes dividir por cero");
			b = pideDouble("Introduce el segundo valor (distinto a 0)");
		}
		double c = a / b;
		return c;
	}

	
	/**Function to multiplicate 2 integers and show the arithmetical progression between us
	 * @throws IOException
	 */
	public static void multiplicaYProgresion() throws IOException {
		int a = pideEntero("Introduce el primer valor");
		int b = pideEntero("Introduce el segundo valor");
		int c = b * a;
		if (c == 0) {
			System.out.println("Si uno de los valores es 0 el resultado es 0 y no hay progresion");
			return;
		}
		System.out.println("el resultado de la multiplicacion es " + c);
		progresionDescendiente(a, b);
	}

	/**Function to show the arithmetical progression between 2 integers
	 * @param a integer
	 * @param b a integer
	 */
	public static void progresionDescendiente(int a, int b) {
		if (a > b) {
			System.out.println("La progresion descendiente entre a y b es ");
			System.out.println(a);
			while (a > b) {
				a = a - b;
				System.out.println(a);
			}
		} else if (b > a) {
			System.out.println("La progresion descendiente entre b y a es ");
			System.out.println(b);
			while (b > a) {
				b = b - a;
				System.out.println(b);
			}
		} else {
			System.out.println("Los numeros son iguales, no hay progresion");
		}
	}
}
