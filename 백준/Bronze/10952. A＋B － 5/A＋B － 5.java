import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a;
        int b;

        while(true){

            StringTokenizer st = new StringTokenizer(br.readLine() , " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            if(a == 0 && b == 0) {
                break;
            }else {
                bw.write(Integer.toString(a+b)+"\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
