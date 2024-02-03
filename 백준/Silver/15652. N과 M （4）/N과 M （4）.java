import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int N;
    static int M;
    static boolean v[];
    static int arr[];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        N = Integer.parseInt(s[0]);
        M = Integer.parseInt(s[1]);

        v = new boolean[N + 1];
        arr = new int[N + 1];

        for(int i = 1; i <= N; i++) {
            arr[i] = i;
        }

        solution(M , "");

    }

    static void solution(int m , String s) {
        if(m == 0) {
            System.out.println(s);
            return;
        }

        for(int i = 1; i <= N; i++) {
            if(v[i] == false) {
                solution(m - 1 , s + arr[i] + " ");
                v[i] = true;

                for(int j = i + 1; j <= N; j++) {
                    v[j] = false;
                }
            }
        }
    }
}
