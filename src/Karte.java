import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Karte {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> mapP = new HashMap<>();
		HashMap<String, Integer> mapK = new HashMap<>();
		HashMap<String, Integer> mapH = new HashMap<>();
		HashMap<String, Integer> mapT = new HashMap<>();
		AtomicInteger counterP = new AtomicInteger();
		AtomicInteger counterK = new AtomicInteger();
		AtomicInteger counterH = new AtomicInteger();
		AtomicInteger counterT = new AtomicInteger();
		String input;
		String[] arrInput;
		boolean duplicateExists = false;

		for (int i = 1; i <= 9; i++) {
			mapP.put("P0" + i, 1);
			mapK.put("K0" + i, 1);
			mapH.put("H0" + i, 1);
			mapT.put("T0" + i, 1);
		}

		for (int i = 10; i <= 13; i++) {
			mapP.put("P" + i, 1);
			mapK.put("K" + i, 1);
			mapH.put("H" + i, 1);
			mapT.put("T" + i, 1);
		}

		input = scanner.nextLine();

		arrInput = input.split("(?<=\\G...)");                    // regex, which splits string at every 3rd char
																		// indicated by the number of dots (...)
		for (String element : arrInput) {
			if (mapP.containsKey(element)) {
				if (mapP.get(element) == 0) {
					duplicateExists = true;
					break;
				}
				mapP.put(element, 0);
				
			} else {
				if (mapK.containsKey(element)) {
					if (mapK.get(element) == 0) {
						duplicateExists = true;
						break;
					}
					mapK.put(element, 0);

				} else {
					if (mapH.containsKey(element)) {
						if (mapH.get(element) == 0) {
							duplicateExists = true;
							break;
						}
						mapH.put(element, 0);

					} else {
						if (mapT.containsKey(element)) {
							if (mapT.get(element) == 0) {
								duplicateExists = true;
								break;
							}
							mapT.put(element, 0);

						}
					}
				}
			}

		}

		if (duplicateExists) System.out.println("GRESKA");
		else {
			counterP.set(0);
			counterK.set(0);
			counterH.set(0);
			counterT.set(0);
			
			mapP.forEach((key, value) -> {
				if (value == 1) {
					counterP.getAndIncrement();
				}
			});
			
			mapK.forEach((key, value) -> {
				if (value == 1) {
					counterK.getAndIncrement();
				}
			});
			
			mapH.forEach((key, value) -> {
				if (value == 1) {
					counterH.getAndIncrement();
				}
			});
			
			mapT.forEach((key, value) -> {
				if (value == 1) {
					counterT.getAndIncrement();
				}
			});

			System.out.println(counterP + " " + counterK + " " + counterH + " " + counterT);
		}
	}

}