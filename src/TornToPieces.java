// Java program to find shortest path in an undirected
// graph
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class TornToPieces {

	// Driver Program
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		// No of vertices
		int nodes = scanner.nextInt();
		scanner.nextLine();

		// Adjacency list for storing which vertices are connected
		ArrayList<ArrayList<Integer>> adj =
				new ArrayList<ArrayList<Integer>>(nodes);
		for (int i = 0; i < nodes; i++) {
			adj.add(new ArrayList<Integer>());
		}

		HashMap<String, Integer> mapNodeNumber = new HashMap<>();
		
		String[][] arrAllEdges = new String[nodes][];
		for (int i = 0; i < nodes; i++) {
			arrAllEdges[i] = scanner.nextLine().split(" ");
			mapNodeNumber.put(arrAllEdges[i][0], i);
		}
		
		String[] arrPath = scanner.nextLine().split(" ");
		
//		System.out.println(mapNodeNumber);
		for (int i = 0; i < arrAllEdges.length; i++) {
			for (int j = 1; j < arrAllEdges[i].length; j++) {
				addEdge(adj, mapNodeNumber.get(arrAllEdges[i][0]), mapNodeNumber.get(arrAllEdges[i][j]));
//				System.out.println("edge created: " + mapNodeNumber.get(arrAllEdges[i][0]) + " -> " + mapNodeNumber.get(arrAllEdges[i][j]));
			}
		}
		
		// Creating graph given in the above diagram.
		// add_edge function takes adjacency list, source
		// and destination vertex as argument and forms
		// an edge between them.
//		addEdge(adj, 0, 1);
//		addEdge(adj, 1, 0);
//		addEdge(adj, 1, 2);
//		addEdge(adj, 2, 1);
		int source = 0, dest = 2;
		printShortestDistance(adj, source, dest, nodes);
	}

	// function to form edge between two vertices
	// source and dest
	private static void addEdge(ArrayList<ArrayList<Integer>> adj, int i, int j)
	{
		adj.get(i).add(j);
		adj.get(j).add(i);
	}

	// function to print the shortest distance and path
	// between source vertex and destination vertex
	private static void printShortestDistance(
			ArrayList<ArrayList<Integer>> adj,
			int s, int dest, int v)
	{
		// predecessor[i] array stores predecessor of
		// i and distance array stores distance of i
		// from s
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

		// Print distance
		System.out.println("Shortest path length is: " + dist[dest]);

		// Print path
		System.out.println("Path is ::");
		for (int i = path.size() - 1; i >= 0; i--) {
			System.out.print(path.get(i) + " ");
		}
	}

	// a modified version of BFS that stores predecessor
	// of each vertex in array pred
	// and its distance from source in array dist
	private static boolean BFS(ArrayList<ArrayList<Integer>> adj, int src,
							   int dest, int v, int pred[], int dist[])
	{
		// a queue to maintain queue of vertices whose
		// adjacency list is to be scanned as per normal
		// BFS algorithm using LinkedList of Integer type
		LinkedList<Integer> queue = new LinkedList<Integer>();

		// boolean array visited[] which stores the
		// information whether ith vertex is reached
		// at least once in the Breadth first search
		boolean visited[] = new boolean[v];

		// initially all vertices are unvisited
		// so v[i] for all i is false
		// and as no path is yet constructed
		// dist[i] for all i set to infinity
		for (int i = 0; i < v; i++) {
			visited[i] = false;
			dist[i] = Integer.MAX_VALUE;
			pred[i] = -1;
		}

		// now source is first to be visited and
		// distance from source to itself should be 0
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
// This code is contributed by Sahil Vaid