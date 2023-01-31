import javax.swing.*;
 public class entrada_ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombreusuario = JOptionPane.showInputDialog("Introduce tu nombre, por favor");
		
		String edadusuario = JOptionPane.showInputDialog("Introduce tu edad, por favor");
		
		int edad_usuario = Integer.parseInt(edadusuario);
		
		edad_usuario++;
		
		System.out.println("Hola " + nombreusuario + " tienes " + edad_usuario + " años ");
	}
}
