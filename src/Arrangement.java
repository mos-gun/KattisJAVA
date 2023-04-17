import java.util.Scanner;

public class Arrangement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfRooms, numOfTeams, numOfTeamsPerRoom;
        int[] arrRooms;

        numOfRooms = Integer.parseInt(scanner.nextLine());
        numOfTeams = Integer.parseInt(scanner.nextLine());
        numOfTeamsPerRoom = numOfTeams/numOfRooms;
        arrRooms = new int[numOfRooms];

        for (int i = 0; i < numOfRooms; i++) {
            arrRooms[i] = numOfTeamsPerRoom;
            numOfTeams -= numOfTeamsPerRoom;
        }

        if(numOfTeams > 0) {
            for (int i = 0; i < numOfRooms; i++) {
                arrRooms[i] = arrRooms[i]+1;
                numOfTeams--;
                if(numOfTeams == 0) break;
                if(i == numOfRooms-1) i=0;
            }
        }

        for (int i = 0; i < numOfRooms; i++) {
            for(int j=0; j<arrRooms[i]; j++) System.out.print("*");
            System.out.println();
        }
    }
}
