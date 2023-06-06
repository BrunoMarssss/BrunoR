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
		
/// mejora albertino		List<Frigorifico>miFrigorificos = new ArrayList<Frigorifico>();
		/// mis objetos
		
		if (frigos != 0){

			for (int i = 0; i < miArrFrig.length; i++) {
				
				Frigorifico mifrigo=new Frigorifico();	

				Scanner marcafrigo=new Scanner(System.in);		// instanciar una unica vez fuera del bucle
				System.out.println("¿Cuál es su marca?");
				String marcaFrigorifico=marcafrigo.nextLine();
				mifrigo.setMarca(marcaFrigorifico);
				
				//miArrFrig = [mifrigo.marca] [mifrigo.marca] [mifrigo.marca] 
				
				miArrFrig[i] = mifrigo;
				
			}	
		}
		else frigos = 0;
		
		Scanner numero_placas=new Scanner(System.in);		
		System.out.println("Introduce en nº de placas que tiene tu cocina: ");
		int placas=0;
		
		placas = Integer.parseInt(numero_placas.nextLine());
		
		Placa[] miArrPlaca = new Placa [placas];
		 
		//placas = placas != 0 ? placas : 0;
	
		for (int i = 0; i < miArrPlaca.length; i++) {
			
			Placa miplaca=new Placa();
						
			String coloraleatorio = miplaca.obtienecolor() ;
			miplaca.setColor(coloraleatorio);
			String colorplaca = miplaca.getColor();
			
			miArrPlaca[i] = miplaca;
		}	
		
		
		Cocina micocina = new Cocina(); //Instancias
		micocina.setMiArrFrig(miArrFrig); 
		
		for (Frigorifico frigo : micocina.getMiArrFrig()) {						
			System.out.println("Marca: " +  frigo.getMarca());
		}
		
		
	}
}