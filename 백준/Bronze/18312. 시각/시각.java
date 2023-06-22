
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1[] = br.readLine().split(" ");

        int N = Integer.parseInt(s1[0]);
        int K = Integer.parseInt(s1[1]);
        int cnt = 0;
        int h = 0;
        int m = 0;
        int s = -1;

        String ss = "";
        String mm = "";
        String hh = "";

        while (true) {
            if(s < 59) {
                s++;
            } else {
                s = 0;
                m++;
            }

            if(m == 60) {
                m = 0;
                h++;
            }

            if(h == N+1) {
                break;
            }

            ss = s + "";
            mm = m + "";
            hh = h + "";

            if(ss.length() < 2) {
                ss = "0"+ss;
            }
            if(mm.length() < 2) {
                mm = "0"+mm ;
            }
            if(hh.length() < 2) {
                hh = "0"+hh;
            }

            if((ss).contains(K+"") || (mm).contains(K+"") || (hh).contains(K+"") ) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
