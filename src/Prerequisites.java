import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Prerequisites {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfCategories, counter;
        ArrayList<String> listCourses, listCategories;
        boolean requirementFulfilled = false;
        boolean requirementFailed;

        while (scanner.nextInt() != 0) {
            numOfCategories = scanner.nextInt();
            scanner.nextLine();

            listCourses = new ArrayList<>(Arrays.asList(scanner.nextLine().split(" ")));
            requirementFailed = false;

            for (int i = 0; i < numOfCategories; i++) {
                listCategories = new ArrayList<>(Arrays.asList(scanner.nextLine().split(" ")));
                if (!requirementFailed) {
                    counter = Integer.parseInt(listCategories.get(1));
                    requirementFulfilled = false;
                    for (int j = 2; j < listCategories.size(); j++) {
                        if(listCourses.contains(listCategories.get(j))) counter--;
                        if(counter == 0) {
                            requirementFulfilled = true;
                            break;
                        }
                    }
                }
                if(!requirementFulfilled) {
                    requirementFailed = true;
                }
            }
            if(requirementFulfilled) System.out.println("yes");
            else {
                System.out.println("no");
            }
        }
    }
}
