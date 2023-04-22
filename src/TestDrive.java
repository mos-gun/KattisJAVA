import java.util.Scanner;

public class TestDrive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if((b > a && c < b) || (b < a && c > b)) System.out.println("turned");
        else if(Math.abs(a-b) == Math.abs(b-c)) System.out.println("cruised");
        else if(((a<b && b<c) || (a>b && b>c)) && (Math.abs(a-b) < Math.abs(b-c))) System.out.println("accelerated");
        else if(Math.abs(a-b) > Math.abs(b-c)) System.out.println("braked");
    }
}