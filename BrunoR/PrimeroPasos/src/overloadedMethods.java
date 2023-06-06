
public class overloadedMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = add(1,2);
		System.out.println(x);

	}

	
	static int add(int a, int b) {
		return a + b ; 
		
	}
	
	static int add(int a , int b , int c ) {
		
		return a + b + c;
	}
	
}
