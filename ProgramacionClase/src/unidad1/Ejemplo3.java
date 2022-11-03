package unidad1;

public class Ejemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=2, y=5;
		
		System.out.println(x);
		System.out.println(y);
		
		//operador de incremento (aumenta el numero en 1)
		x++;
		x=x+1;
		
		//operador de disminucion (disminuye el numero en 1)
		y--;
		y=y-1;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println((x+y)/y);
		System.out.println(x+y/y);
		
		int cantidad=9;
		//muestra por pantalla
		
		
		//Para generar un numero aleatorio utilizamos Math·ramdon()
		//
		
		float aleatorioFlo = (float) Math.random();
		double aleatorio = Math.random();
		System.out.println("El numero aleatorio es " + aleatorioFlo);
		
		//Si pones (int) para solo enteros
		System.out.println("El numero aleatorio s " + (int) (aleatorio*20+1));
		
		int numMelones = (int) (Math.random()*100+1);
				
				System.out.println("Hay " + numMelones + " y su modulo es " + numMelones%2);
	}

}
