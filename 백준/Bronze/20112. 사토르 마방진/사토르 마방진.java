import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s[][] = new String[n][n];

        for(int i = 0; i < n; i++) {
            String ss[] = br.readLine().split("");

            for(int j = 0; j < ss.length; j++) {
                s[i][j] = ss[j];
            }
        }

        boolean tf = false;

        for(int i = 0; i < n; i++) {
            String a = "";
            String b = "";

            for(int j = 0; j < n; j++) {
                a = a + s[i][j];
            }

            for(int j = 0; j < n; j++) {
                b = b + s[j][i];
            }

            if(!a.equals(b)) {
                tf = true;
                break;
            }
        }

        if(tf == true) {
            System.out.println("NO");
        }else {
            System.out.println("YES");
        }
        
    }
}
