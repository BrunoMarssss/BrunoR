package cocina;

import javax.swing.JOptionPane;

public class ProgramaCocina {

	public static void main(String[] args) {

		Cocina micocina=new Cocina();	
		Frigorifico mifrigo=new Frigorifico();
		Placa miplaca=new Placa();
	
	
		micocina.nombre=JOptionPane.showInputDialog("¿Cuál es el nombre de la cocina?");
		
	//	mifrigo.setMarca(null)=JOptionPane.showInputDialog("¿Cuántos frigos tengo");
	}

}
