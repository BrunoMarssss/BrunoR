import java.util.Scanner;
public class entrada_ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce tu nombre, por favor");
		
		String nombreusuario=entrada.nextLine();
		
		System.out.println("Introduce edad, por favor");
		
		int edadusuario=entrada.nextInt();

		System.out.println("Hola " + nombreusuario + ". El año que viene tendrás " + (edadusuario+1) + " años");
	}
}