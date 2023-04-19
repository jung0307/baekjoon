package Q;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main16199 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1[] = br.readLine().split(" ");
        String s2[] = br.readLine().split(" ");

        int Y1 = Integer.parseInt(s1[0]);
        int M1 = Integer.parseInt(s1[1]);
        int D1 = Integer.parseInt(s1[2]);

        int Y2 = Integer.parseInt(s2[0]);
        int M2 = Integer.parseInt(s2[1]);
        int D2 = Integer.parseInt(s2[2]);

        int a1 = 0;
        int a2 = 0;
        int a3 = 0;

        // 동일년도
        if(Y2 == Y1) {
            a1 = 0;
        }
        // 내년
        else if(Y2 > Y1) {
            if(M2 < M1) {
                a1 = Y2 - Y1 - 1;
            } else if (M2 == M1) {
                if(D2 < D1) {
                    a1 = Y2 - Y1 - 1;
                } else if (D2 == D1) {
                    a1 = Y2 - Y1;
                } else {
                    a1 = Y2 - Y1;
                }
            }else {
                a1 = Y2 - Y1;
            }
        }

        a2 = Y2 - Y1 + 1;

        a3 = Y2 - Y1;

        System.out.println(a1);
        System.out.println(a2);
        System.out.print(a3);

    }
}
