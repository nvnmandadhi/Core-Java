package inner_classes;

public class AnonymousApp {
	
	interface Runnable{
		void run();
	}
	
	abstract class RunnableAbstract {
		abstract void run();
	}

	public static void main(String[] args) {
		
		Runnable r = new Runnable(){

			@Override
			public void run() {
				System.out.println("Hello");
			}
			
		};
		
		r.run();
		
		System.out.println("=======================");
		
		AnonymousApp.RunnableAbstract obj = new AnonymousApp().new RunnableAbstract() {
			public void run() {
				System.out.println("Abstract is running");
			}
		};
		
		obj.run();
	}

}
