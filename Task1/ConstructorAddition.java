package Task1;
class One{
	int i = 10;
	int s = 15;
	void demo() {
		int x = i+s;
		System.out.println(x);
	}
}
public class ConstructorAddition {

	public static void main(String[] args) {
		One o = new One();
		o.demo();
	}

}
