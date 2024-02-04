import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int N;
    static int M;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        N = Integer.parseInt(s[0]);
        M = Integer.parseInt(s[1]);

        solution(M , "");

        System.out.print(sb.toString());

    }

    static void solution(int m , String s) {
        if(m == 0) {
            sb.append(s+"\n");
            return;
        }

        for(int i = 1; i <= N; i++) {
            solution(m - 1 , s + i + " ");
        }
    }
}
