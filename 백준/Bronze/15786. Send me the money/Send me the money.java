import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);


        String password[] = br.readLine().split("");

        for(int i = 0; i < M; i++) {
            String test[] = br.readLine().split("");
            boolean arr[] = new boolean[N];
            boolean tf = false;
            int idx = 0;

            for(int j = 0; j < test.length; j++) {

                if(idx == N) {
                    break;
                }

                if(password[idx].equals(test[j])) {
                    arr[idx] = true;
                    idx++;
                }
            }

            for(int j = 0; j < arr.length; j++) {
                if(arr[j] == false) {
                    tf = true;
                    break;
                }
            }

            if(tf == false) {
                sb.append("true\n");
            }else {
                sb.append("false\n");
            }
        }

        System.out.print(sb.toString());

    }
}
