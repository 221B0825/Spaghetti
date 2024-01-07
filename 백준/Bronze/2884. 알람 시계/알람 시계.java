import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int hour = sc.nextInt();
		int min = sc.nextInt();

		if (min - 45 < 0) {
			if (hour - 1 < 0) {
				System.out.print((hour - 1 + 24) + " " + (min - 45 + 60));
			} else {
				System.out.print((hour - 1) + " " + (min - 45 + 60));
			}
		} else {
			if (hour - 1 < 0) {
				System.out.print((hour) + " " + (min - 45));
			} else {
				System.out.print((hour) + " " + (min - 45));
			}
		}

	}
}