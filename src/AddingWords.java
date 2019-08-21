//import sun.nio.cs.ext.ISO2022_CN_CNS;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Scanner;
//
//public class AddingWords {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		String input, operators;
//		String[] vars;
//		int sum = 0;
//		int lenOfVars, lenOfOperators;
//		HashMap<String, Integer> wordToNumDict = new HashMap<>();
//		ArrayList<String> inputList = new ArrayList<>();
//		ArrayList<String> answersList = new ArrayList<>();
//		boolean varExists;
//
//		while (! (input = scanner.nextLine()).isEmpty()) {
//			inputList.add(input);
//		}
//
//		for (String line : inputList) {
//			vars = line.split(" ");
//
//			if (vars[0].equals("def")) {
//				wordToNumDict.put(vars[1], Integer.parseInt(vars[2]));
//			} else if (vars[0].equals("calc")) {
//				sum = 0;
//				operators = getOperators(vars);
//				lenOfVars = vars.length;
//
//				if ((value = wordToNumDict.containsKey(vars[1])) ) {
//					sum += wordToNumDict.get(vars[1]);
//					answersList.add()
//				} else {
//					sum = - 1000000;
//				}
//
//				for (int i = 3, j = 0; i < lenOfVars - 1; i = i + 2, j++) {
//					if (sum == - 1000000) {
//						break;
//					} else {
//						if (wordToNumDict.containsKey(vars[i])) {
//							if (operators.charAt(j) == '+') {
//								sum += wordToNumDict.get(vars[i]);
//							} else {
//								sum -= wordToNumDict.get(vars[i]);
//							}
//						} else {
//							sum = - 1000000;
//							break;
//						}
//					}
//				}
//				if (sum == - 1000000) {
//
//				}
//
//			} else if (vars[0].equals("clear")) {
//				wordToNumDict.clear();
//			}
//			System.out.println(wordToNumDict);
//			System.out.println(sum);
//
//		}
//
//	}
//
//	private static String getOperators(String[] vars) {
//		String operators = "";
//		int len = vars.length;
//
//		for (int i = 0; i < len; i++) {
//			if (vars[i].equals("+") || vars[i].equals("-")) {
//				operators += vars[i];
//			}
//		}
//
//		return operators;
//	}
//}
