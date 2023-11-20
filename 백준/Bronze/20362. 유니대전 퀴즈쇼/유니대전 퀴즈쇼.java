import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        String name = s[1];

        String ss[][] = new String[n][n];

        String answer = "";
        int cnt = 0;
        boolean tf = false;

        for(int i = 0; i < n; i++) {
            s = br.readLine().split(" ");

            ss[i][0] = s[0]; // 닉네임
            ss[i][1] = s[1]; // 단어

            if(s[0].equals(name)) {
                answer = s[1];
            }
        }

        for(int i = 0; i < n; i++) {

            if(ss[i][0].equals(name)) {
                tf = true;
            }

            if(tf == true) {
               break;
            }else {
                if(ss[i][1].equals(answer)) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);

    }
}
