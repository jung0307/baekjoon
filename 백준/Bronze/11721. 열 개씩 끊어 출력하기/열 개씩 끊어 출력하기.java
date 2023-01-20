
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split("");
        StringBuilder sb = new StringBuilder();

        int a = 0;
        boolean tf = false;

        while (a <= s.length -1) {
            int b = a;
            while (a < b + 10) {
                if(a+1 == s.length+1) {
                    tf = true;
                    break;
                }
                sb.append(s[a++]);
            }
            if(tf == true) {
                break;
            }
            sb.append("\n");
        }

        System.out.print(sb.toString());

    }
}
