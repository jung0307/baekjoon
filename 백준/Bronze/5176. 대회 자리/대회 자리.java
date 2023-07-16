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

            int P = Integer.parseInt(s[0]);
            int M = Integer.parseInt(s[1]);

            int arrInt[] = new int[M+1];
            int cnt = 0;

            for(int j = 0; j < P; j++) {
                int a = Integer.parseInt(br.readLine());

                if(arrInt[a] == 0) {
                    arrInt[a] = 1;
                }else {
                    cnt++;
                }
            }

            sb.append(cnt+"\n");

        }

        System.out.print(sb.toString());

    }
}
