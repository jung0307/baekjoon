
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s[] = new String[n];

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            s[i] = br.readLine();

            String s1[] = s[i].split(" ");
//            for(String a : s1) {
//                System.out.print(a);
//            }
//            System.out.println();

            for(int j = 0; j < s1.length; j++) {
                String s2[] = s1[j].split("");
                for(int l = 0; l < s2.length/2; l++) {
                    String tmp = s2[l];
                    s2[l] = s2[s2.length - 1 - l];
                    s2[s2.length - 1 - l] = tmp;
                }

                for(String b : s2) {
                    sb.append(b);
                }
                sb.append(" ");
            }

            sb.append("\n");

        }

        System.out.print(sb.toString());

    }
}
