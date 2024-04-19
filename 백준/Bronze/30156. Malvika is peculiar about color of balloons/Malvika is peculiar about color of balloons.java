import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            String s[] = br.readLine().split("");

            int a = 0;
            int b = 0;

            for(int j = 0; j < s.length; j++) {
                if(s[j].equals("a")) {
                    a++;
                }else {
                    b++;
                }
            }

            if(a == 0 || b == 0) {
                sb.append("0\n");
            }else {
                if(a >= b) {
                    sb.append(b +"\n");
                }else {
                    sb.append(a +"\n");
                }
            }
        }

        System.out.print(sb.toString());

    }
}
