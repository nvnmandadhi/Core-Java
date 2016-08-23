package inheritance;

class Parent {

    String name;
    int assets;

    Parent(String name, int assets) {
	this.name = name;
	this.assets = assets;
    }

    public Parent() {
	System.out.println("Parent no arg constructor called!");
    }

    public void show_details() {
	System.out.println(this.name + ":" + this.assets);
    }

    public void display() {
	System.out.println("Parent display");
    }
}

class Child extends Parent {

    Child(String name, int assets) {
	this();
	this.name = name;
	this.assets = assets;
    }

    public Child() {
	System.out.println("Child class no arg constructor!");
    }

    public void show_details() {
	System.out.println(this.name + ":" + this.assets);
    }

    public void display() {
	System.out.println("Child display");
    }
}

public class App {

    public static void main(String[] args) {

	System.out.println("Inhenritance example");
	System.out.println("Property " + "Value ");

	Parent parent = new Parent("parent", 50000);
	parent.show_details();

	Child child = new Child("child", 25000);
	child.show_details();

	Parent obj = new Child();

	obj.display();

	String s = "Hello";

	int[] arr = { 1, 2, 4, 6 };

	for (int i : arr) {
	    System.out.print(i);
	}
	
	System.out.println("\n");
	
	for (char c : s.toCharArray()) {
	    System.out.print(c);
	}
    }
}
