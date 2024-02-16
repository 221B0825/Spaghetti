
import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        boolean[] remainder = new boolean[42]; // index
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(bf.readLine());
            int divide = num % 42;
            remainder[divide] = true;
        }

        int result = 0;
        for(int i=0; i<42; i++){
            if(remainder[i]){
                result++;
            }
        }
        bw.write(Integer.toString(result));
        bw.flush();
        bw.close();
    }
}