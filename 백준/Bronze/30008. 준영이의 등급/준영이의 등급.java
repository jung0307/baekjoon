import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1[] = br.readLine().split(" ");
        String score[] = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(s1[0]);
        int K = Integer.parseInt(s1[1]);

        for(int i = 0; i < K; i++) {
            int int_score = Integer.parseInt(score[i]);
            int P = (int_score * 100) / N;

            if(P > 96 && P <= 100) {
                sb.append("9");
            } else if (P > 89) {
                sb.append("8");
            } else if (P > 77) {
                sb.append("7");
            } else if (P > 60) {
                sb.append("6");
            } else if (P > 40) {
                sb.append("5");
            } else if (P > 23) {
                sb.append("4");
            } else if (P > 11) {
                sb.append("3");
            } else if (P > 4) {
                sb.append("2");
            } else if (P >= 0) {
                sb.append("1");
            }

            sb.append(" ");

        }

        System.out.print(sb.toString().trim());


    }
}
