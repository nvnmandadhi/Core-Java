package ducks;

public abstract class Duck {

	protected QuackBehavior quackBehavior;
	protected FlyBehavior flyBehavior;

	public void swim() {
		System.out.println("All ducks swim, even decoys!!!!");
	}

	public abstract void display();

	public void performFly() {
		flyBehavior.fly();
	}

	public void performQuack() {
		quackBehavior.quack();
	}
}
