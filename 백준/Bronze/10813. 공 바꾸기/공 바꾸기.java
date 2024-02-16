
import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int N, M;

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(bf.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        // init
        int[] basket = new int[N + 1]; // index
        for (int i = 1; i < N + 1; i++) {
            basket[i] = i;
        }

        //switch
        for (int k = 0; k < M; k++) {
            st = new StringTokenizer(bf.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int temp = basket[j];
            basket[j] = basket[i];
            basket[i] = temp;
        }

        for(int i=1; i<N+1; i++){
            bw.write(basket[i]+" ");
            bw.flush();
        }
        bw.close();
    }
}