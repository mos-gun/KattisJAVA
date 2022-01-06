import java.util.Scanner;

public class NumberFun {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float numOfCases,a,b,c;
		
		numOfCases = Integer.parseInt(scanner.nextLine().trim());
		
		for (int i = 0; i < numOfCases; i++) {
			a = Integer.parseInt(scanner.next());
			b = Integer.parseInt(scanner.next());
			c = Integer.parseInt(scanner.next());
			scanner.nextLine();
			
			if(a + b == c) System.out.println("Possible");
			else if(a - b == c) System.out.println("Possible");
			else if(a * b == c) System.out.println("Possible");
			else if(a / b == c) System.out.println("Possible");
			else if(b - a == c) System.out.println("Possible");
			else if(b / a == c) System.out.println("Possible");
			else System.out.println("Impossible");
		}
	}
}
