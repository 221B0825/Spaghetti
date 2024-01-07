import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int hour = sc.nextInt();
		int min = sc.nextInt();
		int time = sc.nextInt();

		
		if((min + time) / 60 > 0) {
			if(hour + ((time+min) / 60) > 23) {
				System.out.println((hour+((time+min)/60)-24)+" "+((min + time)%60));
			}else {
				System.out.println(hour+((time+min)/60)+" "+((min + time)%60));
			}
		}else {
			if(hour + ((time+min) / 60) > 23) {
				System.out.println((hour+((time+min)/60)-24)+" "+(min+time));
			}else {
				System.out.println(hour+((time+min)/60)+" "+(min+time));
			}
		}
	}
}