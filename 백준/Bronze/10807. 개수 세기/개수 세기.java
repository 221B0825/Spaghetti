import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String size = sc.nextLine();
		String numLine = sc.nextLine();
		String num = sc.nextLine();

		// init
		String[] numbers = numLine.split(" ");
		int count = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i].equals(num)) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}