import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1[] = br.readLine().split(" ");

        int N = Integer.parseInt(s1[0]);
        int M = Integer.parseInt(s1[1]);

        String s2[] = br.readLine().split(" ");
        int sum1 = 0;

        for(int i = 1; i <= N; i++) {

            boolean tf = false;

            for(int j = 0; j < M; j++) {
                if(i % Integer.parseInt(s2[j]) == 0) {
                    tf = true;
                    break;
                }
            }

            if(tf == true) {
                sum1 = sum1 + i;
            }

        }

        System.out.println(sum1);


    }
}
