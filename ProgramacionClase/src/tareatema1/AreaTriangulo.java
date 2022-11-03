package tareatema1;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		double base;
		System.out.println("Introduce la base del triangulo en centrimetros");
		base=teclado.nextDouble();
		double altura;
		System.out.println("Introduce la altura del triangulo en centimetros");
		altura=teclado.nextDouble();
		double area=((base * altura)/2);
		
		
		System.out.println("El area del triangulo es " + area + " centimetros cuadrados" );
		
		teclado.close();
		
		
		
		

	}

}
