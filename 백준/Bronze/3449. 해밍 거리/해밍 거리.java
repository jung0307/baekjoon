import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            String s1[] = br.readLine().split("");
            String s2[] = br.readLine().split("");

            int cnt = 0;

            for(int j = 0; j < s1.length; j++) {
                if(!s1[j].equals(s2[j])) {
                    cnt++;
                }
            }

            sb.append("Hamming distance is " + cnt + ".\n");
        }

        System.out.print(sb.toString());

    }
}
