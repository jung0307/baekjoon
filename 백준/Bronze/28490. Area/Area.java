import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int max = 0;

        for(int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");

            max = (int)Math.max(max , Integer.parseInt(s[0]) * Integer.parseInt(s[1]));
        }

        System.out.print(max);

    }

}
