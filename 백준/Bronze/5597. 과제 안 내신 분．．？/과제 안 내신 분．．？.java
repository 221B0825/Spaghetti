
import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {

        boolean[] student = new boolean[31]; // index

        for(int i=1; i<29; i++){
            int num = Integer.parseInt(bf.readLine());
            student[num] = true;
        }

        for(int i=1; i<31; i++){
            if(!student[i]){
                bw.write(i+"\n");
                bw.flush();
            }
        }
        bw.close();
    }
}