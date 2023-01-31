package cocina;

public class Placa {

	String color;
	double aleatorio =  (double)(Math.random());

	
	public Placa() {
		
		color = getColor();	
	}
	
	public String getColor() {
		
		return color;
	}
	
	public void setColor() {
		
		if (aleatorio >= 0.0 && aleatorio <= 0.33) {
			
			color = "Azul" ;
		}
		else if (aleatorio > 0.33 && aleatorio <= 0.66) {
			
			color = "Marron" ;	
		}
		else if (aleatorio > 0.66 && aleatorio <= 0.99) {
			
			color = "Verde";		
		}	
	}
}