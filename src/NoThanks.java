//import java.util.*;
//
//public class NoThanks {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int numOfCards, score, counter;
//        List<Integer> listValues;
//        String[] arrTemp;
//
//        numOfCards = Integer.parseInt(scanner.nextLine());
//        listValues = new ArrayList<>();
//        arrTemp = scanner.nextLine().split(" ");
//
//
//        for (String valueAsString : arrTemp) {
//            listValues.add(Integer.parseInt(valueAsString));
//        }
//
//        Collections.sort(listValues);
//        score = 0;
//        if (listValues.size() == 2) {
//            if (listValues.get(1) == listValues.get(0) + 1) System.out.println(listValues.get(0));
//            else System.out.println(listValues.get(0) + listValues.get(1));
//        } else {
//            for (int i = 1; i < listValues.size(); i++) {
//                counter = 1;
//                while (true) {
//                    if (listValues.get(i) == listValues.get(i - 1) + counter) {
//                        counter++;
//                        listValues.remove(i);
//                        if(listValues.size() == 1) break;
//                    } else {
//                        score += listValues.get(i-1);
//                        break;
//                    }
//                }
//            }
//            score += listValues.get(listValues.size()-1);
//
//            System.out.println(score);
//        }
//
//    }
//}