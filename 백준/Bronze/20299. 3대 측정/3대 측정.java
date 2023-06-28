
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1[] = br.readLine().split(" ");

        int N = Integer.parseInt(s1[0]);
        int K = Integer.parseInt(s1[1]);
        int L = Integer.parseInt(s1[2]);

        int I = 0;

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++) {
            String s2[] = br.readLine().split(" ");

            int n1 = Integer.parseInt(s2[0]);
            int n2 = Integer.parseInt(s2[1]);
            int n3 = Integer.parseInt(s2[2]);

            int sum = n1 + n2 + n3;
            boolean tf= false;

            for(int j = 0; j < 3; j++) {
                if(Integer.parseInt(s2[j]) < L) {
                    tf = true;
                    break;
                }
            }

            if(tf == false) {
                if(sum >= K) {
                    I++;
                    sb.append(n1 + " " + n2 + " " + n3 + " ");
                }
            }

        }

        System.out.println(I);
        System.out.print(sb.toString());

    }
}
