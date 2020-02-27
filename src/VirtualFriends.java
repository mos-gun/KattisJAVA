import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Ausgewählte Probleme aus dem ACM Programming Contest  WS 2019/20
 * Problem:  virtualfriends Virtual Friends
 * Link: https://open.kattis.com/problems/virtualfriends ;
 *
 * @author Mosgun Mahdere
 * @version 1.0, 12/24/2019
 * Method : none
 * Status : Tried (Time Limit Exceeded)
 * Runtime: >1.00s (not final speed because of error)
 */
public class VirtualFriends {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int numOfCases, numOfFriendships, counterGroups, tempSmallerGroup;
		HashMap<String, Integer> mapPeople;
		HashMap<Integer, Integer> mapGroups;
		String[] arrNames;

		numOfCases = Integer.parseInt(in.readLine());
		counterGroups = 1;

		for (int i = 0; i < numOfCases; i++) {
			mapPeople = new HashMap<>();
			mapGroups = new HashMap<>();
			numOfFriendships = Integer.parseInt(in.readLine());

			for (int j = 0; j < numOfFriendships; j++) {
				arrNames = in.readLine().split(" ");

				if (! mapPeople.containsKey(arrNames[0])) {                               // add name 1, if non-existent
					mapGroups.put(counterGroups, 1);                                  // create new group with 0 members
					mapPeople.put(arrNames[0], counterGroups);                           // save new person to new group
					counterGroups++;                                                     // increment for next new group
				}

				if (! mapPeople.containsKey(arrNames[1])) {                               // add name 2, if non-existent
					mapGroups.put(counterGroups, 1);                                  // create new group with 0 members
					mapPeople.put(arrNames[1], counterGroups);                           // save new person to new group
					counterGroups++;                                                     // increment for next new group
				}

				if (mapGroups.get(mapPeople.get(arrNames[0])) >= mapGroups.get(mapPeople.get(arrNames[1]))) {
					tempSmallerGroup = mapPeople.get(arrNames[1]);

					for (Map.Entry<String, Integer> entry : mapPeople.entrySet()) {
						if (entry.getValue().equals(tempSmallerGroup)) {
							mapPeople.put(entry.getKey(), mapPeople.get(arrNames[0]));
							mapGroups.put(mapPeople.get(arrNames[0]), mapGroups.get(mapPeople.get(arrNames[0])) + 1);
						}
					}
					out.println(mapGroups.get(mapPeople.get(arrNames[0])));
				} else {
					tempSmallerGroup = mapPeople.get(arrNames[0]);

					for (Map.Entry<String, Integer> entry : mapPeople.entrySet()) {
						if (entry.getValue().equals(tempSmallerGroup)) {
							mapPeople.put(entry.getKey(), mapPeople.get(arrNames[1]));
							mapGroups.put(mapPeople.get(arrNames[1]), mapGroups.get(mapPeople.get(arrNames[1])) + 1);
						}
					}
					out.println(mapGroups.get(mapPeople.get(arrNames[1])));
				}

			}
		}
		out.flush();
		out.close();
	}
}