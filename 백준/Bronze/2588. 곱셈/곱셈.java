import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		//one's place
		System.out.println(A*(B-((B/100)*100)-((B-((B/100)*100))/10)*10));
		//ten's place
		System.out.println(A*((B-((B/100)*100))/10));
		//hundred's place
		System.out.println(A*(B/100));
		System.out.println(A*B);
		
	}

}
