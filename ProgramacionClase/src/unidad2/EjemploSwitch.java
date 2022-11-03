package unidad2;

public class EjemploSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Constantes de tipos de raza
		final String DES_HUMANO= "Eres un humano";
		final String DES_ELFO= "Eres un elfo";
		final String DES_ENANO= "Eres un enano";
		final String DES_TROLL= "Eres un troll";
		final String DES_REPTILIANO= "Eres una lagartija";
		final String DES_GNOMO= "No me hacen caso";
		
		int dado6 = (int) (Math.random()*6+1);
		
		System.out.println("Has sacado un " + dado6 + " en la tirada de raza");
		
		//El switch sirve para dependiendo de una unica variable ejecutar
		//instrucciones dependiendo de su valor
		
		switch (dado6) {
		case 1:
			System.out.println(DES_HUMANO);
			break;
		case 2:
			System.out.println(DES_ELFO);
			break;
		case 3:
			System.out.println(DES_ENANO);
			break;
		case 4:
			System.out.println(DES_TROLL);
			break;
		case 5:
			System.out.println(DES_REPTILIANO);
			break;
		case 6:
			System.out.println(DES_GNOMO);
			break;
		}

	}

}
