import java.util.*;
public class adivina_numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int aleatorio =  (int)(Math.random()*100);
		 System.out.println(aleatorio);
		
		Scanner entrada=new Scanner(System.in);
		int numero=0;
		int intentos=0;
		
		//while(numero!=aleatorio) 
		do {
			intentos++;
			 System.out.println("Introduce un número, por favor");
			 
			 numero=entrada.nextInt();
			 
			 if (aleatorio<numero) {
				 
				 System.out.println("Más bajo");
			 }
			 
			 else if (aleatorio>numero) {
				 
				 System.out.println("Más alto");
			 }
		} while(numero!=aleatorio);
		
		System.out.println("Correcto lo has conseguido en " + intentos + " intentos");
	}

}
