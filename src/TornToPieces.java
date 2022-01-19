import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class TornToPieces {


	public static void main(String args[])
	{
		// No of vertices
		int nodes = 0;
		Scanner scanner = new Scanner(System.in);
		nodes = scanner.nextInt();
		scanner.nextLine();

		// Adjacency list for storing which vertices are connected
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(nodes);
		for (int i = 0; i < nodes; i++) {
			adj.add(new ArrayList<Integer>());
		}

		HashMap<String, Integer> mapNodeNumber = new HashMap<String, Integer>();    // für die Pärchen
		String[][] arrAllConnections = new String[nodes][];                         // zum Einlesen der Zeilen (der Verbindungen)

		for(int i=0; i<nodes; i++) {
			arrAllConnections[i] = scanner.nextLine().split(" ");                   //jede Zeile als String Array speichern
			mapNodeNumber.put(arrAllConnections[i][0], i);
		}



//        System.out.println(mapNodeNumber);

		for(int i=0; i<arrAllConnections.length; i++) {
			for(int j=1; j<arrAllConnections[i].length; j++) {
				if(mapNodeNumber.get(arrAllConnections[i][j]) == null) {
					mapNodeNumber.put(arrAllConnections[i][j], mapNodeNumber.size());
					adj.add(new ArrayList<Integer>());
					nodes++;
//                  System.out.println(mapNodeNumber);
				}
				addEdge(adj, mapNodeNumber.get(arrAllConnections[i][0]), mapNodeNumber.get(arrAllConnections[i][j]));
//              System.out.println("edge created: " + mapNodeNumber.get(arrAllConnections[i][0]) + " -> " + mapNodeNumber.get(arrAllConnections[i][j]));
			}
		}

		//Letzte Zeile der Eingabe
		int source = 0;
		int dest = 0;
		String[] arrPath = scanner.nextLine().split(" ");
		if(!mapNodeNumber.containsKey(arrPath[0]) || !mapNodeNumber.containsKey(arrPath[1])) {
			System.out.println("no route found");
		}
		else {
			source = mapNodeNumber.get(arrPath[0]);
			dest = mapNodeNumber.get(arrPath[1]);
			printShortestPath(adj, source, dest, nodes, mapNodeNumber);
		}
	}

	private static void addEdge(ArrayList<ArrayList<Integer>> adj, int i, int j)
	{
		adj.get(i).add(j);
		adj.get(j).add(i);
	}


	private static void printShortestPath(ArrayList<ArrayList<Integer>> adj, int s, int dest, int v, HashMap<String, Integer> mapNodeNumber)
	{

		int pred[] = new int[v];
		int dist[] = new int[v];

		if (BFS(adj, s, dest, v, pred, dist) == false) {
			System.out.println("no route found");
			return;
		}

		// LinkedList to store path
		LinkedList<Integer> path = new LinkedList<Integer>();
		int crawl = dest;
		path.add(crawl);
		while (pred[crawl] != -1) {
			path.add(pred[crawl]);
			crawl = pred[crawl];
		}

		// Print path
		for (int i = path.size() - 1; i >= 0; i--) {
			for(Map.Entry<String, Integer> entry : mapNodeNumber.entrySet()){
				if( entry.getValue().equals(path.get(i)) ){
					System.out.print(entry.getKey() + " ");                     // Hier wird das Ergebnis ausgegeben
					break;
				}
			}
		}
	}

	private static boolean BFS(ArrayList<ArrayList<Integer>> adj, int src, int dest, int v, int pred[], int dist[])
	{

		LinkedList<Integer> queue = new LinkedList<Integer>();

		boolean visited[] = new boolean[v];

		for (int i = 0; i < v; i++) {
			visited[i] = false;
			dist[i] = Integer.MAX_VALUE;
			pred[i] = -1;
		}

		visited[src] = true;
		dist[src] = 0;
		queue.add(src);

		// bfs Algorithm
		while (!queue.isEmpty()) {
			int u = queue.remove();
			for (int i = 0; i < adj.get(u).size(); i++) {
				if (visited[adj.get(u).get(i)] == false) {
					visited[adj.get(u).get(i)] = true;
					dist[adj.get(u).get(i)] = dist[u] + 1;
					pred[adj.get(u).get(i)] = u;
					queue.add(adj.get(u).get(i));

					// stopping condition (when we find
					// our destination)
					if (adj.get(u).get(i) == dest)
						return true;
				}
			}
		}
		return false;
	}
}