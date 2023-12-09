import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split("");
        int cnt = 0;


        for(int i = 0; i < s.length; i++) {
            if(s[i].equals("I") || s[i].equals("O") || s[i].equals("S") || s[i].equals("H") || s[i].equals("Z") || s[i].equals("X") || s[i].equals("N")) {
                cnt++;
            }
        }

        if(cnt == s.length) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
