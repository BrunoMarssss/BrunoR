
public class Car {
	
 private String make = "Chevrolet";
 private String model = "Corvette";
 private int year = 2020;
 
//	String color = "blue";
//	double price = 50000.00;
	
//	void drive () {
	//	System.out.println( " You drive the car");
//	}
	//void brake () {
	//	System.out.println("You step on the brakes");
	//}
	
//	String name ;
	
	Car(String make,String model, int year){
		
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
	}
	
	public String getMake () {
		return make;
	}
	
	public String getModel () {
		return model;
	}
	
	public int getYear () {
		return year;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setModel(String model) {
		this.model=model;
	}
	
	public void setYear(int year) {
		
		this.year=year;
	}
}
