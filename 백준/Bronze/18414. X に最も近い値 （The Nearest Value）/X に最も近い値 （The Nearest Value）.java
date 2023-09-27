import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");

        int X = Integer.parseInt(s[0]);
        int L = Integer.parseInt(s[1]);
        int R = Integer.parseInt(s[2]);

        int a = Math.abs(L - X);
        int answer = 0;

        for(int i = L; i <= R; i++) {
            int b = Math.abs(i - X);

            if(a >= b) {
                a = b;
                answer = i;
            }
        }

        System.out.println(answer);



    }
}
