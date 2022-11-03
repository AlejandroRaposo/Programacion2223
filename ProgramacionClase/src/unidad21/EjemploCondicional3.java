package unidad21;

public class EjemploCondicional3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*En nuestra discoteca se podra entrar siempre que cumplas las siguien
		 * condiciones:
		 * 1-Ser mayor de edad obligatorio
		 * 2-Pagar la entrada de 10€ o ser VIP
		 * 3-llevar el dni o ser vip
		 * 4-no estar en una lista negra
		 * 5-Ir bien vestido y aseado o ser vip
		 */
		
		int edad = 19;
		double dineroBolsillo = 12.5;
		boolean llevoDni= true,perteneceLN=false;
		boolean bienVestido=true,vip=false;
		
		//Vamos a poner las condiciones a casa
		//:vip es lo mismo que vip==false
		if ((edad<18) || (dineroBolsillo<10) || (llevoDni==false && vip==false) || (perteneceLN==true) || (bienVestido==false && vip==false)) {
		System.out.println("A tu casa");}
		else {
			System.out.println("Bienvenido a tu casa");}
		
		//vip es igual a vip==true
		if ( (edad>=18) && !perteneceLN &&((dineroBolsillo>=10 && llevoDni && bienVestido))) ;
	}

}
