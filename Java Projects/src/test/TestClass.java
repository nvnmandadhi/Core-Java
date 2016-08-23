package test;

public class TestClass {

	static int a;
	
	private TestClass() {
		System.out.println("Hello");
		System.out.println(a);
	}
	
	{
		a = 10;
	}

	public static void main(String[] args) {
		System.out.println(a);
		new TestClass();
	}

}
