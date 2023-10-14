import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split("");

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            String ss[] = br.readLine().split(" ");

            int A = Integer.parseInt(ss[0]);
            int B = Integer.parseInt(ss[1]);

            String temp = "";

            temp = s[A];
            s[A] = s[B];
            s[B] = temp;
        }

        for(int i = 0; i < s.length; i++) {
            sb.append(s[i]);
        }

        System.out.print(sb.toString());


    }
}
