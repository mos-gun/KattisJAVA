//import java.util.Scanner;
//
//public class Backspace {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		StringBuilder sb = new StringBuilder();
//		
//		sb.append(scanner.nextLine());
//		for (int i = 0; i < sb.length(); i++) {
//			if (sb.charAt(i) == '<') {
//				sb.deleteCharAt(i);
//				sb.deleteCharAt(i - 1);
//				i -= 2;
//			}
//		}
//		System.out.println(sb);
//	}
//}
//
////		StringBuilder sb = new StringBuilder();
////		sb.append(scanner.nextLine());
////		String input = sb.toString();
////		int posOfShift = sb.indexOf("<");
////		while (posOfShift != - 1 && input.contains("<")) {                        // Time Limit Exceeded
////			sb.deleteCharAt(posOfShift);
////			sb.deleteCharAt(posOfShift - 1);
////			posOfShift = sb.indexOf("<");
////		}
////		System.out.println(sb);
//
//
////	String line;													// Time Limit Exceeded
////		line = scanner.nextLine();
////				while (line.contains("<")) {
////				line = line.substring(0, line.indexOf('<') - 1) + line.substring(line.indexOf('<') + 1);
////				}
////				System.out.println(line);
////				}
//
//
////		String line;												// Time Limit Exceeded
////		line = scanner.nextLine();
////		while (line.contains("<")) {
////			System.out.println(line);
////			line = line.replace(String.valueOf(line.charAt(line.indexOf('<') - 1)), "");
////			System.out.println(line);
////			line = line.replaceFirst(String.valueOf(line.charAt(line.indexOf('<'))), "");
////			System.out.println(line);
////		}
////		System.out.println(line);
//
//
////		StringBuilder sb = new StringBuilder();
////		sb.append(scanner.nextLine());
////		while (sb.toString().contains("<")) {						// Time Limit Exceeded
////			sb.deleteCharAt(sb.indexOf("<")-1);
////			sb.deleteCharAt(sb.indexOf("<"));
////		}
////		System.out.println(sb);	
//
//
////		StringBuilder sb = new StringBuilder();
////		sb.append(scanner.nextLine());
////		for (int i = 0; i < sb.length(); i++) {						// Time Limit Exceeded
////			if(sb.charAt(i) == '<'){
////				sb.deleteCharAt(i);
////				sb.deleteCharAt(i-1);
////				i-=2;
////			}
////		}
////		System.out.println(sb);
//
//
////	Scanner scanner = new Scanner(System.in);						//Wrong answer at test case 4
////
////	StringBuilder sb = new StringBuilder();
////	String line = scanner.nextLine();
////	int len = line.length();
////	int counter = 0;
////		for (int i = len - 1; i >= 0; i--) {
////				if (line.charAt(i) == '<') {
////				counter++;
////				} else {
////				if (i == 0 && line.charAt(1) == '<') {
////				break;
////				} else {
////				i -= counter;
////				if (line.charAt(i) == '<') {
////				i++;
////				counter = 0;
////				continue;
////				} else {
////				sb.append(line.charAt(i));
////				counter = 0;
////				}
////				}
////				}
////				}
////				sb.reverse();
////				System.out.println(sb);