import java.util.Scanner;

public class ElectricalOutlets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfCases = scanner.nextInt();
        int numOfStrips;
        int result;

        for (int i = 0; i < numOfCases; i++) {
            numOfStrips = scanner.nextInt();

            if(numOfStrips == 0) {
                System.out.println("1");
                continue;
            }

            result = 0;
            for (int j = 0; j < numOfStrips; j++) {
                result += scanner.nextInt();
            }

            System.out.println(result - numOfStrips+1);
            scanner.nextLine();
        }
    }
}