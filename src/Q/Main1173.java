package Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1173 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        int N = Integer.parseInt(s[0]); // 운동
        int m = Integer.parseInt(s[1]); // 최소맥
        int M = Integer.parseInt(s[2]); // 최대맥
        int T = Integer.parseInt(s[3]); // 맥증
        int R = Integer.parseInt(s[4]); // 맥감

        if(m + T > M) {
            System.out.println("-1");
        }else {
            int a = 0;
            int b = m; // 현재 맥박수

            while (N > 0) {
                if (b + T <= M) {
                    b = b + T;
                    a++;
                    N--;
                }else {
                    if(b - R < m) {
                        b = m;
                    }else {
                        b = b - R;
                    }
                    a++;
                }
            }

            System.out.println(a);
        }

    }
}
