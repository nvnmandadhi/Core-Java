package files_streams;

import java.io.*;

public class Files_1 {

    static File in;
    static File out;

    static int c;

    static FileReader reader = null;
    static FileWriter writer = null;

    public static void fileMethod() throws IOException {

	in = new File("input.txt");
	//in.createNewFile();
	out = new File("output.txt");
	out.createNewFile();

	reader = new FileReader(in);
	writer = new FileWriter(out);

	while ((c = reader.read()) != -1) {
	    writer.write(c);
	    System.out.println("Character read : " + (char) c);
	}

	reader.close();
	writer.close();
    }

    public static void main(String[] args) {
	try {
	    fileMethod();
	} catch (Exception e) {
	    System.out.println("Exception caught!!!!");
	    e.printStackTrace();
	}
    }
}
