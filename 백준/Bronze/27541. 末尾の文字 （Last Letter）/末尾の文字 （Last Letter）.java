import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String s[] = br.readLine().split("");
        StringBuilder sb = new StringBuilder();

        if(s[s.length - 1].equals("G")) {
            for(int i = 0; i < s.length - 1; i++) {
                sb.append(s[i]);
            }
        }else {
            for(int i = 0; i < s.length; i++) {
                sb.append(s[i]);
            }
            sb.append("G");
        }

        System.out.print(sb.toString());
    }
}
