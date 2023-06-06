import java.util.Scanner;
public class Excepciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scanner = new Scanner(System.in);
			
			try {
			System.out.println("Introduce un numero a dividir:");
			int x = scanner.nextInt();
			
			System.out.println("Introduce un numero que será divido:");
			int y = scanner.nextInt();
			
			int z = x/y;
			
			System.out.println("result: " + z );			
		}
			catch (ArithmeticException e) {
				
				System.out.println("No puedes dividir entre 0" );
			}
	}
}
