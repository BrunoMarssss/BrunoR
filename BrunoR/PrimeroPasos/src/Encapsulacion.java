
public class Encapsulacion {

	public static void main(String[] args) {
		
		Car car = new Car ("Audi","A6", 2022);
		car.setYear(2024);

		System.out.println(car.getMake() + "\n" + car.getModel() + "\n" + car.getYear());
		
	}
}
