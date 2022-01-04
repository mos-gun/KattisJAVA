import java.util.*;

public class GrandpaBernie {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numOfTrips, numOfQueries;
		Map<String, ArrayList<Integer>> mapCountryYear;
		int inputYear;
		String inputCountry;
		ArrayList<Integer> listTemp;

		numOfTrips = Integer.parseInt(scanner.nextLine().trim());
		mapCountryYear = new HashMap<>();

		for (int i = 0; i < numOfTrips; i++) {
			inputCountry = scanner.next();
			inputYear = Integer.parseInt(scanner.next());
			scanner.nextLine();

			if (mapCountryYear.containsKey(inputCountry)) {
				listTemp = mapCountryYear.get(inputCountry);
				listTemp.add(inputYear);
				mapCountryYear.put(inputCountry, listTemp);
			} else {
				mapCountryYear.computeIfAbsent(inputCountry, k -> new ArrayList<>()).add(inputYear);
			}
		}

		numOfQueries = Integer.parseInt(scanner.nextLine().trim());
		String inputQueryCountry;
		int inputQueryOccasion;
		for (int i = 0; i < numOfQueries; i++) {
			inputQueryCountry = scanner.next();
			inputQueryOccasion = Integer.parseInt(scanner.next());
			scanner.nextLine();
			Collections.sort(mapCountryYear.get(inputQueryCountry));
			System.out.println(mapCountryYear.get(inputQueryCountry).get(inputQueryOccasion - 1));
		}
	}
}