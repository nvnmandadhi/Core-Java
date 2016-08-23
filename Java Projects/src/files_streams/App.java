package files_streams;

import java.io.File;
import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {

	File file = new File("C:\\input.txt");
	
	file.createNewFile();

	if (file.exists())
	    System.out.println("exists!");
	else
	    System.out.println("does not exist!");

    }

}
