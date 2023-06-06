import java.io.FileWriter;
import java.io.IOException;

public class CrearFichero {

	public static void main(String[] args) {
			
			try {
				FileWriter fichero = new FileWriter("poema.txt");
				
				String mitexto = "Hola esto es una prueba";
				
				fichero.write(mitexto);
				fichero.close();
			} catch (IOException e) {
				
				
				e.printStackTrace();
			}
	}
}
