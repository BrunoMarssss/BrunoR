
public class ObjetoPizza {

	public static void main(String[] args) {
		
		Pizza pizza1 = new Pizza("pan","mahonesa","mozzarella", "peperoni");
		
		System.out.println("Aquí están los ingredientes de tu pizza: \n" + pizza1.bread + "\n" + pizza1.cheese + "\n" + pizza1.sauce + "\n" + pizza1.topping);
	}

}
