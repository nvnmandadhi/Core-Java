package deadlock;

import java.util.Scanner;

public class DeadLock {

    static Thread t1, t2;

    static double balance;
    static Scanner sc = new Scanner(System.in);

    static Object lock = new Object();

    public static void main(String[] args) {

	synchronized (lock) {
	    // Money Withdrawal thread
	    t2 = new Thread(new Runnable() {

		@Override
		public void run() {

		    System.out.println("Enter money to withdraw");
		    double withdraw = sc.nextDouble();

		    balance = balance - withdraw;

		    try {
			this.wait();
		    } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		    }

		}

	    });
	}

	synchronized (lock) {

	    // Money Deposit thread
	    t1 = new Thread(new Runnable() {

		@Override
		public void run() {

		    System.out.println("Enter money to deposit");
		    double deposit = sc.nextDouble();

		    balance = balance + deposit;
		}

	    });

	}

	// Starting threads
	t1.start();
	t2.start();

	try {
	    t1.join();
	    t2.join();
	} catch (InterruptedException e) {

	    e.printStackTrace();
	}

	System.out.println(balance);

	sc.close();

    }

}
