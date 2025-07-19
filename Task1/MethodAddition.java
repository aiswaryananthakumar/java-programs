package Task1;

public class MethodAddition {
	
	int addition(int a , int b) {
		return a+b;  
	}

	public static void main(String[] args) {
		
		MethodAddition m = new MethodAddition();
		
		int sum = m.addition(10,15);   
		System.out.println(sum);

	}
}