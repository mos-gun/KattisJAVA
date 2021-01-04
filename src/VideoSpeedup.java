import java.util.Scanner;

public class VideoSpeedup {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n, p, k;
		int pOriginal;
		double T;
		int[] arrTimestamps;
		
		n = scanner.nextInt();
		p = scanner.nextInt();
		k = scanner.nextInt();
		pOriginal = p;
		scanner.nextLine();

		arrTimestamps = new int[n];
		for (int i = 0; i < n; i++) {
			arrTimestamps[i] = scanner.nextInt();
		}
		scanner.nextLine();

		T = arrTimestamps[0];
		for (int i = 1; i < arrTimestamps.length; i++) {
			T += (arrTimestamps[i]-arrTimestamps[i-1]) * (1+((float)p/100));
			p+=pOriginal;
		}
		if(arrTimestamps[arrTimestamps.length-1] != k) T+= (k - arrTimestamps[arrTimestamps.length-1]) * (1+((float)p/100));

		System.out.println(T);
	}
}
