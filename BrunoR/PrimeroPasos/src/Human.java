public class Human {

	String name;
	int age;
	double weight ; 
	
	Human(String name, int age, double weight) {
		
		this.name = name;
		this.age = age;
		this.weight=weight;
	} ;
	
	void eat() {
		System.out.println(this.name + " is eating");
	} ; 
	
	void drink() {
		System.out.println(this.name + " is drinking");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	
}
