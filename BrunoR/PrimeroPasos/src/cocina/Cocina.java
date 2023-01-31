package cocina;

public class Cocina {

	String nombre;
	private boolean existe_frigorifico;
	private boolean existe_placa;
	private int numero_frigorificos;
	private int numero_placas;
	private int [] miArrFrig;
	private int [] miArrPlaca;
	
	public String inforMob() {
		
		if (numero_frigorificos == 0 && numero_placas== 0) {
			
			return "La cocina " + nombre + " no tiene frigorificos y no tiene placas";
		}
		else if (numero_frigorificos ==1 && numero_placas == 1) {
			
			return "La cocina " + nombre + "tiene " + numero_frigorificos + "de marca " + "marcafrigorifico" + "y tiene una placa " + "getcolorplaca" ;
		}
		else if (numero_frigorificos==3 && numero_placas==0) {
			
			return "La cocina " + nombre + "tiene " + numero_frigorificos + "de marcas " + "concatenarmarcasfrigorificos" + "y no tiene placas";
		}
		else if (numero_frigorificos==1 ) {
			
			return "La cocina " + nombre + "tiene " + numero_frigorificos + "de marcas " + "concatenarmarcasfrigorificos" + "y no tiene placas";
		}
		
		return "No existe esta opción";
	}
}

