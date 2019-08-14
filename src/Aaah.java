import java.util.Scanner;

public class Aaah {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ammountOfA1, ammountOfA2;
		
		ammountOfA1 = scan.nextLine().length()-1;
		ammountOfA2 = scan.nextLine().length()-1;
		
		if(ammountOfA1 >= ammountOfA2) System.out.println("go");
		else System.out.println("no");
	}
}