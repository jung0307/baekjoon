
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        int A = Integer.parseInt(s[0]); // 피로도
        int B = Integer.parseInt(s[1]); // 일
        int C = Integer.parseInt(s[2]); // 휴식
        int M = Integer.parseInt(s[3]); // 한계
        int N = 0; // 현재 피로량
        int W = 0; // 현재 작업량

        int T = 0;

        boolean tf = false;

        if(A > M) {
            tf = true;
        }

        while (T < 24) {
            if(N + A <= M) {
                N = N + A;
                W = W + B;
            }else {
                if(N - C <= 0) {
                    N = 0;
                }else {
                    N = N - C;
                }
            }
            T++;
        }

        if(tf == true) {
            System.out.println("0");
        }else {
            System.out.println(W);
        }

    }
}
