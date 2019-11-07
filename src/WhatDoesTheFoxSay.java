import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class WhatDoesTheFoxSay {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numOfCases;
		String recording, input;
		ArrayList<ArrayList<String>> listAnimals;
		HashMap<String, String> mapAnimals;
		ArrayList<String> listResults = new ArrayList<>();
		StringBuilder stringBuilder;
		String[] arrTemp;

		numOfCases = Integer.parseInt(scanner.nextLine().trim());

		for (int i = 0; i < numOfCases; i++) {
			listAnimals = new ArrayList<>();
			mapAnimals = new HashMap<>();
			stringBuilder = new StringBuilder();

			recording = scanner.nextLine();
			while (! (input = scanner.nextLine()).equals("what does the fox say?")) {
				arrTemp = input.split(" ");
				mapAnimals.put(arrTemp[0], arrTemp[2]);
			}
			
			arrTemp = recording.split(" ");
			for (int j = 0; j < arrTemp.length; j++) {
				if (mapAnimals.containsValue(arrTemp[j])) {
				} else {
					stringBuilder.append(arrTemp[j] + " ");
				}
			}
			listResults.add(stringBuilder.toString());
		}

		for (String element : listResults) {
			System.out.println(element);
		}
	}
}
