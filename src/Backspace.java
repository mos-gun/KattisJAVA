import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Ausgewählte Probleme aus dem ACM Programming Contest  WS 2019/20
 * Problem:  backspace Backspace
 * Link: https://open.kattis.com/problems/backspace ;
 *
 * @author Mosgun Mahdere
 * @version 1.0, 11/23/2019
 * Method : none
 * Status : ACCEPTED
 * Runtime: 0.23s
 */
public class Backspace {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		String input;
		StringBuilder sbInput, sbOutput;
		char[] arrInput;
		int lenOfSbInput, counter;

		input = in.readLine();
		sbInput = new StringBuilder(input);
		sbInput.reverse();
		arrInput = sbInput.toString().toCharArray();
		lenOfSbInput = arrInput.length;
		sbOutput = new StringBuilder();
		counter = 0;

		for (int i = 0; i < lenOfSbInput; i++) {
			if (arrInput[i] == '<') {
				counter += 1;
			} else {
				if (counter != 0) {
					i++;
					counter--;
					while (counter > 0 && i < lenOfSbInput) {
						if(arrInput[i] == '<') {
							i++;
							counter++;
						} else {
							i++;
							counter--;
						}
					}
					if (i >= lenOfSbInput) break;
					if (arrInput[i] == '<') {
						counter = 1;
					} else {
						sbOutput.append(arrInput[i]);
						counter = 0;
					}
				} else {
					sbOutput.append(arrInput[i]);
				}
			}
		}
		sbOutput.reverse();
		out.println(sbOutput);

		out.flush();
		out.close();
	}
}