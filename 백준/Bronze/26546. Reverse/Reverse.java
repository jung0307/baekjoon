import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");
            int a = Integer.parseInt(s[1]);
            int b = Integer.parseInt(s[2]);
            String ss[] = s[0].split("");

            for(int j = 0; j < ss.length; j++) {
                if(!(j >= a && j < b)) {
                    sb.append(ss[j]);
                }
            }
            sb.append("\n");
        }

        System.out.print(sb.toString());
    }
}
