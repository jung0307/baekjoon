import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a;
        int b;
        String input = "";

        while((input = br.readLine()) != null && !input.isEmpty() ){

           StringTokenizer st = new StringTokenizer(input , " ");

                a = Integer.parseInt(st.nextToken());
                b = Integer.parseInt(st.nextToken());

            bw.write(Integer.toString(a+b)+"\n");
            
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
