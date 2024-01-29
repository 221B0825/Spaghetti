import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();

		int[] num = new int[N];

		for (int i = 0; i < N; i++) {
			num[i] = sc.nextInt();
		}
		
		StringBuilder sb = new StringBuilder();		
		
		for (int i = 0; i < num.length; i++) {
			if(X > num[i]) {
				sb.append(num[i]+" ");
			}
		}
		
		System.out.println(sb);
	}
}