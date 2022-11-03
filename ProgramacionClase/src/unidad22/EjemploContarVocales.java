package unidad22;

public class EjemploContarVocales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Este programa leera una frase y contara las vocales que tiene la frase
		 * támbien leera una letra y contara
		 * la cantidad de veces que la latra está en la frase
		 */
		
		String frase="El mundo esta muy guapo hoy y tengo pizza pa come";
		//Para que reconozca las mayusculas
		frase=frase.toLowerCase();
		char letra='m';
		int numVocales=0, numRepet=0;
		
		//frase.charAT(5) devolvería la n
		
		//Recorremos todas las letras de la frase con charAT
		//Utilizando un bucle for
		
		
		//frese.length() cuenta la primera posición como 1 y charAT como 0 (Por lo que ponemos -1)
		for (int i=0;i<=(frase.length()-1); ++i)
		{
			//Para optimifar
			char letraActual=frase.charAt(i);
			
			if (letraActual==letra)
			{
				++numRepet;
			}
			if (letraActual=='a' || letraActual=='e' || letraActual=='i' || letraActual=='o' || letraActual=='u')
			{
				++numVocales;
			}
			
		}
			System.out.println("Se han encontrado " + numRepet + " 'm' repetidas y " + numVocales + " vocales");
		}
	
		

	}


