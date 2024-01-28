import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = sc.nextInt();
		int count = sc.nextInt();

		int result = 0;
		
		for(int i = 0; i<count; i++) {
			result = result+sc.nextInt()*sc.nextInt();
		}
		if(sum == result) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}