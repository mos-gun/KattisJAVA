import java.util.Scanner;

public class FindingAnA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.println(input.substring(input.indexOf('a')));
    }
}