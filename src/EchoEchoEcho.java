import java.util.Scanner;

public class EchoEchoEcho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input += " ";
        System.out.println(input.repeat(3).trim());
    }
}