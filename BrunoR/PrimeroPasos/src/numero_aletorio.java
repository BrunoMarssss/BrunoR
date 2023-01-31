

public class numero_aletorio {

	public static void main(String[] args) {
		
		double aleatorio =  (double)(Math.random());
		if (aleatorio >= 0.0 && aleatorio <= 0.33) {
			
			System.out.println("Azul");	
		}
		else if (aleatorio > 0.33 && aleatorio <= 0.66) {
			
			System.out.println("Marron");	
		}
		else if (aleatorio > 0.66 && aleatorio <= 0.99) {
			
			System.out.println("Verde");	
		}	
	}
}