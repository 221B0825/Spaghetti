import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int count = Integer.parseInt(br.readLine());
		for (int i = count; i > 0; i--) {
			for(int j = 0; j<i-1;j++) {
				bw.write(" ");
			}
			for (int k = count; k>i-1; k--) {
				bw.write("*");
			}
			bw.write("\n");
		}
		
		bw.close();
	}
}