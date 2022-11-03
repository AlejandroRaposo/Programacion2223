package unidad1;

public class Ejemplocadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String asignatura="Programación";
		int pos=3;
	
		System.out.println("Longitud" + asignatura.length());
		System.out.println("Letra en posición " + pos + " es " +asignatura.charAt(pos-1));
		
		//Para concatenar cadenas usamos concat
		System.out.println(asignatura.concat(" es dificil"));
		
		//Pasar una cadena a mayusculas
		System.out.println(asignatura.toUpperCase());
		
		//Mostrar el caracter en una posicion en particular
		//La posicion empieza en 0 no 1
		System.out.println(asignatura.charAt(5));
		
		String horas=("Tiene ocho horas semanales ");
		
		//Busqueda de palabras en un string
		System.out.println("La palabra esta en la posicion ");
		
		//Subtituye de una cadena por 
		System.out.println(horas.replaceAll("ocho", "diez"));
		
		
		
	}


}
