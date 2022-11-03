package tareatema1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double a, b, c, x, xx;
		System.out.println("Este programa resuelve ecuaciones" +" " + "cuadrticas de la forma: Ax^2 + Bx + C = 0");
		System.out.println("Lo que tienes que hacer es" + " " + "teclear las variables conforme se te pidan.");
		System.out.println("(Recuerda que para evitar resultados con" +" numeros imaginarios, A debe ser diferente de 0 y B2 > 4AC)");
		
		System.out.println("Ingresa a: ") ;
		a = teclado.nextDouble() ;
		System.out.println("Ingresa b: ") ;
		b = teclado.nextDouble() ;
		System.out.println("Ingesa c: ") ;
		c = teclado.nextDouble() ;
		
		x = ((-b) + Math.sqrt(Math.pow(b,2) - (4 * a * c)) / (2 * a) );
		xx = ((-b) - Math.sqrt(Math.pow(b,2) - (4 * a * c)) / (2 * a) );
		
		System.out.println("X1 = " + x);
		System.out.println("X2 = " + xx);
        teclado.close();
	}

}
