import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        sb.append("int a;\n");

        for(int i = 1; i <= n; i++) {

            sb.append("int ");
            for(int j = 1; j <= i; j++) {
                sb.append("*");
            }
            sb.append("ptr");
            if(i > 1) {
                sb.append(i + " = &ptr");

                if(i - 1 != 1) {
                    sb.append(i - 1);
                }

            }else {
                sb.append(" = &a");
            }

            sb.append(";\n");

        }

        System.out.print(sb.toString());

    }
}
