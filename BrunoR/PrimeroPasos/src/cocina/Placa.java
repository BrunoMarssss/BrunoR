package cocina;

public class Placa {

	String color;
	double aleatorio =  (double)(Math.random());
	
	
	public String getColor() {
		return this.color;
	}

	public void setColor() {
		
		if (aleatorio >= 0.0 && aleatorio <= 0.33) {
			
			this.color = "Azul" ;
		}
		else if (aleatorio > 0.33 && aleatorio <= 0.66) {
			
			this.color = "Marron" ;	
		}
		else if (aleatorio > 0.66 && aleatorio <= 0.99) {
			
			this.color = "Verde";		
		}	
	}
}