import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


//        K 또는 k: 킹
//        P 또는 p: 폰
//        N 또는 n: 나이트
//        B 또는 b: 비숍
//        R 또는 r: 룩
//        Q 또는 q: 퀸

//        킹, 폰, 나이트, 비숍, 룩, 퀸의 기물 점수는 각각
//                $0$,
//                $1$,
//                $3$,
//                $3$,
//                $5$,
//                $9$점

        int cnt_white = 0;
        int cnt_black = 0;

        for(int i = 0; i < 8; i++) {
            String s[] = br.readLine().split("");

            for(int j = 0; j < s.length; j++) {
                if(s[j].equals("P")) {
                    cnt_white = cnt_white + 1;
                }
                else if (s[j].equals("p")) {
                    cnt_black = cnt_black + 1;
                }
                else if (s[j].equals("N")) {
                    cnt_white = cnt_white + 3;
                }
                else if (s[j].equals("n")) {
                    cnt_black = cnt_black + 3;
                }
                else if (s[j].equals("B")) {
                    cnt_white = cnt_white + 3;
                }
                else if (s[j].equals("b")) {
                    cnt_black = cnt_black + 3;
                }
                else if (s[j].equals("R")) {
                    cnt_white = cnt_white + 5;
                }
                else if (s[j].equals("r")) {
                    cnt_black = cnt_black + 5;
                }
                else if (s[j].equals("Q")) {
                    cnt_white = cnt_white + 9;
                }
                else if (s[j].equals("q")) {
                    cnt_black = cnt_black + 9;
                }
            }
        }

        System.out.println(cnt_white - cnt_black);
    }
}
