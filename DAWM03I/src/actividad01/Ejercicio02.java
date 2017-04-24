package actividad01;

/**
 * @author raulg
 *
 */
public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Parte 1 tipos de datos//

		// byte//
		byte Variablebyte = 100;
		System.out.println(
				"Tipo de datos BYTE: se utilizan 8 bits para almacenar el dato, desde por ejemplo " + Variablebyte);
		// Short//
		short Variableshort = 25640;
		System.out.println("Tipo de datos SHORT: dato de 16 bits de longitud (independientemente de la plataforma) "
				+ "por ejemplo " + Variableshort);
		// int//
		int Variableint = 299860;
		System.out.println("Tipo de datos INT: dato de 32 bits de longitud (independientemente de la plataforma)"
				+ " por ejemplo " + Variableint);
		// long//
		long Variablelong = 58954789;
		System.out.println("Tipo de datos LONG: dato de 64 bits de longitud (independientemente de la plataforma)"
				+ "por ejemplo " + Variablelong);
		// char//
		char Variablechar = 65000;
		System.out.println("Tipo de datos CHAR: Este rango es para representar numeros en unicode, los ASCII se "
				+ "representan con los valores del 0 al 127. ASCII es un subconjunto de caracteres Unicode"
				+ "por ejemplo " + Variablechar);
		// float//
		float Variablefloat = 3.1416f;
		System.out.println("Tipo de datos FLOAT: Dato en coma flotante de 32 bits en formato IEEE 754 (1 bit de signo,"
				+ " 8 para el exponente y 24 para la mantisa) por ejemplo " + Variablefloat);
		// double//
		double Variabledouble = 3.1416122789;
		System.out.println("Tipo de datos DOUBLE: Dato en coma flotante de 64 bits en formato IEEE 754 (1 bit de signo,"
				+ " 11 para el exponente y 52 para la mantisa) por ejemplo " + Variabledouble);
		// boolean//
		boolean Variableboolean = false;
		System.out
				.println("Tipo de datos BOOLEAN: Utilizado para evalusar si el resultado de una expresion booleanas es"
						+ " verdadero (true) o falso (false) por ejemplo: " + Variableboolean);

		// Ejemplos de uso de operadores aritmeticos, relacionales, logicos
		// unitarios y de asignacion//

		// Operadores Aritmeticos//
		// "+" , se utiliza para sumar valores//
		int a = 10;
		int b = 5;
		int c = a + b;
		System.out.println(" el operador + se utiliza para sumar valores, por ejemplo: 10+5=" + c);
		// "-" , se utiliza para restar valores//
		int c1 = a - b;
		System.out.println(" el operador - se utiliza para restar valores por ejemplo: 10-5=" + c1);

		// "*" , se utiliza para multiplicar valores//
		int c2 = a * b;
		System.out.println(" el operador * se utiliza para multiplicar valores, por ejemplo: 10*5=" + c2);
		// "/" , se utiliza para dividir valores//
		int c3 = a / b;
		System.out.println(" el operador / se utiliza para dividir valores, por ejemplo: 10/5=" + c3);
		// "%" , se utiliza para el modulo o resto de una division entera//
		int c4 = a % b;
		System.out.println(" el operador % se utiliza para el resto de una division entera, por ejemplo: 10/5=" + c4);
		// Operadores Relacionales//

		// "<" Indica con "true" o "false" si un valor es menor que otro//
		int d = 3, e = 6;
		boolean res;
		res = d < e;
		System.out.println(
				" el operador < se utiliza para indicar si un valor es menor que otro" + ", por ejemplo: 3<6=" + res);
		// "<" Indica con "true" o "false" si un valor es mayor que otro//
		boolean res2;
		res2 = d > e;
		System.out.println(
				" el operador > se utiliza para indicar si un valor es mayor que otro" + ", por ejemplo: 3>6=" + res2);
		// "<=" Indica con "true" o "false" si un valor es menor o igual que
		// otro//
		boolean res3;
		res3 = d <= e;
		System.out.println(" el operador <= se utiliza para indicar si un valor es menor o igual que otro"
				+ ", por ejemplo: 3<=6=" + res3);
		// ">=" Indica con "true" o "false" si un valor es mayor o igual que
		// otro//
		boolean res4;
		res4 = d >= e;
		System.out.println(" el operador >= se utiliza para indicar si un valor es mayor o igual que otro"
				+ ", por ejemplo: 3>=6=" + res4);
		// "!=" Indica con "true" o "false" si dos valores son distintos//
		boolean res5;
		res5 = d != e;
		System.out.println(
				" el operador != se utiliza para indicar dos valores son distintos" + ", por ejemplo: 3!=6=" + res5);
		// "= =" Indica con "true" o "false" si dos valores son iguales//
		boolean res6;
		res6 = d == e;
		System.out.println(" el operador = = se utiliza para indicar si un valor es menor o igual que otro"
				+ ", por ejemplo: 3==6=" + res6);

		// Operadores Logicos//
		// && o & El resultado sera true si ambos operandos son true y false en
		// caso contrario//
		int f = 4, g = 7;
		boolean resl;
		resl = f > g & g > f;
		System.out.println("A & B el resultado sera true si ambos operandos los son, en caso contrario"
				+ " sera false ejemplo 4>7 & 7>4= " + resl);
		// || o | El resultado sera true si ambos operandos son true y false en
		// caso contrario//
		boolean resl2;
		resl2 = f > g | g > f;
		System.out.println("A | B el resultado sera true si ambos operandos los son, en caso contrario"
				+ " sera false ejemplo 4>7 | 7>4= " + resl2);
		// ! Not A Si el operando es true el resultado es false y si el operando
		// es false el resultado es true//
		boolean resl3;
		resl3 = !(f > g);
		System.out.println(
				"! A>B Si el operando es true, el resultado sera false y vicerversa, por ejemplo !(4>7)=" + resl3);
		// ^ A XOR B El resultado sera true si un operando es true y el otro
		// false y false en caso contrario//
		boolean resl4;
		resl4 = f > g ^ g > f;
		System.out.println("El resultado sera true si un operando es true y el otro false y false en caso contrario,"
				+ " por ejemplo 4>7 ^ 7>4 =" + resl4);

		// Operadores Unitarios o Unarios//
		// ~ Complemento a 1 de A//
		int h = 10;
		int resu;
		resu = ~h;
		System.out.println("EL operador ~ calcula el complemento a 1 de un operando, por ejemplo " + "~10=" + resu);
		// - se utiliza para cambiar de signo un operando//
		int resu2;
		resu2 = -h;
		System.out.println(
				"El operador - se utiliza para cambiar el signo de un operando, por ejemplo " + "-10=" + resu2);
		// ++ incremento de A//
		int resu3;
		resu3 = ++h;
		System.out.println(
				"El operador ++ se utiliza para aumentar en 1 el valor de un operando, por ejemplo " + "++10=" + resu3);
		// -- decremento de A//
		int i = 10;
		int resu4;
		resu4 = --i;
		System.out.println("El operador -- se utiliza para decrementar en 1 el calor de un operando, por ejemplo"
				+ "--10=" + resu4);

	}

}
