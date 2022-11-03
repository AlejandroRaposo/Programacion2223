package tareatema1;

import java.util.Scanner;

public class TareaImpuesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
float sueldobruto;
float impuesto; 


System.out.println("Introduce tu sueldo bruto");
sueldobruto=teclado.nextFloat();

System.out.println("Introduce el impuesto");
impuesto=teclado.nextFloat();

System.out.println("Tu sueldo neto es " + sueldobruto*(1-(impuesto/100)));

teclado.close();


	}

}
