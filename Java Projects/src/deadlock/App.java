/**
 * 
 */
package deadlock;

/**
 * @author Naveen
 *
 */public class App {

    static final Runner runner = new Runner();

    /**
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {

	Thread t1 = new Thread(new Runnable() {

	    @Override
	    public void run() {
		runner.firstThread();

	    }
	});

	Thread t2 = new Thread(new Runnable() {

	    @Override
	    public void run() {

		runner.secondThread();
	    }
	});

	t1.start();
	t2.start();

	t1.join();
	t2.join();

	runner.finished();
    }

}
