
public class Main{

	public static void main(String[] args) {
		Sub1 a = new Sub1();
		Sub1 b = new Sub1(123);
		a.run(30);
		a.display();
		b.run(50);
		b.display();
	}
}

