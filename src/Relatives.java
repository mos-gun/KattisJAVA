//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Relatives {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int value, numOfLoops, counter, temp;
//        ArrayList<Integer> listValues = new ArrayList<>();
//        boolean arrNumbers[];
//
//        while ((value = scanner.nextInt()) != 0) {
//            listValues.add(value);
//        }
////        System.out.println(listValues);
//
//        for (int i = 0; i < listValues.size(); i++) {
//            value = listValues.get(i);
//            arrNumbers = new boolean[value];
//
////            System.out.println(Arrays.toString(arrNumbers));
//
//            numOfLoops = (int) Math.sqrt(value) + 1;  // +1 to get additional square root
////            System.out.println(numOfLoops);
//            for (int j = 2; j <= numOfLoops; j++) {
//                if(arrNumbers[j-1]) {
////                    System.out.println(j + "("+ arrNumbers[j] + ") is already true");
//                    continue;
//                }
//
//                if(value % j == 0) {
//                    temp = j;
////                    System.out.println(value + " mod " + j + " = 0");
////                    System.out.println("===");
//                    while (temp <= arrNumbers.length) {
////                        System.out.println(temp);
//                        arrNumbers[temp-1] = true;
//                        temp += j;
//                    }
//
////                    System.out.println("===");
//                } //else System.out.println(value + " mod " + j + " != 0");
//            }
//            arrNumbers[arrNumbers.length-1] = true;     // its own number is never counted (e.g. 7 % 7)
//
//            counter = 0;
//            for (boolean val : arrNumbers) {
//                if(!val) counter++;
//            }
//            System.out.println(counter);
////            System.out.println(Arrays.toString(arrNumbers));
//        }
//    }
//}
