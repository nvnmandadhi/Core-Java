package basic_testing;

public class StringReverseImpl implements StringReverse {

    static char temp;

    @Override
    public String ReverseString(String input) {

	if (input.equals(null) || input.equals(""))
	    throw new IllegalStateException();

	char[] in = input.toCharArray();

	int begin = 0;
	int end = in.length - 1;

	while (end > begin) {

	    temp = in[begin];
	    in[begin] = in[end];
	    in[end] = temp;

	    end--;
	    begin++;
	}

	return new String(in);

    }
}
