public class App {

    static int[] A = { 1, 1, 3, 2, 3 };

    public static void main(String[] args) {
	App obj = new App();
	System.out.println(obj.solution(A, 3));
    }

    public boolean solution(int[] A, int K) {
	int n = A.length;
	for (int i = 0; i < n; i++) {
	    if (A[i] < A[i + 1])
		return false;
	}
	if (A[0] != 1 && A[n - 1] != K)
	    return false;
	else
	    return true;
    }
}