
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
            String ss[] = br.readLine().split(" ");

            int a = Integer.parseInt(s[0]);

            if(s[1].equals("C")) {
                for(int j = 0; j < ss.length; j++) {
                    sb.append((int)ss[j].charAt(0) - 64+" ");
                }
                sb.append("\n");
            }else {
                for (int j = 0; j < ss.length; j++) {
                    sb.append((char)(Integer.parseInt(ss[j]) + 64) + " ");
                }
                sb.append("\n");
            }

        }

        System.out.print(sb.toString());

    }
}
