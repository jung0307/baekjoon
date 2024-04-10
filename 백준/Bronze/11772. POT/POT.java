import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int X = 0;

        for(int i = 0; i < n; i++) {
            String s = br.readLine();
            int num = Integer.parseInt(s.substring(0 , s.length() - 1));
            int pot = Integer.parseInt(s.substring(s.length() - 1));


            X = X + (int)Math.pow(num , pot);

        }

        System.out.println(X);

    }
}
