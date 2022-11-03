package unidad21;

public class EjemploBeca6000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Mayor de 16 años
		 * renta entre 15000 y menor de 30000 € anuales
		 * sin suspensos
		 * sin trabajo
		 */
		int edad=16;
		boolean resultadoBeca=false;
		double renta=16000;
		int suspensos=0;
		boolean trabajo=false;
		
		if (edad>=16) {
			if (renta>=15000 && renta<30000) {
				if (suspensos==0) {
					if (!trabajo) {
			resultadoBeca=true;
					}
				}
			}
		}
		
		resultadoBeca=false;
		
		if (edad>=16 && (renta>=15000 && renta<30000) && suspensos==0 && (!trabajo))
			resultadoBeca=true;
		
		
		resultadoBeca=true;
		
		if (edad<16 || (renta<15000 || renta>=30000) || suspensos>0 || trabajo )
			resultadoBeca=false;
		
		
		
		
		
		if (resultadoBeca) {
            System.out.println("Se te ha concedido la beca");}
		else {
			System.out.println("Se te ha denegado la beca");}
		
	}

}
