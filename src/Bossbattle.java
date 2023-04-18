import java.util.Scanner;

public class Bossbattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        if(num <=3) System.out.println(1);
        else System.out.println(num - 2);
    }
}