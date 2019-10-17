import java.util.*;

public class SingleSourceShortestPath {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numOfNodes/*n*/, numOfEdges/*m*/, numOfQueries/*q*/, startingNodeIndex/*s*/;
		int[][] edgeField;
//		int nodes[];
		int oldNode, newNode, weight;
		String[] resultSet;
		int endnode;
		Map<Integer, Integer> nodes = new HashMap<>();


		numOfNodes = scanner.nextInt();
		numOfEdges = scanner.nextInt();
		numOfQueries = scanner.nextInt();
		startingNodeIndex = scanner.nextInt();

		edgeField = new int[numOfNodes][numOfNodes];
		resultSet = new String[numOfQueries];

		for (int i = 0; i < numOfNodes; i++) {                // no need. indices are node names, content is cost
			nodes.put(i, Integer.MAX_VALUE);
		}

		for (int i = 0; i < numOfEdges; i++) {
			oldNode = scanner.nextInt();
			newNode = scanner.nextInt();
			weight = scanner.nextInt();

			edgeField[oldNode][newNode] = weight;
		}

		for (int i = 0; i < numOfNodes; i++) {
			for (int j = 0; j < numOfNodes; j++) {
				System.out.print(edgeField[i][j] + "  ");
			}
			System.out.println();
		}

		///////////////////////////////////////////// CALC SHORTEST PATHS


//		for (int i = 0, j = 0; i < numOfNodes && j < numOfNodes; i++, j++) {
//			if (edgeField[i][j] == 0) {
//				if (j != numOfNodes - 1) {
//					System.out.print("NOP  ");
//					i--;
//				} else {
//					System.out.print("NOP  ");
//					System.out.println();
//					j = 0;
//				}
//			} else {
//				if (j != numOfNodes - 1) {
//					System.out.print("YEP  ");
//					i--;
//				} else {
//					System.out.print("YEP  ");
//					System.out.println();
//					j = 0;
//				}
//			}
//		}

		for (int i = 0; i < numOfNodes; i++) {
			for (int j = 0; j < numOfNodes; j++) {
				if (edgeField[i][j] == 0) {
					System.out.print("NOP  ");
				} else System.out.print("YEP  ");
			}
			System.out.println();
		}


		///////////////////////////////////////////// END CALC SHORTEST PATHS


//		int value = Collections.min(nodes.values());
//		System.out.println(nodes.entrySet().stream().filter(entry -> value == entry.getValue()).map(Map.Entry::getKey).findFirst().get());


//		for (int i = 0; i < numOfQueries; i++) {				// do this, once all shortest paths are calculated
//			endnode = scanner.nextInt();
//			
//			
//		}
		
		
		
		/*
		
		int[][] array = {
				
				{X,2,1,0},//0
				int weight = nodes[i];
				if((node[old] + array[old][new]) >= nodes[new])
				nodes[i] += array[j][i];
				{0,X,2,1},	//1
				{0,0,X,4},	//2
				{2,0,0,X}	//3
		};
		int pathcost = 0;
		for( int j = 0, i = s;i<n;i++){
			
			pathcost += array[j][i];
			if(i>=m)
				j++;
		}

*/

	}

}
