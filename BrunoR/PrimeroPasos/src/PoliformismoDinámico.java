import java.util.Scanner;

public class PoliformismoDinámico {

	public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
			Animal animal;
			
			System.out.println("¿Que animal quieres?");
			System.out.println("1=perro ; 2=gato");
			
			int choice = scanner.nextInt();
			
			if (choice==1) {
				
				animal = new Dog();
				animal.speak();
			}
			else if (choice==2) {
				
				animal = new Cat();
				animal.speak();
			}
			else {
				
				animal = new Animal();
			}
	}
}
