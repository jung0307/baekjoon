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
            int h = Integer.parseInt(s[0]);
            int t = Integer.parseInt(s[1]);

            for(int j = 1; j <= t; j++) {
                if(j % 4 == 0 && j % 7 != 0) {
                    h++;
                } else if (j % 7 == 0 && j % 4 != 0) {
                    h--;
                }
            }

            sb.append(h + "\n");

        }

        System.out.print(sb.toString());

    }
}