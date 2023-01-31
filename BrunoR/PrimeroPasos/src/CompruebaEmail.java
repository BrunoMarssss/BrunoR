import javax.swing.JOptionPane;

public class CompruebaEmail {

	public static void main(String[] args) {
		
		int arroba=0;
		boolean punto=false;
		String email=JOptionPane.showInputDialog("Introduce email");
		String ultimaletra = email.substring(email.length() - 1);
		int posicionarroba = email.indexOf('@')+1;
		int posicionultimaletra= email.lastIndexOf(ultimaletra); 
		String dominio = email.substring(posicionarroba, posicionultimaletra+1);
		int longituddominio = dominio.length();
		boolean validadominio = longituddominio>0;

		for (int i=0; i<email.length(); i++) {
			
			if (email.charAt(i)=='@') {
				
				arroba++;
			}
			
			if (email.charAt(i)=='.') {
				
				punto=true;
			}

			
			if (longituddominio>0) {
			
				validadominio=true;
		}
		}
		if(arroba==1 && punto==true && validadominio==true){
			
			System.out.println("Es correcto");
		}
		else {
			
			System.out.println("No es correcto");
		}
	}
}