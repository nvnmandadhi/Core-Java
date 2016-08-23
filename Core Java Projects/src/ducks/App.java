package ducks;

public class App {

	public static void main(String[] args) {
		
		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.swim();
		mallard.performQuack();
		mallard.performFly();
		
		System.out.println("\n");
		
		Duck dollDuck = new WoodenDuck();
		dollDuck.display();
		dollDuck.swim();
		dollDuck.performFly();
		dollDuck.performQuack();
	}

}
