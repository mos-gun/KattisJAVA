import java.util.*;

public class ABC{

	public static void main(String[] args) {
		int a, b, c, tmp;
		Scanner scan = new Scanner(System.in);

		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();

		int[] intSet = {a, b, c};
		Arrays.sort(intSet);

		char[] charSet = scan.next().toCharArray();

		for(int i=0; i<3; i++){
			System.out.print(intSet[charSet[i]-'A'] + " ");
		}
	}
}