package ducks;

public class WoodenDuck extends Duck {

	WoodenDuck(){
		quackBehavior = new Squeak();
		flyBehavior = new NoFly();
	}

	@Override
	public void display() {
		System.out.println("I'm a Wooden Duck");
	}
}
