import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Datum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String day, month, date;

		day = scanner.next();
		month = scanner.nextLine().trim();
		date = day + "/" + month + "/2009";

		SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date date1 = format1.parse(date);
			DateFormat format2 = new SimpleDateFormat("EEEE");
			String finalDay = format2.format(date1);

			if (finalDay.equals("Montag")) finalDay = "Monday";
			else if (finalDay.equals("Dienstag")) finalDay = "Tuesday";
			else if (finalDay.equals("Mittwoch")) finalDay = "Wednesday";
			else if (finalDay.equals("Donnerstag")) finalDay = "Thursday";
			else if (finalDay.equals("Freitag")) finalDay = "Friday";
			else if (finalDay.equals("Samstag")) finalDay = "Saturday";
			else if (finalDay.equals("Sonntag")) finalDay = "Sunday";
			System.out.println(finalDay);
		} catch (
				ParseException e) {
			System.out.println("ParseException: " + e.getMessage());
		}
	}
}