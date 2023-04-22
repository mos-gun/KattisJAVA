import java.util.Scanner;

public class SavingForRetirement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bobAge, bobRetirementAge, bobSavingPerYear, aliceAge, aliceSavingPerYear;
        int bobSaved, aliceSaved;

        bobAge = scanner.nextInt();
        bobRetirementAge = scanner.nextInt();
        bobSavingPerYear = scanner.nextInt();
        aliceAge = scanner.nextInt();
        aliceSavingPerYear = scanner.nextInt();
        scanner.nextLine();

        bobSaved = (bobRetirementAge-bobAge) * bobSavingPerYear;
        aliceSaved = 0;
        while(aliceSaved <= bobSaved) {
            aliceSaved += aliceSavingPerYear;
            aliceAge++;
        }
        System.out.println(aliceAge);
    }
}
