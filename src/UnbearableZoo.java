import java.util.*;

public class UnbearableZoo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numOfAnimals, counterList;
		String animalName;
		String[] arrLine;
		ArrayList<String> listAnimals;
		HashMap<String, Integer> mapNameAmount;
		
		counterList = 1;
		while ((numOfAnimals = scanner.nextInt()) != 0) {
			scanner.nextLine();
			mapNameAmount = new HashMap<>();
			listAnimals = new ArrayList<>();
			for (int i = 0; i < numOfAnimals; i++) {
				arrLine = scanner.nextLine().split(" ");
				animalName = arrLine[arrLine.length - 1].toLowerCase();
				if (mapNameAmount.containsKey(animalName)) {
					mapNameAmount.put(animalName, mapNameAmount.get(animalName) + 1);
				} else {
					mapNameAmount.put(animalName, 1);
				}
			}

			for (Map.Entry<String, Integer> entry : mapNameAmount.entrySet()) {
				listAnimals.add(entry.getKey() + " | " + entry.getValue());
			}
			
			Collections.sort(listAnimals);

			System.out.println("List " + counterList++ + ":");
			for(String animal : listAnimals) System.out.println(animal);
			
		}
	}
}
