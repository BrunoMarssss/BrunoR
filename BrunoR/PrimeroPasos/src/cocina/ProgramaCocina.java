package cocina;
import java.util.*;

public class ProgramaCocina {

	private static final String String = null;

	public static void main(String[] args) {
				
		Scanner nombrecocina=new Scanner(System.in);		
		System.out.println("¿Cómo se llama tu cocina?");
		String cocina=nombrecocina.nextLine();
		
		
		Scanner numero_frigorificos=new Scanner(System.in);		
		System.out.println("Introduce en nº de frigos que tiene tu cocina: ");
		int frigos=Integer.parseInt(numero_frigorificos.nextLine());
		
		Frigorifico[] miArrFrig = new Frigorifico [frigos];	
		
		if (frigos != 0){

			for (int i = 0; i < miArrFrig.length; i++) {
				
				Frigorifico mifrigo=new Frigorifico();	
				
				Scanner marcafrigo=new Scanner(System.in);		
				System.out.println("¿Cuál es su marca?");
				String marcaFrigorifico=marcafrigo.nextLine();
			}	
		}
		else frigos = 0;
		
		Scanner numero_placas=new Scanner(System.in);		
		System.out.println("Introduce en nº de placas que tiene tu cocina: ");
		int placas=Integer.parseInt(numero_placas.nextLine());
		
		Placa[] miArrPlaca = new Placa [placas];
		
		if (placas != 0){

			for (int i = 0; i < miArrPlaca.length; i++) {
				
				Placa miplaca=new Placa();					
				miplaca.color=miplaca.getColor();
				
			}	
		}
		else placas = 0;
		
		
	//	Cocina micocina=new Cocina(
				
				//String cocina = micocina.getNombre() ;
				
				//);
	}
}