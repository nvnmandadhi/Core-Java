package multithreading;

public class Threads {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Running first thread");
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Running second thread");
			}
		});
		
		t1.start();
		t2.start();
	}

}
