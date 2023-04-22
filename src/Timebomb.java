import java.util.Scanner;

public class Timebomb {

    static char[][] arrZero = {
            {'*','*','*'},
            {'*',' ','*'},
            {'*',' ','*'},
            {'*',' ','*'},
            {'*','*','*'}
    };

    static char[][] arrOne = {
            {' ',' ','*'},
            {' ',' ','*'},
            {' ',' ','*'},
            {' ',' ','*'},
            {' ',' ','*'}
    };

    static char[][] arrTwo = {
            {'*','*','*'},
            {' ',' ','*'},
            {'*','*','*'},
            {'*',' ',' '},
            {'*','*','*'}
    };

    static char[][] arrThree = {
            {'*','*','*'},
            {' ',' ','*'},
            {'*','*','*'},
            {' ',' ','*'},
            {'*','*','*'}
    };

    static char[][] arrFour = {
            {'*',' ','*'},
            {'*',' ','*'},
            {'*','*','*'},
            {' ',' ','*'},
            {' ',' ','*'}
    };

    static char[][] arrFive = {
            {'*','*','*'},
            {'*',' ',' '},
            {'*','*','*'},
            {' ',' ','*'},
            {'*','*','*'}
    };

    static char[][] arrSix = {
            {'*','*','*'},
            {'*',' ',' '},
            {'*','*','*'},
            {'*',' ','*'},
            {'*','*','*'}
    };

    static char[][] arrSeven = {
            {'*','*','*'},
            {' ',' ','*'},
            {' ',' ','*'},
            {' ',' ','*'},
            {' ',' ','*'},
    };

    static char[][] arrEight = {
            {'*','*','*'},
            {'*',' ','*'},
            {'*','*','*'},
            {'*',' ','*'},
            {'*','*','*'}
    };

    static char[][] arrNine = {
            {'*','*','*'},
            {'*',' ','*'},
            {'*','*','*'},
            {' ',' ','*'},
            {'*','*','*'}
    };


    public static int getNum(char[][] input) {
        boolean isCorrect;

        isCorrect = true;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                if(input[i][j] != arrZero[i][j]) {
                    isCorrect = false;
                    break;
                }
            }
        }
        if(isCorrect) return 0;

        isCorrect = true;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                if(input[i][j] != arrOne[i][j]) {
                    isCorrect = false;
                    break;
                }
            }
        }
        if(isCorrect) return 1;

        isCorrect = true;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                if(input[i][j] != arrTwo[i][j]) {
                    isCorrect = false;
                    break;
                }
            }
        }
        if(isCorrect) return 2;

        isCorrect = true;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                if(input[i][j] != arrThree[i][j]) {
                    isCorrect = false;
                    break;
                }
            }
        }
        if(isCorrect) return 3;

        isCorrect = true;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                if(input[i][j] != arrFour[i][j]) {
                    isCorrect = false;
                    break;
                }
            }
        }
        if(isCorrect) return 4;

        isCorrect = true;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                if(input[i][j] != arrFive[i][j]) {
                    isCorrect = false;
                    break;
                }
            }
        }
        if(isCorrect) return 5;

        isCorrect = true;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                if(input[i][j] != arrSix[i][j]) {
                    isCorrect = false;
                    break;
                }
            }
        }
        if(isCorrect) return 6;

        isCorrect = true;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                if(input[i][j] != arrSeven[i][j]) {
                    isCorrect = false;
                    break;
                }
            }
        }
        if(isCorrect) return 7;

        isCorrect = true;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                if(input[i][j] != arrEight[i][j]) {
                    isCorrect = false;
                    break;
                }
            }
        }
        if(isCorrect) return 8;

        isCorrect = true;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                if(input[i][j] != arrNine[i][j]) {
                    isCorrect = false;
                    break;
                }
            }
        }
        if(isCorrect) return 9;


        return -1;
    }

    static char[][] stringToCharArray(String[] input) {
        char[][] output = new char[input.length][input[0].length()];
        for (int i = 0; i < output.length; i++) {
            output[i] = input[i].toCharArray();
        }
        return output;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int amountOfNumbers;
        String[] arrInput;
        StringBuilder resultAsString;
        int resultAsInt;
        char[][] numAsChar;
        int numAsInt;

        arrInput = new String[5];
        for (int i = 0; i < arrInput.length; i++) {
            arrInput[i] = scanner.nextLine();
        }

        resultAsString = new StringBuilder();
        if(arrInput[0].length() == 3) {
            resultAsString.append(getNum(stringToCharArray(arrInput)));
        }
        else {
            amountOfNumbers = 1 + ((arrInput[0].length() - 3) / 4);
            numAsChar = new char[5][3];

            for (int z = 0; z < amountOfNumbers; z++) {

                for (int i = 0; i < 5; i++) {
                    numAsChar[i] = arrInput[i].substring(0, 3).toCharArray();
                    if(z != amountOfNumbers -1) arrInput[i] = arrInput[i].substring(4);
                }
                numAsInt = getNum(numAsChar);
                if(numAsInt == -1) {
                    resultAsString = new StringBuilder("BOOM!!");
                    break;
                } else resultAsString.append(numAsInt);

            }
        }

        if(resultAsString.toString().equals("BOOM!!")) System.out.println("BOOM!!");
        else {
            resultAsInt = Integer.parseInt(resultAsString.toString());
            if(resultAsInt % 6 == 0) System.out.println("BEER!!");
            else System.out.println("BOOM!!");
        }

    }
}