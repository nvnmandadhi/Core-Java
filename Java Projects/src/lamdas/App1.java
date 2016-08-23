package lamdas;

interface Idea {
	void add(int a, int b);
}

class IdeaRunner {
	public void run(Idea i){
		System.out.println("Running!!!!");
		i.add(10, 20);
	}
}

public class App1 {

	public static void main(String[] args) {
		
		IdeaRunner obj = new IdeaRunner();
		
		obj.run(new Idea(){

			@Override
			public void add(int a, int b) {
				System.out.println(a+b);
			}
			
		});
		
		System.out.println("======================");
		
		obj.run((a,b) -> {
			System.out.println("Lamda is running");
			System.out.println(a+b);
		});
	}

}
