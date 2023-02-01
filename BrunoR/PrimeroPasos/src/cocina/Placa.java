package cocina;

public class Placa {

	String color;
	double aleatorio =  (double)(Math.random());
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String obtienecolor () {
		
		String respuesta=null;
		
		if (aleatorio >= 0.0 && aleatorio <= 0.33) {
			
			 respuesta="Azul" ;
		}
		else if (aleatorio > 0.33 && aleatorio <= 0.66) {
			
			 respuesta="Marron" ;	
		}
		else if (aleatorio > 0.66 && aleatorio <= 0.99) {
			
			 respuesta="Verde";		
		}	
		return respuesta;
	}
}