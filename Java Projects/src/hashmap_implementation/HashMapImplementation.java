package hashmap_implementation;

public class HashMapImplementation {

    private static Definition[] table = new Definition[10];

    public static void insert(String w, Definition d) {
	table[Word.hashCode(w)] = d;
    }

    public static void main(String[] args) {
	
    }

}
