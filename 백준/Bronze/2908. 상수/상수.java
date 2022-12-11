import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        StringBuilder sb = new StringBuilder(s);
        String rs = sb.reverse().toString();
        StringTokenizer st = new StringTokenizer(rs , " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if(a > b){
            System.out.println(a);
        }else if(b > a){
            System.out.println(b);
        }
        
    }

}
