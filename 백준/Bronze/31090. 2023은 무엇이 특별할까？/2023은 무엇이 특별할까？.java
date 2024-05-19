import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            String s = br.readLine();
            int a = Integer.parseInt(s);
            String ss[] = s.split("");
            int b = Integer.parseInt(ss[2] + ss[3]);

            if((a + 1) % b == 0) {
                sb.append("Good\n");
            }else {
                sb.append("Bye\n");
            }

        }

        System.out.print(sb.toString());


    }
}
