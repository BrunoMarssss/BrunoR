package Herencia;

public class Coche {
	
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	String color;
	int peso_total;
	boolean asientos_cuero, climatizador;
	
	public Coche() {
		
		ruedas=4;
		largo=2000;
		ancho=300;
		motor=1600;
		peso_plataforma=500;
		
	}
	
	public String dime_datos_generales () {
		
		return "La platafroma del vehículo tiene " + ruedas + " ruedas " + ". Mide " + largo/1000 + " metros con un ancho de " + ancho + " cm y un peso de plataforma de " + peso_plataforma + " kg" ; 
	}
	
	public String getlargo() {
	
		return "El largo del coche es : " + largo;
	}
	
	public void establece_color(String color_coche) {
		
		color = "azul";
	}
	
	public String obtiene_color() {
		
		return "El color del coche es " + color; 
	}
	
	public void configura_asientos(String asientos_cuero) {
		
		if (asientos_cuero.equalsIgnoreCase("si")) {
			
			this.asientos_cuero=true;
		} else {
			this.asientos_cuero=false;
		}
	}
	
	
	public String dime_asientos () {
		
		if(asientos_cuero==true) {
			
			return "El coche tiene asientos de cuero";
		} else {
			return "El coche tiene asientos de serie";
		}
	}
	
	
	public int precio_coche() {
		
		int precio_final=10000;
		
		if (asientos_cuero==true) {
			
			precio_final+=2000;
		}
		
		if (climatizador==true) {
			
			precio_final+=1500;
		}
		return precio_final;
	}
}