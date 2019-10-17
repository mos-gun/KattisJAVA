import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Solution for https://open.kattis.com/problems/bank
 *
 * 1. Sort all people by cash desc and time
 * 2. Until time is not exceeded
 * 		a. Take each client
 * 		b. If passed time doesn't exceed client's time then serve this client
 * 3. Sum served clients
 *
 * @author Lukasz Antkowiak (lukasz.patryk.antkowiak(at)gmail.com)
 *
 */
public class test {

	public static void main(final String[] args) {
		final Scanner io = new Scanner(System.in);

		final int n = io.nextInt();
		final int t = io.nextInt();

		final List<Person> clients = new ArrayList<Person>();

		for (int i = 0; i < n; i++) {
			clients.add(new Person(io.nextInt(), io.nextInt()));
		}

		Collections.sort(clients);

		final int[] toServe = new int[t];
		int left = t;
		int i = 0;

		while (left > 0 && i < clients.size()) {
			final Person client = clients.get(i++);

			if (client.time < t) {
				for (int j = client.time; j >= 0; j--) {
					if (toServe[j] == 0) {
						toServe[j] = client.cash;
						left--;
						break;
					}
				}
			}
		}

		int total = 0;
		for (final int tot : toServe) {
			total += tot;
		}

		System.out.println(total);

		io.close();
	}

	private static class Person implements Comparable<Person> {
		private final int cash;
		private final int time;

		public Person(final int cash, final int time) {
			this.cash = cash;
			this.time = time;
		}

		@Override
		public int compareTo(final Person o) {
			final int c = o.cash - this.cash;
			if (c != 0) {
				return c;
			}
			return o.time - this.time;
		}

		@Override
		public String toString() {
			return "[" + this.cash + "," + this.time + "]";
		}
	}
}