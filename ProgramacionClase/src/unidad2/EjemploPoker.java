package unidad2;

import java.util.Scanner;

public class EjemploPoker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * El programa leera 5 cartas de poker y
		 * tendra que detectar si ha salido un poker
		 * Corazon=H Picas=S Diamante=D Trebol=T
		 * As de diemante AD
		 * 5 de picas 5S
		 *
		 * carta1="4D"
		 *En ese caso carta1.charAT(0) seria 4
		 */
		
		//Variable que guarda la mano de poker
		
		Scanner teclado = new Scanner(System.in);
		String carta1="", carta2="", carta3="", carta4="", carta5="";
		
		System.out.println("Introduce la carta 1 (2-10 o JQKA seguido de HDST)");
		carta1 = teclado.next().toUpperCase();
		
		//Comprobamos que la longitud de la cadena este en el rango correcto
		if (!(carta1.length()<=3 && carta1.length()>=2))
		{
			System.out.println("Solo puedes introducir 2 o 3 caracteres");
			System.exit(-1);
			}
		
		//Si son dos caracteres comprobamos que el palo es correcto
		if ((carta1.length()==2 && !((carta1.charAt(1)== 'H') || (carta1.charAt(1)== 'T') ||  (carta1.charAt(1)== 'D') || (carta1.charAt(1)== 'S'))))  {
			System.out.println("Has introducido mal el palo");
			System.exit(-1);	
			
		}
		
		if ((carta1.length()==3 && !((carta1.charAt(2)== 'H') || (carta1.charAt(2)== 'T') ||  (carta1.charAt(2)== 'D') || (carta1.charAt(2)== 'S'))))  {
			System.out.println("Has introducido mal el palo");
			System.exit(-1);	
			
		}
		
		
		System.out.println("Introduce la carta 2 (2-10 o JQKA)");
		carta2 = teclado.next().toUpperCase();
		
		if (!(carta2.length()<=3 && carta2.length()>=2))
		{
			System.out.println("Solo puedes introducir 2 o 3 caracteres");
			System.exit(-1);
		}
			
		if ((carta2.length()==2 && !((carta2.charAt(1)== 'H') || (carta2.charAt(1)== 'T') ||  (carta2.charAt(1)== 'D') || (carta2.charAt(1)== 'S'))))  {
			System.out.println("Has introducido mal el palo");
			System.exit(-1);	
			
		}
		
		if ((carta2.length()==3 && !((carta2.charAt(2)== 'H') || (carta2.charAt(2)== 'T') ||  (carta2.charAt(2)== 'D') || (carta2.charAt(2)== 'S'))))  {
			System.out.println("Has introducido mal el palo");
			System.exit(-1);	
			
		}
		
		
		System.out.println("Introduce la carta 3 (2-10 o JQKA)");
		carta3 = teclado.next().toUpperCase();
		
		if (!(carta3.length()<=3 && carta3.length()>=2))
		{
			System.out.println("Solo puedes introducir 2 o 3 caracteres");
			System.exit(-1);
			}
		
		if ((carta3.length()==2 && !((carta3.charAt(1)== 'H') || (carta3.charAt(1)== 'T') ||  (carta3.charAt(1)== 'D') || (carta3.charAt(1)== 'S'))))  {
			System.out.println("Has introducido mal el palo");
			System.exit(-1);	
			
		}
		
		if ((carta3.length()==3 && !((carta3.charAt(2)== 'H') || (carta3.charAt(2)== 'T') ||  (carta3.charAt(2)== 'D') || (carta3.charAt(2)== 'S'))))  {
			System.out.println("Has introducido mal el palo");
			System.exit(-1);	
			
		}
		
		
		System.out.println("Introduce la carta 4 (2-10 o JQKA)");
		carta4 = teclado.next().toUpperCase();
		
		if (!(carta4.length()<=3 && carta4.length()>=2))
		{
			System.out.println("Solo puedes introducir 2 o 3 caracteres");
			System.exit(-1);
			}
		
		if ((carta4.length()==2 && !((carta4.charAt(1)== 'H') || (carta4.charAt(1)== 'T') ||  (carta4.charAt(1)== 'D') || (carta4.charAt(1)== 'S'))))  {
			System.out.println("Has introducido mal el palo");
			System.exit(-1);	
			
		}
		
		if ((carta4.length()==3 && !((carta4.charAt(2)== 'H') || (carta4.charAt(2)== 'T') ||  (carta4.charAt(2)== 'D') || (carta4.charAt(2)== 'S'))))  {
			System.out.println("Has introducido mal el palo");
			System.exit(-1);	
			
		}
		
		
		System.out.println("Introduce la carta 5 (2-10 o JQKA)");
		carta5 = teclado.next().toUpperCase();
		
		if (!(carta5.length()<=3 && carta5.length()>=2))
		{
			System.out.println("Solo puedes introducir 2 o 3 caracteres");
			System.exit(-1);
			}
		
		if ((carta5.length()==2 && !((carta5.charAt(1)== 'H') || (carta5.charAt(1)== 'T') ||  (carta5.charAt(1)== 'D') || (carta5.charAt(1)== 'S'))))  {
			System.out.println("Has introducido mal el palo");
			System.exit(-1);	
			
		}
		
		if ((carta5.length()==3 && !((carta5.charAt(2)== 'H') || (carta5.charAt(2)== 'T') ||  (carta5.charAt(2)== 'D') || (carta5.charAt(2)== 'S'))))  {
			System.out.println("Has introducido mal el palo");
			System.exit(-1);	
			
		}
		
		
		/*comprobamos si es un flush color
		 * Si comprabasemos si las cartas son iguales, cartax es un string
		 * y para comparalas se utilizaria la funcion .equals, seria
		 * carta1.equals
		 */
		
		if (carta1.charAt(1)==carta2.charAt(1) && carta1.charAt(1)==carta3.charAt(1) && carta1.charAt(1)==carta4.charAt(1) && carta1.charAt(1)==carta5.charAt(1))
		
		
		teclado.close();
	}

}