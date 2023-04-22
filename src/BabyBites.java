import java.util.Scanner;

public class BabyBites {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrect;
        scanner.nextLine();
        String[] arrInput = scanner.nextLine().split(" ");

        isCorrect = true;
        for (int i=0; i<arrInput.length; i++) {
            if(!arrInput[i].equals("mumble")) {
                if(Integer.parseInt(arrInput[i]) != i+1) {
                    isCorrect = false;
                    break;
                }
            }
        }
        if(isCorrect) System.out.println("makes sense");
        else System.out.println("something is fishy");
    }
}
