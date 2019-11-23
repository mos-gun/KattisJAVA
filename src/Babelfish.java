import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;

public class Babelfish {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		HashMap<String, String> mapDictionary = new HashMap<>();
		String input, output;
		String[] arrInputDict;

		while (! (input = in.readLine()).equals("")) {                              // loop for storing dict in hash map
			arrInputDict = input.split(" ");
			mapDictionary.put(arrInputDict[1], arrInputDict[0]);                        // store dict -> foreign, normal
		}

		while ((input = in.readLine()) != null) {                                      // loop for reading entered words
			output = mapDictionary.get(input);                             // retrieve english translation from dict map
			if (output == null) out.println("eh");						   // if input doesnt exist in dict, output "eh"
			else out.println(output);														  //else output: translation	
		}
		out.flush();
		out.close();
	}
}