package questions;

import java.util.Scanner;

@SuppressWarnings("unused")
public class App2 {

    static {

	boolean flag;
	int area;

	Scanner sc = new Scanner(System.in);

	int B = sc.nextInt();
	int H = sc.nextInt();

	try {
	    if (B >= 0 && H >= 0) {
		area = B * H;
		flag = true;
	    } else {
		flag = false;
		area = 0;
		throw new Exception("Breadth and height must be positive");
	    }
	} catch (Exception e) {
	    System.out.println(e);
	}
	finally{
	    sc.close();
	}
    }
}
