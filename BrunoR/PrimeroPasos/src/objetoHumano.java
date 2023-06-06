public class objetoHumano {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human human1 = new Human("Rick",65,70);
		Human human2 = new Human("Morty",16,50);
		
		System.out.println(human1.name);
		System.out.println(human2.name);
		
		human1.eat();
		human2.drink();
	}

}
