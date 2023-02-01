package cocina;

public class Cocina {

	private String nombre;
	private boolean existe_frigorifico;
	private boolean existe_placa;
	private int numero_frigorificos;
	private int numero_placas;
	private Frigorifico[] miArrFrig;// miArrayFrigorificos
	private int[] miArrPlaca;
	
	public Cocina(String nombre) {
	}

	public Cocina() {
	}

	public Cocina(String nombre, int numeroPlaca) {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isExiste_frigorifico() {
		return existe_frigorifico;
	}

	public void setExiste_frigorifico(boolean existe_frigorifico) {
		this.existe_frigorifico = existe_frigorifico;
	}

	public boolean isExiste_placa() {
		return existe_placa;
	}

	public void setExiste_placa(boolean existe_placa) {
		this.existe_placa = existe_placa;
	}

	public int getNumero_frigorificos() {
		return numero_frigorificos;
	}

	public void setNumero_frigorificos(int numero_frigorificos) {
		this.numero_frigorificos = numero_frigorificos;
	}

	public int getNumero_placas() {
		return numero_placas;
	}

	public void setNumero_placas(int numero_placas) {
		this.numero_placas = numero_placas;
	}

	public Frigorifico[] getMiArrFrig() {
		return miArrFrig;
	}

	public void setMiArrFrig(Frigorifico[] miArrFrig) {
		this.miArrFrig = miArrFrig;
	}

	public int[] getMiArrPlaca() {
		return miArrPlaca;
	}

	public void setMiArrPlaca(int[] miArrPlaca) {
		this.miArrPlaca = miArrPlaca;
	}

	public String inforMob() {

		if (numero_frigorificos == 0 && numero_placas == 0) {

			return "La cocina " + nombre + " no tiene frigorificos y no tiene placas";
		} else if (numero_frigorificos == 1 && numero_placas == 1) {

			return "La cocina " + nombre + "tiene " + numero_frigorificos + "de marca " + "marcafrigorifico"
					+ "y tiene una placa " + "getcolorplaca";
		} else if (numero_frigorificos == 3 && numero_placas == 0) {

			return "La cocina " + nombre + "tiene " + numero_frigorificos + "de marcas "
					+ "concatenarmarcasfrigorificos" + "y no tiene placas";
		} else if (numero_frigorificos == 1) {

			return "La cocina " + nombre + "tiene " + numero_frigorificos + "de marcas "
					+ "concatenarmarcasfrigorificos" + "y no tiene placas";
		}

		return "No existe esta opción";
	}
}
