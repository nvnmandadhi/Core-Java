/**
 * 
 */
package questions;

/**
 * @author Naveen
 *
 */
public class ShiftArray {

    /**
     * @param args
     */
    public static void main(String[] args) {

	int shift = 3;

	int[] a = { -2, 4, 6, 5, 0 };

	shiftArray(a, shift);
    }

    private static void shiftArray(int[] a, int shift) {

	int temp;

	int i = (a.length + shift) % a.length;

	for (i = 0; i < a.length; i++) {
	    temp = a[i];
	    a[i + shift] = temp;
	}

	System.out.println(a.toString());
    }

}
