import java.io.*;

public class Main {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException{

        int max = -1;
        int index = -1;
        for (int i = 1; i < 10; i++) {
            int num = Integer.parseInt(bf.readLine());
            if(num > max){
                max = num;
                index = i;
            }
        }

        bw.write(max+"\n"+index);
        bw.flush();
        bw.close();

    }
}