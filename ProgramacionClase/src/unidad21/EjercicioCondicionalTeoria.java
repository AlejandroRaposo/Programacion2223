package unidad21;

public class EjercicioCondicionalTeoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Escribir un programa que tire un dado de 100 de forma 
		  aleatoria utilizando Math.random() y dependiendo del valor muestre
		   critico mayor de 90 + pifia menor de 17 
		   y muestre el valor del dado en todos los casos
		 */
		
int dado= (int) (Math.random()*100+1);

if (dado<17)    {
	System.out.println("Has sacdo un " + dado + " ,Pifia");
	
}
else if (dado>90)    {
	System.out.println("Has sacado un " + dado + " ,Critico");
}
else
	System.out.println("Has sacado un " + dado);
}
	}

