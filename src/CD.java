import java.util.Arrays;
import java.util.HashSet;

public class CD {
	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);
		int n, m, counter;
//		HashSet<Integer> setCDs = new HashSet<>();
		int[] arrCDs;

		while (true) {
			n = io.getInt();
			m = io.getInt();

			if (n == 0 && m == 0) break;
			arrCDs = new int[n];
			counter = 0;

			for (int i = 0; i < n; i++) {
//				setCDs.add(io.getInt());
				arrCDs[i] = io.getInt();
			}

			for (int i = 0; i < m; i++) {
//				if (! setCDs.add(io.getInt())) counter++;								// Wrong answer second testcase
				if(Arrays.binarySearch(arrCDs, io.getInt()) >= 0) counter++;
			}
			System.out.println(counter);
		}
	}
}