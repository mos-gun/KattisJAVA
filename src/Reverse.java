import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numLines;
        int[] arrNums;

        numLines = Integer.parseInt(scanner.nextLine());
        arrNums = new int[numLines];
        for (int i = 0; i < numLines; i++) {
            arrNums[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int i = numLines - 1; i >= 0; i--) {
            System.out.println(arrNums[i]);
        }
    }
}
