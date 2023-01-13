
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for(int a = 0; a < 3; a++) {
            String s[] = br.readLine().split(" ");
            int zero = 0;
            int one = 0;

            for(int i = 0; i < s.length; i++) {
                if(s[i].equals("0")) {
                    zero++;
                }else {
                    one++;
                }
            }

            if(zero == 1 && one == 3) {
                sb.append("A\n");
            }else if(zero == 2 && one == 2) {
                sb.append("B\n");
            }else if(zero == 3 && one == 1) {
                sb.append("C\n");
            }else if(zero == 4 && one == 0) {
                sb.append("D\n");
            }else {
                sb.append("E\n");
            }
        }

        System.out.print(sb.toString());

    }
}
