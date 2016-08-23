package hashmap_implementation;

public class Word {

    String word;

    public static int hashCode(String w) {

	return (26 * (w.charAt(0) - 'a') + (w.charAt(1) - 'a'));

    }

}
