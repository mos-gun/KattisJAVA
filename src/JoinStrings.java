//import java.util.Scanner;
//
//public class JoinStrings {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int numOfWords, word1, word2, lastIndex;
//        String[] arrWords;
//
//        numOfWords = Integer.parseInt(scanner.nextLine());
//        arrWords = new String[numOfWords];
//
//        for (int i = 0; i < numOfWords; i++) {
//            arrWords[i] = scanner.nextLine();
//        }
//        word1 = 0;
//        word2 = 0;
//        lastIndex = 0;
//        while (scanner.hasNextInt()) {
//            word1 = scanner.nextInt()-1;
//            word2 = scanner.nextInt()-1;
//
//            arrWords[word1] += arrWords[word2];
//            lastIndex = word1;
//            System.out.println(arrWords[word1]);
//        }
//        System.out.println(arrWords[lastIndex]);
//
//    }
//}
