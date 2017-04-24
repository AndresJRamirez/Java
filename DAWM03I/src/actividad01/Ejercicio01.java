package actividad01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author raulg
 *
 */
public class Ejercicio01 {

	public static void main(String[] args) throws IOException {
		// Declaramos dos variables en las que almacenar valores númericos
		// las variables de tipo "int" nos permiten almacenar enteros
		int total_melones;
		int total_sandias;

		// guardamos valores enteros en las variables enteras
		total_melones = 10;
		total_sandias = 20;

		// modificamos el contenido de las variables enteras porque el granizo
		// las ha mermado
		total_melones = total_melones - 5;
		total_sandias = total_sandias - 2;

		// mostramos por consola el valor actual de las variables enteras
		System.out.println("Quedan " + total_melones + " melones despues del granizo");
		System.out.println("Quedan " + total_sandias + " sandias despues del granizo");

		// Mostramos un mensaje al usuario pidiendole que indique un numero por
		// consola
		System.out.println("Quantos melones te quieres comer?");
		// Declaramos una variable compleja de nombre "br" y de tipo
		// "BufferedReader".
		// Las variables del tipo "BufferedReader" contienen funciones para leer
		// datos por consola
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// utilizamos la función "readLine" de la variable "br" para leer un
		// dato por consola
		// guardamos el número introducido en la variable "valor_escrito"
		String valor_escrito = br.readLine();

		/*
		 * Convertimos la variable "valor_escrito" a un valor entero para poder
		 * operar con él y lo almacenamos en la variable "numero_melones_comer"
		 */
		int numero_melones_comer = Integer.parseInt(valor_escrito);

		total_melones = total_melones - numero_melones_comer;
		System.out.println("Finalmente quedan " + total_melones + " melones");
		System.out.println("Cuantas sandías se quieren comer");
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		String valor_escrito2 = br2.readLine();
		int numero_sandias_comer = Integer.parseInt(valor_escrito2);
		total_sandias = total_sandias - numero_sandias_comer;
		System.out.println("Finalmente quedan " + total_sandias + " sandias");

	}
}