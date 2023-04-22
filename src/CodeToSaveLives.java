import java.util.Scanner;

public class CodeToSaveLives {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfCases = scanner.nextInt();
        scanner.nextLine();
        int num1, num2, result;

        for (int i = 0; i < numOfCases; i++) {
            num1 = Integer.parseInt(scanner.nextLine().replaceAll(" ", ""));
            num2 = Integer.parseInt(scanner.nextLine().replaceAll(" ", ""));
            result = num1+num2;
            for (char c : Integer.toString(result).toCharArray()) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
