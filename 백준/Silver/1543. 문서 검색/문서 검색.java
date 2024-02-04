import java.io.*;

// use BruteForce Search
// baekjoon # 1543
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String text = bf.readLine();
        String target = bf.readLine();

        int n = text.length();
        int m = target.length();

        int count = 0;

        for(int i = 0; i < n-m+1; i++){
            int flag = 0;
            // target length 만큼 반복해서 완전히 같은지 확인
            for(int j = 0; j < m; j++){
                if(text.charAt(i+j) == target.charAt(j)){
                    flag++;
                }
            }
            if(flag == m){
                count++;
                i = i + m - 1;
            }
        }

        bw.write(Integer.toString(count));
        bw.flush();
        bw.close();
    }
}
