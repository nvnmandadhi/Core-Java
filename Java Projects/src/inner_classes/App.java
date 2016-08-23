package inner_classes;

public class App {
	
	int outer = 20;

	class Outer {
		int outer = 10;
	}
	
	static class Inner {
		int inner = 5;
	}
	
	public static void main(String[] args) {
		App app = new App();
		App.Outer obj =app.new Outer();
		
		System.out.println(obj.outer);
		System.out.println("====================");
		
		App.Inner in = new App.Inner();
		
		System.out.println(in.inner);
	}

}
