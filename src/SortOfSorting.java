import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SortOfSorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfInputs;
        ArrayList<String> listInput;

        numOfInputs = -1;

        while ((numOfInputs = scanner.nextInt()) != 0) {
            scanner.nextLine();
            listInput = new ArrayList<>();
            for (int i = 0; i < numOfInputs; i++) {
                listInput.add(scanner.nextLine());
            }

            listInput.sort(Comparator.comparing(o -> o.substring(0, 2)));

            for (String name : listInput) {
                System.out.println(name);
            }
            System.out.println();
        }

    }
}
