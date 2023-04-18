import java.util.ArrayList;
import java.util.Scanner;

public class NOP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        ArrayList<String> listInstructions = new ArrayList<>();
        int numOfNOPs;

        StringBuilder sb;
        int index;

        try {
            while (true) {
                index = getIndexOfUppercaseLetter(line);
                sb = new StringBuilder();
                sb.append(line, 0, index);
                listInstructions.add(sb.toString());
                line = line.substring(index);
            }
        } catch (IndexOutOfBoundsException ignored) {

        }

        numOfNOPs = 0;
        for (String part : listInstructions) {
            numOfNOPs += 4-part.length();
        }

        System.out.println(numOfNOPs);

    }

    public static int getIndexOfUppercaseLetter(String line) {
        for (int i = 1; i < line.length(); i++) {
            if(Character.isUpperCase(line.charAt(i))) return i;
        }

        return -1;
    }
}
