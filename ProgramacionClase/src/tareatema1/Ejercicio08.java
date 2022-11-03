package tareatema1;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double numero1;
double numero2;
double numero3;

Scanner teclado = new Scanner(System.in);

System.out.println("Introduce 1º numero");
numero1=teclado.nextDouble();
System.out.println("Intruduce 2º numero");
numero2=teclado.nextDouble();
System.out.println("Introduce 3º numero");
numero3=teclado.nextDouble();
System.out.println("La media es: " + (numero1 + numero2 + numero3)/3);
teclado.close();

	}

}
