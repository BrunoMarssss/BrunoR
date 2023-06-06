package Herencia;

public class UsoCoche {

	public static void main(String[] args) {
		
		Coche micoche1=new Coche();	
		
		micoche1.establece_color("Azul");
		
		Furgoneta mifurgoneta1 = new Furgoneta(7, 580);
		
		mifurgoneta1.configura_asientos("Si");
		
	}

}
