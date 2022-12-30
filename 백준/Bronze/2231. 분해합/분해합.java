
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean tr = false;
        int vv = 0;

        for(int i = 1; i <= n; i++) {
            int m = 0;

            String s[] = (i+"").split("");
            for(int j = 0; j < s.length; j++) {
                m = m + Integer.parseInt(s[j]);
            }
            int k = i + m;

            if(i + m == n) {
                vv = i;
                tr = true;
                break;
            }
        }

        if(tr == false) {
            System.out.println("0");
        }else {
            System.out.println(vv);
        }
    }
}
