package ducks;

public class MallardDuck extends Duck {
	
	MallardDuck(){
		quackBehavior = new Quack();
		flyBehavior = new Fly();
	}

	@Override
	public void display() {
		System.out.println("I'm a Mallard Duck!");
	}

}
