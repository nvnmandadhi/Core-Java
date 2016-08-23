package inner_classes;

public class LocalApp {
	
	public void display(){
		
		class Inner {
			
			void run(){
				System.out.println("Hello");
				}
		}
		
		Inner inner = new Inner();
		inner.run();
	}

	public static void main(String[] args) {
		LocalApp obj = new LocalApp();
		obj.display();
	}

}
