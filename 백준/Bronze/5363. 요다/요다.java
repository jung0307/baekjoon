import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");

            for(int j = 2; j < s.length; j++) {
                sb.append(s[j]+" ");
            }

            sb.append(s[0] + " " + s[1] + "\n");
        }

        System.out.print(sb.toString());

    }

}
