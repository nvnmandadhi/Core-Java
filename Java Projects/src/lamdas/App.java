package lamdas;

interface Executable {
	void execute();
}

class Runner {
	public void run(Executable e) {
		System.out.println("Executing method!!!!");
		e.execute();
	}
}

public class App {

	public static void main(String[] args) {
		new Runner().run(new Executable() {

			@Override
			public void execute() {
				System.out.println("Running through an interface by Runner!!!!");
			}
		});

		System.out.println("==========================================");

		new Runner().run(() -> {
			System.out.println("Lamda expression");
			System.out.println("Hello");
		});
	}

}
