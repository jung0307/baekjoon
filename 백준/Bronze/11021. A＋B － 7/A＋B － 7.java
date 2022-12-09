import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int a;
        int b;

        for(int i = 0; i < T; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine() , " ");

            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            bw.write("Case #"+(i+1)+": "+(a+b)+"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
