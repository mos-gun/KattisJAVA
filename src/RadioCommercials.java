import java.util.ArrayList;
import java.util.Scanner;

public class RadioCommercials {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numOfBreaks, pricePerCommercial;
		String[] arrTmpListeners;
		int[] arrListeners;
		ArrayList<ArrayList<Integer>> listCombinations;
		ArrayList<Integer> listTmp;
		
		numOfBreaks = scanner.nextInt();
		pricePerCommercial = scanner.nextInt();
		scanner.nextLine();
		
		arrTmpListeners = scanner.nextLine().split(" ");
		arrListeners = new int[arrTmpListeners.length];
		for (int i = 0; i < arrTmpListeners.length; i++) {
			arrListeners[i] = Integer.parseInt(arrTmpListeners[i]);
		}
		
		listCombinations = new ArrayList<>();
		for (int i = 0; i < arrListeners.length; i++) {
			for (int j = i; j < arrListeners.length; j++) {
				listTmp = new ArrayList<>();
				for (int k = i; k < j; k++) {
					listTmp.add(arrListeners[k]);
				}
				System.out.println(listTmp);
				if(!listTmp.isEmpty()) listCombinations.add(listTmp);
			}
		}
		
		
		
//		for(int num : arrListeners) System.out.println(num);
	}
}
