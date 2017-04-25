package actividad02;

/**
 * @author raulg
 *
 */
public class Actividad02 {

	/**Metodo principal del programa
	 * @param args
	 */
	public static void main(String[] args) {
		
		double a=1, b=0.8, c=0.5; 
		System.out.println( "las botellas contienen ");
		System.out.println( a );
		System.out.println( b );
		System.out.println( c );
		System.out.println("Si pasamos 0.5 litros de la primera a la segunda");
		a=a-0.5;
		b=b+0.5;
		System.out.println("las botellas contendrian ");
		System.out.println( a );
		System.out.println( b );
		System.out.println( c );
		System.out.println("si ahora pasamos 0.3 de la segunda a la tercera");
		b=b-0.3;
		c=c+0.3;
		System.out.println("ahora contendrian");
		System.out.println( a );
		System.out.println( b );
		System.out.println( c );
		System.out.println("y por ultimo si pasamos 0.4 de la tercera a la primera ");
		a=a+0.4;
		c=c-0.4;
		System.out.println("el resultado final seria : ");
		System.out.println( a );
		System.out.println( b );
		System.out.println( c );
		
	}

}
